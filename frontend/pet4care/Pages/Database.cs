using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;

namespace pet4care.Pages
{
    public class Database
    {
        private static readonly string url = "https://localhost:8080";
        public static string GetConnectionToken(string pseudo, string hash)
        {
            JObject json = new JObject();
            json.Add("pseudo", pseudo);
            json.Add("hash", hash);
            var t = Task.Run(() => SendURI(new Uri(url+"/login"), new StringContent(json.ToString(), Encoding.UTF8, "application/json")));
            try
            {
                t.Wait();
                JObject response = JObject.Parse(t.Result);
                if (response["succes"].ToString().ToLower() == "oui")
                {
                    if (!Misc.IsNullOrEmpty(response["token"].ToString()))
                    {
                        return response["token"].ToString();
                    }
                }
            }catch{}
            return null;
        }

        private static async Task<string> GetURI(Uri u)
        {
            string response = null;
            using (var client = new HttpClient())
            {
                HttpResponseMessage result = await client.GetAsync(u);
                if (result.IsSuccessStatusCode)
                {
                    response = await result.Content.ReadAsStringAsync();
                }
            }
            return response;
        }

        static async Task<string> SendURI(Uri u, HttpContent c)
        {
            using (var client = new HttpClient())
            {
                HttpRequestMessage request = new HttpRequestMessage
                {
                    Method = HttpMethod.Post,
                    RequestUri = u,
                    Content = c
                };

                HttpResponseMessage result = await client.SendAsync(request);
                if (result.IsSuccessStatusCode)
                {
                    return await result.Content.ReadAsStringAsync();
                }
                else
                {
                    throw new System.ArgumentException("Connexion au serveur rejetté");
                }
            }
        }
    }
}
