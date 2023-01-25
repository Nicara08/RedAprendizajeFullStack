Algoritmo sin_titulo
	Definir matriz, i, j, num, suma, suma2, sumaAux, sumaD, contador, contadorD Como Entero
	
	Escribir "ingrese la dimension de la matriz cuadrada"
	leer num
	
	Dimension matriz(num,num)
	
	suma=0
	sumaAux=0
	contador=1
	contadorD=0
	sumaD=0
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-0 Hasta num-1 Con Paso 1 Hacer
			Repetir
				Escribir Sin Saltar "ingrese el valor del subidice (" i ", " j ")"
				leer matriz(i,j)
			Mientras Que matriz(i,j) <= 0 O matriz(i,j) > 9
			
		Fin Para
	Fin Para
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-0 Hasta num-1 Con Paso 1 Hacer
			Escribir matriz(i,j) Sin Saltar
		Fin Para
		Escribir ""
	Fin Para
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-0 Hasta num-1 Con Paso 1 Hacer
			si i = 0
				suma = suma + matriz(i,j)				
			SiNo
				sumaAux = matriz(i,j) + sumaAux
				si sumaAux = suma
					contador = contador + 1
					sumaAux=0
				FinSi
				
			FinSi
			si i = j
				sumaD = sumaD + matriz(i,j)
			FinSi
			si sumaD = suma Y i = num-1
				contadorD = contadorD + 1
				sumaD=0
			FinSi
			
		Fin Para
	Fin Para
	
	Escribir ""
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-num-1 Hasta 0 Con Paso -1 Hacer
			Escribir matriz(i,j) Sin Saltar
		Fin Para
		Escribir ""
	Fin Para
	contador = contador + 1
	suma2=0
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-num-1 Hasta 0 Con Paso -1 Hacer
			si i = 0
				suma2 = suma2 + matriz(i,j)				
			SiNo
				sumaAux = matriz(i,j) + sumaAux
				si sumaAux = suma2 Y suma2 = suma
					contador = contador + 1
					sumaAux=0
				FinSi
				
			FinSi
			si i = j
				sumaD = sumaD + matriz(i,j)
			FinSi
			si sumaD = suma Y i = num-1
				contadorD = contadorD + 1
				sumaD=0
			FinSi
			
		Fin Para
	Fin Para

	
	si contador = num*2 Y contadorD = 2
		Escribir "la matriz es magica!"
		Escribir "la suma de cada fila, columnas y diagonales es de " suma
	FinSi
	
//	Escribir contador, contadorD
	
	
FinAlgoritmo



////Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////Por ejemplo:
////	2 7 6
////	9 5 1
////	4 3 8
////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
////	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
////			sea mágica escribir la suma. Además, el programa deberá comprobar que los números
////			introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
////			matriz que no debe superar orden igual a 10.