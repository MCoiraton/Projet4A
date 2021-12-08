using System;
using System.Collections.Generic;
using pet4care.Models;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace pet4care.Pages
{
    public class ProfilModel : PageModel
    {
        public Client Toto { get; private set; }


        public void OnGet()
        {
            Animal animal = new Animal
            {
                name = "leChien",
                type="chat",
                espece="iEBVLB<LENLNLk"

            };
            Toto = new Client
            {
                Id = 0,
                Prenom = "Toto",
                Nom = "Le Testeur",
                Adresse = "Au milieu de nul part",
                Tel = "0606060606",
                Mdp = "C'estPasFaux!",
                animals = new List<Animal> {animal },
                
            };
        }
    }
}
