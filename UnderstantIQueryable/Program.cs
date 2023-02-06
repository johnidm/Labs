
using Microsoft.EntityFrameworkCore;

namespace UnderstandIQueriabel;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Starting");

        using (var context = new AppDbContext())
        {

            var tp1 = new TipoPeticionamento { Descricao = "Alegações Finais" };

            var intimacoes = new List<Intimacao> {
                new Intimacao {
                    CodigoObjeto = "2R000000005LP",
                    TipoAtoComunicacao = "Manifestação",
                    TipoMovimentoProcesso = "Ato ordinatório",
                    Peticionamento = new Peticionamento { Usuario = "ROBO", TipoPeticionamento = tp1 } },

                new Intimacao {
                    CodigoObjeto = "2R000000004OF",
                    TipoAtoComunicacao = "Intimação",
                    TipoMovimentoProcesso = "Mero expediente",
                    Peticionamento = new Peticionamento { Usuario = "MT67584", TipoPeticionamento = tp1 }},

                new Intimacao {
                    CodigoObjeto = "2R000000004S6",
                    TipoAtoComunicacao = "Intimação do MP",
                    TipoMovimentoProcesso = "Intimação",
                    },
            };

            context.AddRange(intimacoes);
            context.SaveChanges();
        }

        using (var context = new AppDbContext())
        {
            // SELECT *
            // FROM intimacoes i1
            // LEFT JOIN peticionamento p1 ON (i1.id = p1.id)
            // LEFT JOIN peticionamento p2 ON (p1.id = p2.id)
            var resultado = context.Intimacoes.Include(p => p.Peticionamento).Include(p => p.Peticionamento.TipoPeticionamento).ToList();

            foreach (var p in resultado)
            {
                Console.WriteLine($"{p.CodigoObjeto} - {p.TipoAtoComunicacao} - {p.TipoMovimentoProcesso} - {p.Peticionamento?.Usuario} - {p.Peticionamento?.TipoPeticionamento?.Descricao}");

            }
        }

    }

}