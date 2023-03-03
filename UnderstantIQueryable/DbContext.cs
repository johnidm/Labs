using Microsoft.EntityFrameworkCore;

namespace UnderstandIQueriabel;

class AppDbContext : DbContext
{
    public DbSet<TaskItem> TaskItens { get; set; }
    public DbSet<Reminder> Reminders { get; set; }
    public DbSet<ReminderType> ReminderTypes { get; set; }
    
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseInMemoryDatabase(databaseName: "DataBase");
    }
    
}