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
    public class AnimalService
    {
        private readonly string _token;
        public AnimalService (string token)
        {
            _token = token;
        }

        public List<Animal> getByProprietaire(int idProprietaire)
        {
            return JsonConvert.DeserializeObject<List<Animal>>(Database.RequestApi("/animals/proprio/"+idProprietaire, HttpMethod.Get, _token));
        }
    }


}
