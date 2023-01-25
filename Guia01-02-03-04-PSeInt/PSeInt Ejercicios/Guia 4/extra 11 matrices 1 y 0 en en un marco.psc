Algoritmo sin_titulo
	Definir matriz, j, i Como Entero
	
	Dimension matriz(5,15)
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 14 Con Paso 1 Hacer
			si i = 0 o i = 4
				Escribir Sin Saltar 1
			SiNo
				si j = 0 o j = 14
					Escribir Sin Saltar 1
				SiNo
					Escribir Sin Saltar 0
				FinSi
			FinSi
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo




////Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
////ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
////ceros.
////Por ejemplo, nuestro matriz final debería verse así:
////	111111111111111
////	100000000000001
////	100000000000001
////	100000000000001
////	111111111111111