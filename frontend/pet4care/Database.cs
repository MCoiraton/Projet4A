using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using System.Web;
using Newtonsoft.Json.Linq;

namespace pet4care.Pages
{
    public class Database
    {
        private static readonly string url = "http://localhost:8080";
        public static string GetConnectionToken(string mail, string hash)
        {
            try
            {
                JObject json = new JObject();
                json.Add("mail", mail);
                json.Add("hash", hash);
                var t = Task.Run(() => SendURI(url+"/auth", new StringContent(json.ToString(), Encoding.UTF8, "application/json")));
                t.Wait();
                JObject response = JObject.Parse(t.Result);
                return response["token"].ToString();
            }
            catch{}
            return null;
        }

        public static string RequestApi(string path, HttpMethod method, string token, HttpContent content = null)
        {
            using (var client = new HttpClient())
            {
                HttpRequestMessage request = new HttpRequestMessage
                {
                    Method = method,
                    RequestUri = new Uri(url+path),
                    Content = content,
                };
                request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", token);
                var t = Task.Run(() => client.SendAsync(request));
                t.Wait();
                HttpResponseMessage result = t.Result;
                if (result.IsSuccessStatusCode)
                {
                    var t2 = Task.Run(() => result.Content.ReadAsStringAsync());
                    t2.Wait();
                    return t2.Result;
                }
                else
                {
                    throw new ArgumentException("Connexion au serveur rejettée");
                }
            }
        }

        static async Task<string> SendURI(string uri, HttpContent c)
        {
            using (var client = new HttpClient())
            {
                HttpRequestMessage request = new HttpRequestMessage
                {
                    Method = HttpMethod.Post,
                    RequestUri = new Uri(uri),
                    Content = c
                };

                HttpResponseMessage result = await client.SendAsync(request);
                if (result.IsSuccessStatusCode)
                {
                    return await result.Content.ReadAsStringAsync();
                }
                else
                {
                    throw new ArgumentException("Connexion au serveur rejettée");
                }
            }
        }
    }
}
