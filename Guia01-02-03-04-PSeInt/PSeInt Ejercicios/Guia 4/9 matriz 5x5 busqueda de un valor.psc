Algoritmo sin_titulo
	Definir i, j, vector, num, contador Como Entero
	
	Dimension vector(5,5)
	Escribir "ingrese un numero para corroborar si se encuentra dentro de la matriz"
	leer num
	contador=0
	
	Para i<-0 Hasta 5-1 Con Paso 1 Hacer
		Para j<-0 Hasta 5-1 Con Paso 1 Hacer
			vector(i,j) = Aleatorio(1,10)
			si num = vector(i,j)
				Escribir "el numero ingresado se encuentra dentro de la matriz en la posicon" "(" i ", " j ")"
				contador = contador + 1
			FinSi
		Fin Para
	Fin Para
	
	si contador=0
		Escribir "el numero ingresado no se encuentra en la matriz"
	FinSi
FinAlgoritmo


////Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
////coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
////caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.