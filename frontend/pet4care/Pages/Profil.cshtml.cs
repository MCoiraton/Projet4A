using System;
using System.Collections.Generic;
using pet4care.Models;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using pet4care.Services;

namespace pet4care.Pages
{
    public class ProfilModel : PageModel
    {
        public Client Client { get; private set; }
        
        public List<Animal> Animals { get; private set; }

        public IActionResult OnGet()
        {
            string token = "";
            var t = User.Claims.FirstOrDefault(x => x.Type == "Token");
            if (t == null)
                return RedirectToPage("/Login");
            token = t.Value;
            ClientService cService = new ClientService(token);
            Client = cService.GetByMail(User.Identity.Name);
            AnimalService aService = new AnimalService(token);
            Animals = aService.getByProprietaire(Client.Id);
            return Page();
        }
    }
}