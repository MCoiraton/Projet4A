namespace pet4care.Models
{
    public class Animal
    {
        public int id { get; set; }
        public int idProprietaire { get; set; }
        public string nom { get; set; }
        public string type { get; set; }
        public string description { get; set; }
    }
}
