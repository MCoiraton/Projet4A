using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Client
    {
        public int Id { get; set; }
        public String Nom { get; set; }
        public String Prenom { get; set; }
        public String Adresse { get; set; }
        public String Tel { get; set; }
        public String Mdp { get; set; }
        public List <Animal> animals { get; set; }
    }
}
