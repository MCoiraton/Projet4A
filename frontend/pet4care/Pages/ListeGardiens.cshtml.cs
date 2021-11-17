using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using pet4care.Models;

namespace pet4care.Pages
{
    public class ListeGardiensModel : PageModel
    {

        public List<Gardien> Gardiens { get; private set; }
        public void OnGet()
        {

            Client client = new Client()
            {
                Id = 0,
                Prenom = "Toto",
                Nom = "Le Testeur",
                Adresse = "Au milieu de nul part",
                Tel = "0606060606",
                Mdp = "C'estPasFaux!"
            };

            Gardiens = new List<Gardien>();
            Gardiens.Add(new Gardien() { 
                
                Id = 10,
                Prenom = "Mathis",
                Nom = "LeBG",
                Adresse = "Chez Chuck Norris",
                Tel = "Pas besoin",
                Mdp = "Stronk",
                ListAvis = new List<Avis>(),
                Status = true
            
            });
            Gardiens.Add(new Gardien()
            {

                Id = 2,
                Prenom = "Thomas",
                Nom = "BoBlond",
                Adresse = "Québec du faible",
                Tel = "0631313131",
                Mdp = "messire",
                ListAvis = new List<Avis>(),
                Status = false

            });
            Gardiens.Add(new Gardien()
            {

                Id = 6,
                Prenom = "Jimmy",
                Nom = "TacosEater",
                Adresse = "Plus chez le voisin casse-burnes",
                Tel = "0708090604",
                Mdp = "TACOSSSSSSSSSSSSSSS",
                ListAvis = new List<Avis>(),
                Status = true

            });

        }

        
    }
}
