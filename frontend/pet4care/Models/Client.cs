using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Client
    {
        public int Id { get; set; }
        public String mail { get; set; }
        public String Nom { get; set; }
        public String Prenom { get; set; }
        public String Adresse { get; set; }
        public String Tel { get; set; }
        public String Mdp { get; set; }
        public bool estGardien { get; set; }
        public int Moyenne { get; set; }
    }
}