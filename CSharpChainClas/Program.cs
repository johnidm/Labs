namespace MyApp 
{

    public class Person
    {
        public string Name = "";

        public Person Introduce(string message)
        {
            Console.WriteLine("{0} {1}", message, Name);

            return i();
        }

        private Person i()
        {
            return this;
        }

        public static Person build(string name)
        {
            var person = new Person();
            person.Name = name;
            return person;
        }

    }

    internal class Program
    {
        static void Main(string[] args)
        {

            var person = Person.build("John");
            person.Introduce("Welcome").Introduce("Bem-vindo");
        }
    }
}