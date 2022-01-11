using Newtonsoft.Json;
using pet4care.Models;
using pet4care.Pages;
using System.Net.Http;

namespace pet4care.Services
{
    public class AvisService
    {
        private readonly string _token;
        public AvisService(string token)
        {
            _token = token;
        }

        public Client GetByAuteurId(int auteur)
        {
            return JsonConvert.DeserializeObject<Client>(Database.RequestApi("/avis/auteur/" + auteur, HttpMethod.Get, _token));
        }
    }
}
