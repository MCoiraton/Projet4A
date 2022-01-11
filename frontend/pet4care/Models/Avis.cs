using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Avis
    {
        public int IdGardien { get; set; }
        public int IdAuteur { get; set; }
        public int Note { get; set; }
        public String Message { get; set; }
    }
}
