Algoritmo sin_titulo
	Definir cantidad, contador Como Numerica
	Definir palabra, pal2 Como Caracter
	
	
	Escribir "ingrese una palabra"
	leer palabra
	
	cantidad = Longitud(palabra)
	pal2 = Subcadena(palabra,0,0)
	contador = -1

	Para cantidad<-0 Hasta cantidad-1 Con Paso 1 Hacer
		contador = contador + 1
		Escribir Sin Saltar Subcadena(palabra,contador,contador) " "
	Fin Para
	
	
FinAlgoritmo

//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
//de la función Subcadena().
//NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la operación
//"escribir" escribimos "sin saltar". Por ejemplo:
//Escribir sin saltar "Hola, "
//Escribir sin saltar "cómo estás?"
//Imprimirá por pantalla: Hola, cómo estás?