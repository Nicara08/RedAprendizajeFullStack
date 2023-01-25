Algoritmo sin_titulo
	Definir n, m, matriz, i, j Como Entero
	
	Escribir "ingrese la dimension de la matriz"
	leer n, m
	
	Dimension matriz(n,m)
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,100)
			Escribir Sin Saltar matriz(i,j) " "
		Fin Para
		Escribir " "
	Fin Para
	
	Escribir " "
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz(j,i) " "
		Fin Para
		Escribir " "
	Fin Para
	
	Escribir ""
	
	Para j<-0 Hasta m-1 Con Paso 1 Hacer
		Para i<-0 Hasta n-1 Con Paso 1 Hacer
			Escribir Sin Saltar matriz(i,j) " "
		Fin Para
		Escribir " "
	Fin Para
	
FinAlgoritmo



////Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
////con números aleatorios entre 1 y 100 y mostrar su traspuesta.
////¿Qué es una Matriz Traspuesta?
////La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por
////columnas (o viceversa).
////Matriz A = è Matriz B =
////Ejemplo: Obsérvese, por ejemplo, que la primera fila de la matriz A es (1,0,4). Esta fila es la
////	primera columna de su matriz traspuesta.