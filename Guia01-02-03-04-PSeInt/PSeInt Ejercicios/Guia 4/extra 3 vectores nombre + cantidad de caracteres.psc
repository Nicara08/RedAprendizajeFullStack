Algoritmo sin_titulo
	Definir vectorB, i, cantidad Como Entero
	Definir vectorA Como Caracter
	
	Escribir "ingrese la dimension de los vectores"
	leer cantidad
	
	Dimension vectorA(cantidad)
	Dimension vectorB(cantidad)
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir Sin Saltar "ingrese el nombre en subindice (" i ") "
		leer vectorA(i)
		
		Escribir ""
		Escribir "para el nombre ingresado en posicion (" i ") con nombre " vectorA(i) " tiene " Longitud(vectorA(i)) " de caracteres"
	Fin Para
FinAlgoritmo


////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
////	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.