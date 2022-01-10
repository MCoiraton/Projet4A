using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using pet4care.Models;

namespace pet4care.Pages
{
    public class ListeAvisModel : PageModel
    {
        public List<Avis> Aviss;
        public void OnGet()
        {
            Aviss = new List<Avis>();
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message= "C'est trop cool ce système, wow, j'adore ce gars en plus.C'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plusC'est trop cool ce système, wow, j'adore ce gars en plus",
                Note = 5 

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });
            Aviss.Add(new Avis()
            {
                Id = 55,
                Nom = "Thomas BoBlond",
                Message = "C'est trop cool ce système, wow, j'adore ce gars en plus.",
                Note = 5

            });


        }



    }
}
