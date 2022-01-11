using Newtonsoft.Json;
using System;

namespace pet4care.Models
{
    public class Avis
    {
        [JsonProperty("idGardien")]
        public int IdGardien { get; set; }
        [JsonProperty("idAuteur")]
        public int IdAuteur { get; set; }
        [JsonProperty("note")]
        public int Note { get; set; }
        [JsonProperty("message")]
        public String Message { get; set; }
    }
}
