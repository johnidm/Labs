unit TestHashingAberto;

interface

uses
  HashingAberto,
  Vcl.Dialogs,
  DUnitX.TestFramework;

type

  [TestFixture]
  TTestHashingAberto = class(TObject)
  strict private
    HashTable: HashingAberto.THashTable;

    function RetornaComupadorPadrao(
      const ACodigo: Integer ): HashingAberto.THashTable.TComputador;

  public
    [Setup]
    procedure Setup;
    [TearDown]
    procedure TearDown;

    //[Test]
    procedure TestInit();

    //[Test]
    procedure TestColisao();

  end;

implementation

uses
  System.SysUtils;

function TTestHashingAberto.RetornaComupadorPadrao(
  const ACodigo: Integer): HashingAberto.THashTable.TComputador;
begin

  Result.Codigo:= ACodigo;
  Result.IP:= '192.168.0.' + ACodigo.ToString();
  Result.Descricao:= 'PC MESA ' + ACodigo.ToString();
  Result.Setor:= 'LOJA';
  Result.Apontador:= nil;
end;

procedure TTestHashingAberto.Setup;
begin
  HashTable:= HashingAberto.THashTable.Create();
end;

procedure TTestHashingAberto.TearDown;
begin
  FreeAndNil( HashTable );
end;


procedure TTestHashingAberto.TestColisao;
begin

  HashTable.Adicionar( RetornaComupadorPadrao( 150 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 133 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 116 ) );


  ShowMessage( HashTable.Pesquisar(50).Descricao );
  ShowMessage( HashTable.Pesquisar(116).Descricao );
  ShowMessage( HashTable.Pesquisar(150).Descricao );

;
end;

procedure TTestHashingAberto.TestInit();
begin
  HashTable.Adicionar( RetornaComupadorPadrao( 1 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 2 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 3 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 50 ) );
  HashTable.Adicionar( RetornaComupadorPadrao( 45 ) );

  ShowMessage( HashTable.Pesquisar(50).Descricao );
  ShowMessage( HashTable.Pesquisar(9).Descricao );

  //HashTable.ImprimirComputadores();
end;

initialization
  TDUnitX.RegisterTestFixture(TTestHashingAberto);
end.
