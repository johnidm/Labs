object Form2: TForm2
  Left = 0
  Top = 0
  Caption = 'Uso de Matriz'
  ClientHeight = 278
  ClientWidth = 455
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object BitBtn1: TBitBtn
    Left = 288
    Top = 208
    Width = 159
    Height = 49
    Caption = 'Percorrer Matriz'
    TabOrder = 0
    Visible = False
    OnClick = BitBtn1Click
  end
  object BitBtn2: TBitBtn
    Left = 288
    Top = 8
    Width = 159
    Height = 49
    Caption = 'Pintar Celulas'
    Glyph.Data = {
      360C0000424D360C000000000000360000002800000020000000200000000100
      180000000000000C0000C40E0000C40E00000000000000000000FFFFFFFFFFFF
      FFFFFFF8F8FFEBEBFFCDCDFFAEAEFF8F8FFB7373F75757F14242EC2C2CE51616
      DC0404D50101CE0E0ECB0F0FC72525C7B7B7ECFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDCDCFF
      6868FF2D2DFF1111FF0A0AFF0505FF0101FF0808FD2020F63232F44545F05A5A
      ED7171ED6F6FEA0B0BD60000CF2626D0D1D1F4FFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF8C8CD1
      8F8FE1AFAFFCBABAFDC8C8FFD9D9FFEBEBFFF5F5FFFBFBFFFEFEFFFFFFFFFFFF
      FFFAFAFF7373F10707E17070EAF8F8FEFFFFFFFFFFFFFCFCFEF2F2FCE5E5F9E2
      E2F7D0D0F1D1D1F0E6E6F6FDFDFEFFFFFFFFFFFFFFFFFFFFFFFFB1B1DB0000B2
      1E1EABCCC9E3FAF8F8FCFCFDFDFDFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE7E7
      FF2A2AFA0000F20000EC4C4CEE6F6FEF7070EC6C6CE77575E68888E79898E8B2
      B2EBD9D9F4F1F1FAF8F8FDFEFEFFFFFFFFFFFFFFFFFFFFFFFFFF4545CD0000F2
      0000CE9691C2EEE0D6ECDBCDE8D5C8E3D1C6E1CEC6E0CABEE7D5CAFFFFFFE5E4
      FE6969FF6060FE6868FA7373F78B8BF5ADADF6D3D3F9E9E9FBF7F7FDFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFBFBFF00606EB
      7574E0FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9CAC8E8D6CCFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA399D5
      FEFCFCFFFDFCFFF5F5FFFFFFFFFFFFFFFFFFFFFFFFFFF2F2FFEAEBEDD0CDE4D0
      C9FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFECD6CC
      FFFFFDFFF2F2FFEDEDFFFEFEFFFFFFFFFFFFFFFFFFFFEAEAFFE6E5FFECEDF3D7
      D6E4CBC0FFFFFFFFFFFFE6E6F1FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE6D2CF
      FFF5F5FFF5F5FFF3F3FFFCFCFFFFFFFFFFFFFFF7F7FFE5E5FFE6E6FFE6E6FFEC
      ECF8DEDDE5C7C1C4BED62020919898C9FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE8D3D1
      FFFAFBFFFFFFFFF9F9FFFCFCFFFFFFFFFEFEFFEAEAFFE5E5FFE6E6FFE6E6FFE7
      E7FFE0DDB9A1BF1042B7000694050587AAAAD2FFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEAD4D2
      FFFFFFFFFFFFFFFBFBFFFEFEFFFFFFFFF2F2FFE6E6FFE6E6FFE6E6FFE6E6FFDC
      DAF4C0C32358C1008DFF005BDA00008C0C0C89C8C8E2FFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBD6D3
      FFFFFFFFFFFFFFFEFEFFFFFFFFF7F7FFEBEBFFE9E9FFE6E6FFE6E6FFE6E6FFD9
      D9FED1CDA792BB0A65DB008DFF004DCF00008F2C2C96D1D1E6FFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEDD9D6
      FDF9F9FFFFFFFFFAFAFFF5F5FFEFEFFFEDEDFFECECFFE9E9FFE6E6FFE6E6FFE7
      E7FFDADAFFD6CFB496B90F63D7008EFF0054D800039519198FCBCBE3FFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDFAFA
      ECD2CFFFFCFCFFF7F7FFF3F3FFF2F2FFF0F0FFEEEEFFEBEBFFE9E9FFE7E7FFE6
      E6FFE7E7FFDCDBFFD7D0BD9DBB1563D4008DFF005DDF000EA3202094D5D5E8FF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      F9F1F1F2DBDAFFFDFDFFF6F6FFF5F5FFF2F2FFF0F0FFEDEDFFECECFFE9E9FFE6
      E6FFE6E6FFE7E7FFDCDCFFDAD3C7A6BF236AD3008CFF0075F2001CB229299ADE
      DEEDFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFF3E1DFFAEEEDFFFCFCFFF6F6FFF3F3FFF2F2FFEFEFFFEEEEFFECECFFE8
      E8FFE6E6FFE7E7FFE1E1FFD4D4FFE9DCA187B30065E30093FF0071F20005A537
      379FF6F6FAFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFEFEEFD5D2FFFCFCFFF8F8FFF5F5FFF4F4FFF1F1FFF0F0FFEEEEFFEA
      EAFFE9E9FFE6E6FFD8D8FFE0D9DDBECA3124A00033CF008EFF0086FF0029C300
      009E6A6AB5FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFCF7F6F4DAD9FFFEFEFFF8F8FFF5F5FFF3F3FFF2F2FFF0F0FFEE
      EEFFEBEBFFDCDCFFE0D8DDBECA2C25A80000B40002B5004FE10087FF0057E200
      01AD0000A47979BCFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFF9EBEAF8E6E6FFFEFEFFF7F7FFF6F6FFF4F4FFF3F3FFEC
      ECFFDEDFFFE3DCDDBFCC2C25B00000BF0000C00000BA0006BD0065EE0074F600
      1BC20000AF0000A68888C3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFF6E1DFFDF2F2FFFCFCFFF6F6FFF1F1FFE8E8FFDE
      DEFFE6DEDDC2D02C25B80000C90000CA0000C50000C30000BE0022CF0072F600
      43DD0000B50000B60000A79696C9FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6DAD8FFE9E9FFE5E5FFE2E2FFE0E1FFEA
      E2DFC4D42C25C00000D30000D30000CF0000CD0000CA0000C70000C40042E100
      61EE0011C50000B90000BC0303A9A5A5D0FFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDF6F6FAD4D2FFE7E7FFE4E4FFECE7F6DE
      DE434FC90000DB0000DB0000D70000D50000D20000D00000CD0000C90011CF00
      5DED002DD70000BD0000BD0000BE1010A4D4D4E8FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFBE8E7FDDFDEFFF1ECF6E2E2556A
      D20073F60046F30000DF0000DE0000DB0000D80000D60000D40000D00000CB00
      30DC0049E60004CA0000C80000CB0000CC2F2FB3FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE8DFF4E1E0564AD5003B
      F30093FF008BFF0030F00000E40000E20000DF0000DC0000DA0000D90000DF00
      05E90041F9001EF80000FC0000FD0000FE1F1FD1FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9E4F3493DD10000F50004
      F9004BFB0090FF0084FE001FF00000E80000E60000E80000F00000F90000FF00
      00FF0017FF0033FF0002FF0000FF0000FF4949CFFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6F6FD3636DF0000FF0000FF0000
      FD0000FA003EFC008EFF0079FE0015F30000F70000FE0000FF0000FF0000FF00
      00FF0000FF0025FF0014FF0000FF0000FF6D6DD2FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDFDFE7C7CE50000F90000FF0000
      FF0000FF0000FE0036FE0091FF0083FF0056FF0024FF0005FF0000FF0000FF00
      00FF0000FF0009FF001EFF0000FF0000FD8E8ED8FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF4F4FC5A5AE30000FC0000
      FF0000FF0000FF0000FF0034FF0058FF0061FF0061FF004FFF0035FF001EFF00
      0CFF0003FF0000FF0013FF0008FF0000F7AAAAE0FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF8F8FD3F3FE80000
      FF0000FF0000FF0000FF0000FF0000FF0001FF0006FF000EFF0019FF001DFF00
      1BFF0013FF0009FF0007FF000CFF0404ECCDCDEDFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDEDEF81D1D
      ED0000FF0000FF0000FF0000FF0000FF0000FF0000FF0000FF0000FF0000FF00
      00FF0000FF0002FF0001FF0005FF0F12E4EEEEF9FFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFB9B9
      F30808F40000FF0000FF0000FF0000FF0000FF0000FE0000FE0000FD0000FC00
      00FA0000F70303F30606F00909ED3D3FDAFBFBFEFFFFFFFFFFFFFFFFFFFFFFFF
      FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
      FF8383EC0F0FE72828E83E3EE85555E86F6FEA8282EA8D8DEA9595EA9191E796
      96E7B8B8EDC5C5F0CFCFF2DBDBF5EDEDF9FFFFFFFFFFFFFFFFFF}
    TabOrder = 1
    OnClick = BitBtn2Click
  end
  object StringGrid1: TStringGrid
    Left = 8
    Top = 8
    Width = 274
    Height = 249
    ColCount = 4
    DefaultColWidth = 40
    DefaultRowHeight = 40
    FixedCols = 0
    FixedRows = 0
    TabOrder = 2
  end
end