using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Client
    {
        public int Id { get; private set; }
        public String Nom { get; private set; }
        public String Prenom { get; private set; }
        public String Adresse { get; private set; }
        public String Tel { get; private set; }
        public String Mdp { get; private set; }
    }
}