using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using System.Security.Claims;
using Microsoft.AspNetCore.Authentication;
using Microsoft.AspNetCore.Authentication.Cookies;

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

        public async Task<IActionResult> OnPost()
        {
            string pseudo = Request.Form["pseudo"];
            using var sha256 = SHA256.Create(); 
            string hash = BitConverter.ToString(sha256.ComputeHash(Encoding.UTF8.GetBytes(Request.Form["mdp"]))).Replace("-", "").ToLower();

            string token = Database.GetConnectionToken(pseudo, hash);
            if(token is null)
                return RedirectToPage("/Index");
            var claims = new List<Claim>
            {
                new Claim(ClaimTypes.Name, pseudo),
                new Claim(ClaimTypes.Hash, hash),
                new Claim("Token", token),
                new Claim(ClaimTypes.Authentication, "true")
            };
            var claimsIdentity = new ClaimsIdentity(claims, CookieAuthenticationDefaults.AuthenticationScheme);
            await HttpContext.SignInAsync(CookieAuthenticationDefaults.AuthenticationScheme, new ClaimsPrincipal(claimsIdentity));
            return RedirectToPage("/Index");
        }
    }
}
