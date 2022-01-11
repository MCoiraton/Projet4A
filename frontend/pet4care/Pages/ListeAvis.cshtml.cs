using System.Collections.Generic;
using System.Linq;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using pet4care.Models;
using pet4care.Services;

namespace pet4care.Pages
{
    public class ListeAvisModel : PageModel
    {
        public List<Avis> Aviss { get; private set; }
        public Client Client { get; private set; }
        public IActionResult OnGet()
        {
            int id = int.Parse(RouteData.Values["id"].ToString());
            var t = User.Claims.FirstOrDefault(x => x.Type == "Token");
            if (t == null)
                return RedirectToPage("/Login");
            string token = t.Value;
            ClientService cService = new ClientService(token);
            Client = cService.GetById(id);
            AvisService aService = new AvisService(token);
            Aviss = aService.GetByGardienId(id);
            return Page();
        }
    }
}
