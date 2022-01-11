using Newtonsoft.Json;
using pet4care.Models;
using pet4care.Pages;
using System.Collections.Generic;
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

        public List<Avis> GetByAuteurId(int auteur)
        {
            return JsonConvert.DeserializeObject<List<Avis>>(Database.RequestApi("/avis/auteur/" + auteur, HttpMethod.Get, _token));
        }
    }
}
