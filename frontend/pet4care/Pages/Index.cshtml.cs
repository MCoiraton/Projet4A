using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Newtonsoft.Json;
using pet4care.Models;
using pet4care.Services;

namespace pet4care.Pages
{
    public class IndexModel : PageModel
    {
        public List<Client> Gardiens { get; private set; }
        public string Debug { get; private set; }

        public IndexModel()
        {
            Gardiens = new List<Client>();
        }

        public IActionResult OnGet()
        {
            Avis avis = new Avis()
            {
                IdGardien = 1,
                IdAuteur =2,
                Note = 0,
                Message = "Wheeze"
            };
            Debug = JsonConvert.SerializeObject(avis);
            string token = "";
            var t = User.Claims.FirstOrDefault(x => x.Type == "Token");
            if (t == null)
                return RedirectToPage("/Login");
            token = t.Value;
            ClientService cService = new ClientService(token);
            Gardiens = cService.GetGardiens();
            return Page();
        }
    }
}