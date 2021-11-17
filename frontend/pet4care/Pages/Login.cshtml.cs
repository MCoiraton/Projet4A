using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace pet4care.Pages
{
    public class LoginModel : PageModel
    {
        public bool Erreur { get; private set; }
        public void OnGet()
        {
            if(HttpContext.Session.TryGetValue("token", out byte[] b))
            {
                string token = Encoding.UTF8.GetString(b);
                if(token == "erreur")
                {
                    Erreur = true;
                }
            }
        }

        public IActionResult OnPost()
        {
            string pseudo = Request.Form["pseudo"];
            using var sha256 = SHA256.Create(); 
            string hash = BitConverter.ToString(sha256.ComputeHash(Encoding.UTF8.GetBytes(Request.Form["mdp"]))).Replace("-", "").ToLower();

            string token = Database.GetConnectionToken(pseudo, hash);
            if(token is null)
            {
                token = "erreur";
                HttpContext.Session.Set("token", Encoding.UTF8.GetBytes(token));
                return RedirectToPage("/Login");
            }
            HttpContext.Session.Set("pseudo", Encoding.UTF8.GetBytes(pseudo));
            HttpContext.Session.Set("hash", Encoding.UTF8.GetBytes(hash));
            HttpContext.Session.Set("token", Encoding.UTF8.GetBytes(token));
            return RedirectToPage("/");
        }
    }
}
