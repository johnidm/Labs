unit Util.Strings.Helpers;

interface

uses
  System.StrUtils, System.SysUtils;

type
  TUtilHelperString = record helper for string
  public
    function InserirCaracterEntreLetras(const ACaractere: Char = ' '): string;
  end;

implementation

{ TUtilHelperString }


function TUtilHelperString.InserirCaracterEntreLetras(const ACaractere: Char): string;
var
  Texto: string;
  Letra: Char;
begin
  Result:= '';

  Texto:= Self; // Self � uma vari�vel interna que possiu o conte�do da string
  for Letra in Texto do
    Result:= Result + IfThen( Length(Result) > 0, ACaractere ) + Letra;
end;

end.
