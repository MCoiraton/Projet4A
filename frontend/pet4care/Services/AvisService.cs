using Newtonsoft.Json;
using pet4care.Models;
using pet4care.Pages;
using System.Collections.Generic;
using System.Net.Http;
using System.Text;

namespace pet4care.Services
{
    public class AvisService
    {
        private readonly string _token;
        public AvisService(string token)
        {
            _token = token;
        }

        public Avis GetByIds(int idGardien, int idAuteur)
        {
            return JsonConvert.DeserializeObject<Avis>(Database.RequestApi("/avis/auteur/" + idGardien + "/" + idAuteur, HttpMethod.Get, _token));
        }

        public List<Avis> GetByGardienId(int idGardien)
        {
            return JsonConvert.DeserializeObject<List<Avis>>(Database.RequestApi("/avis/" + idGardien, HttpMethod.Get, _token));
        }

        internal void Update(Avis avis)
        {
            //+avis.IdGardien+"/"+avis.IdAuteur
            Database.RequestApi("/avis/", HttpMethod.Post, _token, new StringContent(JsonConvert.SerializeObject(avis), Encoding.UTF8, "application/json"));
        }
    }
}
