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

        public List<Avis> GetByIds(int idGardien, int idAuteur)
        {
            return JsonConvert.DeserializeObject<List<Avis>>(Database.RequestApi("/avis/auteur/" + idGardien + "/" + idAuteur, HttpMethod.Get, _token));
        }

        public List<Avis> GetByGardienId(int idGardien)
        {
            return JsonConvert.DeserializeObject<List<Avis>>(Database.RequestApi("/avis/" + idGardien, HttpMethod.Get, _token));
        }
    }
}
