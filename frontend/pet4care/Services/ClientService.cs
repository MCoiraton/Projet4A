using Newtonsoft.Json;
using pet4care.Models;
using pet4care.Pages;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;

namespace pet4care.Services
{
    public class ClientService
    {
        private readonly string _token;
        public ClientService(string token)
        {
            _token = token;
        }

        public Client GetByMail(string mail)
        {
            return JsonConvert.DeserializeObject<Client>(Database.RequestApi("/clients/mail/" + mail, HttpMethod.Get, _token));
        }

        public List<Client> GetGardiens()
        {
            return JsonConvert.DeserializeObject<List<Client>>(Database.RequestApi("/clients/gardiens", HttpMethod.Get, _token));
        }
    }
}
