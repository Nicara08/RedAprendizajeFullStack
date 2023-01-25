Algoritmo sin_titulo
	Definir matriz, i, j, num Como Entero
	
	Escribir "ingrese el valor de la matriz cuadrada"
	leer num
	Dimension matriz(num, num)
	mat(matriz, num)
FinAlgoritmo

SubProceso mat(matriz, num)
	Definir i, j Como Entero
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-0 Hasta num-1 Con Paso 1 Hacer
			si i = j
				matriz(i,j) = 0
				Escribir Sin Saltar matriz(i,j) " "
			SiNo
				matriz(i,j) = Aleatorio(1,9)
				Escribir Sin Saltar matriz(i,j) " "
			FinSi
			
		Fin Para
		Escribir ""
	Fin Para
	
FinSubProceso

////Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
////	subproceso para imprimir la matriz.