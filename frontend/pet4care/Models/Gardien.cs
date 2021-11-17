using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Gardien : Client
    {
        public Boolean Status { get; set; }
        public List<Avis> ListAvis { get; set; }
        // public List<DateTime> Disponibilites { get; set; }
    }
}
