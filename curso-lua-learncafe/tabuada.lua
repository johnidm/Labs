io.write("Tabuda: ") 
io.write("Entre com uma numero: ") n = io.read("*number")

i = 1

while (i < 10) do
  r = n * i
  io.write(string.format("%2d", n))
  
  io.write( "X ")

  io.write(string.format("%2d", i))

  io.write(" = ")

  io.write(string.format("%3d", r))

  i = i + 1
end



  
  




