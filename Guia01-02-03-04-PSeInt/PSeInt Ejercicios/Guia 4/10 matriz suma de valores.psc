Algoritmo sin_titulo
	Definir n, m, matriz Como Entero
	
	Escribir "ingrese la dimension de la matriz"
	leer n, m
	
	Dimension matriz(n,m)
	
	mat1(matriz, n, m)
	mat2(matriz, n, m)
FinAlgoritmo

SubProceso mat1(matriz, n, m)
	Definir i, j Como Entero
	
	Para n<-0 Hasta n-1 Con Paso 1 Hacer
		Para m<-0 Hasta m-1 Con Paso 1 Hacer
			matriz(n,m) = Aleatorio(1,10)
			Escribir Sin Saltar matriz(n,m) ", "
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso mat2(matriz, n, m)
	Definir suma, i, j, matrizC como entero
	
	Dimension matrizC(n,m)
	suma=0
	
	Para n<-0 Hasta n-1 Con Paso 1 Hacer
		Para m<-0 Hasta m-1 Con Paso 1 Hacer
			suma = suma + matriz(n,m)
			matrizC(n,m) = suma
			Escribir "la suma de los elementos es " suma
			
		Fin Para
		Escribir " "
	Fin Para
	
	
	Para n<-0 Hasta n-1 Con Paso 1 Hacer
		Para m<-0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar matrizC(n,m) " "
		Fin Para
		Escribir  " "
	Fin Para
	
FinSubProceso


////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
////subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
////los resultados por pantalla.