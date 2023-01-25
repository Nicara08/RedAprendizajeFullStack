Algoritmo sin_titulo
	Definir cant, vector, i, fila, columna, matriz Como Entero
	
	Escribir "ingrese la dimension de la matriz"
	leer fila, columna
	
	Dimension matriz(fila, columna)
	i=0
	
	vec(matriz, fila, columna)
	vecA(matriz, fila, columna)
	
FinAlgoritmo

SubProceso vec(matriz, fila, columna)
	Definir i, j Como Entero
		
	Para i<-0 Hasta fila-1 Con Paso 1 Hacer
		Para j<-0 Hasta columna-1 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1, 9)
		Fin Para
		
	Fin Para
	
FinSubProceso

SubProceso vecA(matriz, fila, columna)
	Definir i, j Como Entero
	
	Para i<-0 Hasta fila-1 Con Paso 1 Hacer
		Para j<-0 Hasta columna-1 Con Paso 1 Hacer
			Escribir "el valor del subindice numero (" i ", " j ") es " matriz(i,j)
		Fin Para
		Fin Para
FinSubProceso

////Realizar un programa que rellene de números aleatorios una matriz a través de un
////subprograma y generar otro subprograma que muestre por pantalla la matriz final.