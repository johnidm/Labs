namespace CSharpInheritedComposition
{

    public class Logger
    {
        public void Log(string message)
        {
            Console.WriteLine("Logging: " + message);
        }
    }

    public class LoggerConsole : Logger
    {
        public void SetCmdLog(int type)
        {
            Console.WriteLine("SetCmd: " + type);
        }
    }

    public class Migration
    {

        private readonly LoggerConsole _logger;

        public Migration(LoggerConsole logger)
        {
            _logger = logger;
        }

        public void Migrate()
        {
            _logger.Log("---> Migrate");
        }
    }

    public class Installer
    {
        private readonly LoggerConsole _logger;

        public Installer(LoggerConsole logger)
        {
            _logger = logger;
        }

        public void Install()
        {
            _logger.Log("---> Install");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            LoggerConsole logger = new LoggerConsole();

            Migration migration = new Migration(logger);

            Installer installer = new Installer(logger);

            migration.Migrate();
            installer.Install();
        }
    }
}
