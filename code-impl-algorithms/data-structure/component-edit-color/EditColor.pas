unit EditColor;
{
procedure CMEnter(var Msg: TMessage); message CM_ENTER;
procedure CMExit(var Msg: TMessage); message CM_EXIT;
}

interface

uses
  System.SysUtils, System.Classes, Vcl.Controls, Vcl.StdCtrls, Vcl.Graphics,
  Winapi.Messages, System.Types, Winapi.Windows;

type
  TJohniEdit = class(TEdit)
  private
    FCorDaBorda: TColor;
  published
    property CorDaBorda: TColor read FCorDaBorda write FCorDaBorda;

    constructor Create(AOwner: TComponent); override;
  private
    procedure MessagePaint(var Msg: TMessage); message WM_NCPAINT;
    procedure SetBorder(AColor: TColor);
    procedure PaintEdit(DC: HDC; ARect: TRect; EColor, BColor: TColor);
  end;

procedure Register;

implementation

procedure Register;
begin
  RegisterComponents('Componente do Johni', [TJohniEdit]);
end;

{ TJohniEdit }

constructor TJohniEdit.Create(AOwner: TComponent);
begin
  inherited;
  FCorDaBorda := clGreen;
end;

procedure TJohniEdit.MessagePaint(var Msg: TMessage);
var
  DC: HDC;
  Rect: TRect;
begin
  DC := GetWindowDC(Handle);
  try
    Winapi.Windows.GetClientRect(Handle, Rect);
    PaintEdit(DC, Rect, clWindow, clBlue);
  finally
    ReleaseDC(Handle, DC);
  end;

end;

procedure TJohniEdit.PaintEdit(DC: HDC; ARect: TRect; EColor, BColor: TColor);
begin
  InflateRect(ARect, 4, 4);
  Brush.Color := EColor;
  Winapi.Windows.FillRect(DC, ARect, Brush.Handle);
  SetBorder(FCorDaBorda);
end;

procedure TJohniEdit.SetBorder(AColor: TColor);
var
  Canvas: TCanvas;
begin
  Canvas := TCanvas.Create;
  try
    Canvas.Handle := GetWindowDC(Handle);
    Canvas.Pen.Style := psSolid;
    Canvas.Pen.Color := AColor;
    Canvas.Pen.Width := 1;
    Canvas.Brush.Style := bsClear;
    Canvas.Rectangle(0, 0, Width, Height);
  finally
    ReleaseDC(Handle, Canvas.Handle);
    Canvas.Free;
  end;
end;

end.
