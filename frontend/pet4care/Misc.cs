using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace pet4care.Pages
{
    public class Misc
    {
        public static bool IsNullOrEmpty(string str)
        {
            if (str is null)
                return true;
            foreach (char c in str)
                if (c != ' ')
                    return false;
            return true;
        }
    }
}
