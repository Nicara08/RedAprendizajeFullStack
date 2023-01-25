Algoritmo sin_titulo
	Definir palabra Como Caracter
	
	Escribir "ingrese una palabra o frase"
	leer palabra
		
	convertirEspaciado(palabra)
	

	
FinAlgoritmo

SubProceso convertirEspaciado(palabra)
	Definir i Como Entero

	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		Escribir sin saltar Subcadena(palabra,i,i), " "
	Fin Para
	
FinSubProceso
//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.