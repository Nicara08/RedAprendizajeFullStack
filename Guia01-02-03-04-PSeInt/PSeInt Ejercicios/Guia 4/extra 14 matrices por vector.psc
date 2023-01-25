Algoritmo sin_titulo
	Definir matriz, vector, i, j, suma Como Entero
	
	Dimension vector(3)
	Dimension matriz(3,3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		vector(i) = Aleatorio(1,9)
		Escribir Sin Saltar "(" i ") " vector(i) " "
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,9)
			Escribir Sin Saltar "(" i ", " j ") " matriz(i,j) " "	
		Fin Para
		Escribir ""
	Fin Para
	Escribir ""
	suma=0
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			si j < 2
				Escribir Sin Saltar "(" j ") " vector(j) " x (" i ", " j ") " matriz(i,j) " + " 
				suma = vector(j) * matriz(i,j) + suma
				
			SiNo
				suma = suma + (vector(j) * matriz(i,j))
				escribir Sin Saltar "(" j ") " vector(j) " x (" i ", " j ") " matriz(i,j) " = " suma
			FinSi
			
		Fin Para
		suma=0
		Escribir ""
	Fin Para
FinAlgoritmo



////Realizar un programa que permita visualizar el resultado del producto de una matriz de
////enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
////inicializarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se
////realiza la multiplicación entre matrices consultar el siguiente link:
////https://es.wikibooks.org/wiki/%C3%81lgebra_Lineal/Matriz_por_vector