using Microsoft.EntityFrameworkCore;

namespace UnderstandIQueriabel;

class AppDbContext : DbContext
{
    public DbSet<Intimacao> Intimacoes { get; set; }
    public DbSet<Peticionamento> Peticionamentos { get; set; }

    public DbSet<TipoPeticionamento> TiposPeticionamento { get; set; }
    
    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseInMemoryDatabase(databaseName: "DataBase");
    }
    
}