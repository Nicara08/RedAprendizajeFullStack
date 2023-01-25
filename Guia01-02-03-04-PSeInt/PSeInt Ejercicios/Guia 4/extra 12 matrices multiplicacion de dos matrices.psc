Algoritmo sin_titulo
	Definir matrizA, matrizB, matrizC, i, j Como Entero
	
	Dimension matrizA(3,3)
	Dimension matrizB(3,3)
	Dimension matrizC(3,3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matrizA(i,j) = Aleatorio(1,9)
			matrizB(i,j) = Aleatorio(1,9)
			Escribir "matriz A subindice (" i ", " j ") con valor " matrizA(i,j) "multiplicando matriz B subindice (" i ", " j ") con valor " matrizB(i,j)
			matrizC(i,j) = matrizA(i,j) * matrizB(i,j)
			Escribir "el resultado de la multiplicacion es " matrizC(i,j)
		Fin Para
	Fin Para
FinAlgoritmo



////Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
////Inicialice las matrices para evitar el ingreso de datos por teclado.