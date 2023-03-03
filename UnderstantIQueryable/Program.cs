
using Microsoft.EntityFrameworkCore;

namespace UnderstandIQueriabel;

class Program
{
    static void Main(string[] args)
    {
        using (var context = new AppDbContext())
        {
            
            var email = new ReminderType { Label = "email" };
            var whatsapp = new ReminderType { Label = "WhatsApp" };

            var tasks = new List<TaskItem> {
                new TaskItem {
                    Title = "Schedule English Lesson",
                    Reminder = new Reminder { Date = DateTime.Now.AddHours(4), ReminderType = email },
                },

                new TaskItem {
                    Title = "Go to the Supermarket",
                    Reminder = new Reminder { Date = DateTime.Now.AddDays(2), ReminderType = whatsapp },
                },

                new TaskItem {
                    Title = "Meeting with Develoiper Team"
                },
            };

            context.AddRange(tasks);
            context.SaveChanges();
        }

        using (var context = new AppDbContext())
        {
            
            // SELECT *
            // FROM TaskItem t1
            // LEFT JOIN Reminder r1 ON (t1.id = r1.id)
            // LEFT JOIN ReminderType r2 ON (r1.id = r2.id)
            var resultado = context.TaskItens.Include(p => p.Reminder).ThenInclude(p => p.ReminderType).ToList();

            foreach (var p in resultado)
            {
                Console.WriteLine($"{p.Title} - {p.Reminder?.Date} - {p.Reminder?.ReminderType?.Label}");

            }
        }

    }

}