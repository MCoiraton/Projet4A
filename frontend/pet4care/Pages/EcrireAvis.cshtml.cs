using System;
using System.Linq;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using pet4care.Models;
using pet4care.Services;

namespace pet4care.Pages
{
    public class EcrireAvisModel : PageModel
    {
        public Avis Avis {get; set; }
        public Client Client { get; private set; }
        public IActionResult OnGet()
        {
            int idGardien = int.Parse(RouteData.Values["id"].ToString());
            var t = User.Claims.FirstOrDefault(x => x.Type == "Token");
            if (t == null)
                return RedirectToPage("/Login");
            string token = t.Value;
            ClientService cService = new ClientService(token);
            Client = cService.GetByMail(User.Identity.Name);
            AvisService aService = new AvisService(token);
            try
            {
                Avis = aService.GetByIds(idGardien, Client.Id);
            }catch(ArgumentException)
            {
                Avis = new Avis()
                {
                    IdGardien = idGardien,
                    IdAuteur = Client.Id,
                    Note = 0,
                    Message = ""
                };
            }
            return Page();
        }

        public IActionResult OnPost()
        {
            var t = User.Claims.FirstOrDefault(x => x.Type == "Token");
            if (t == null)
                return RedirectToPage("/Login");
            string token = t.Value;

            ClientService cService = new ClientService(token);
            Client = cService.GetByMail(User.Identity.Name);
            AvisService aService = new AvisService(token);

            Avis avis = new Avis()
            {
                IdGardien = int.Parse(Request.Form["idGardien"]),
                IdAuteur = Client.Id,
                Note = int.Parse(Request.Form["note"]),
                Message = Request.Form["message"].ToString() ?? "Oui"
            };

            aService.Update(avis);

            return RedirectToPage("/Index");
        }
    }
}
