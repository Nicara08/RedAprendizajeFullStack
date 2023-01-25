Algoritmo sin_titulo
	Definir matriz, palabra Como Caracter
	Definir aux, i, j, long Como Entero
	
	Dimension matriz(3,3)
	

	
	Repetir
		Escribir "ingrese una palabra de 9 caracteres"
		leer palabra
		
		palabra = Mayusculas(palabra)
		
		aux = Longitud(palabra)
		
	Mientras Que aux <> 9
	
	long = 0
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = Subcadena(palabra, long, long)
			long = long + 1
		Fin Para
	Fin Para
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz(i,j)
		Fin Para
		Escribir " "
	Fin Para
	
FinAlgoritmo


////. Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
////encontrando la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////		H A B
////		I L I
////		D A D
////	Nota: recordar el uso de la función Subcadena().
