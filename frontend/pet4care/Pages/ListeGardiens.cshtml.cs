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
            getListGardiens();

        }

        public void OnPost()
        {
            string nom = Request.Form["nom"];
            string prenom = Request.Form["prenom"];
            string ville = Request.Form["ville"];
            getListGardiensFiltered(nom,prenom,ville);
        }
        
        private void getListGardiens()
        {
            Gardiens = new List<Gardien>();
            Gardiens.Add(new Gardien()
            {

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

        private void getListGardiensFiltered(string nom, string prenom, string ville)
        {
            Gardiens = new List<Gardien>();
            Gardiens.Add(new Gardien()
            {

                Id = 20,
                Prenom = "sasn",
                Nom = "undertal",
                Adresse = "hav bad tiem",
                Tel = "du du du du",
                Mdp = "he",
                ListAvis = new List<Avis>(),
                Status = true

            });

        }
        
    }
}
