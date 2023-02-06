namespace UnderstandIQueriabel;

public class Intimacao
{
    public int IntimacaoId { get; set; }
    public string TipoAtoComunicacao { get; set; }
    public string CodigoObjeto { get; set; }
    public string TipoMovimentoProcesso { get; set; }

    public int? PeticionamentoId { get; set; }
    public Peticionamento Peticionamento { get; set; }
}

public class Peticionamento
{
    public int PeticionamentoId { get; set; }
    public string Usuario { get; set; }

    public Intimacao Intimacao { get; set; }

    public int TipoPeticionamentoId { get; set; }

    public TipoPeticionamento TipoPeticionamento { get; set; }

}

public class TipoPeticionamento 
{
    public int TipoPeticionamentoId { get; set; }
    public string Descricao { get; set; }
}
