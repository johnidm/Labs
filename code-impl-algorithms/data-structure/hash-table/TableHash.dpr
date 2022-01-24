program TableHash;

uses
  Vcl.Forms,
  FrmPrincipal in 'FrmPrincipal.pas' {Form10},
  HashingFechado in 'HashingFechado.pas',
  HashingAberto in 'HashingAberto.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm10, Form10);
  Application.Run;
end.
