using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Models
{
    public class Avis
    {
        public int Id { get; set; }
        public String Nom { get; set; }
        public String Message { get; set; }

        private int _note;
        public int Note
        {
            get => _note;
            set
            {
                if ((value >= 0) && (value <= 5))
                {
                    _note = value;
                }
            }
        }


    }
}
