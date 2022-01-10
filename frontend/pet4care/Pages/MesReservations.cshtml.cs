using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace pet4care.Pages
{
    public class MesReservationsModel : PageModel
    {
        public void OnGet()
        {
        }

        public void OnPost()
        {
            string message = Request.Form["message"];
            int note = Int16.Parse(Request.Form["note"]);
        }
    }
}
