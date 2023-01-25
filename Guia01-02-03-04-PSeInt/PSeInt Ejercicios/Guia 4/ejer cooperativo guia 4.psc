Algoritmo sin_titulo
	Definir tablero como Cadena
	Definir fila, columna, i, j Como Entero
	
	fila = 9 ; columna = 12; i=0; j=0
	Dimension tablero(fila, columna)
	
//	inicializarMatriz(tablero, fila, columna, i, j)
	
//	imprimirMatriz(tablero, fila, columna, i, j)
	
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	
	
	acomodarPalabras(tablero, fila, columna)
	imprimirMatriz(tablero, fila, columna, i, j)
	
FinAlgoritmo

SubProceso inicializarMatriz(tablero, fila, columna, i, j)
	
	Para i<-0 Hasta fila-1 Con Paso 1 Hacer
		Para j<-0 Hasta columna-1 Con Paso 1 Hacer
			tablero(i,j) = "*"
		Fin Para
	Fin Para

FinSubProceso

SubProceso imprimirMatriz(tablero, fila, columna, i, j)
	
	Para i<-0 Hasta fila-1 Con Paso 1 Hacer
		Para j<-0 Hasta columna-1 Con Paso 1 Hacer
			Escribir Sin Saltar " " tablero(i,j) " "
		Fin Para
		Escribir ""
	Fin Para	
	
FinSubProceso

SubProceso agregarPalabra(tablero, palabra, posicion)
	Definir i, j Como Entero
	
	Para i<-posicion Hasta posicion Con Paso 1 Hacer
		Para j<-0 Hasta 11 Con Paso 1 Hacer
			tablero(i,j) = Subcadena(palabra,j,j)
		Fin Para
	Fin Para
FinSubProceso

SubProceso acomodarPalabras(tablero, fila, columna)
	Definir posR, long, i, j, aux, aux2, espacio Como Entero
	aux=0; aux2=0
	
	Para i<-0 Hasta fila-1 Con Paso 1 Hacer
		Para j<-columna-1 Hasta 0 Con Paso -1 Hacer
			//			Escribir Sin Saltar tablero(i,j)
			si j = 11
				buscarR(tablero, fila, columna, posR, long, aux)
//				Escribir Sin Saltar posR, long
			FinSi
			espacio = 5 - posR
			aux2 = (long-1) + espacio
//			Escribir Sin Saltar aux2
			//			Escribir Sin Saltar "la" posR " y " long
			si aux2 < j 
				tablero(i,j) = " * "
			SiNo
				si j >= espacio
					tablero(i,j) = tablero(i,j-espacio) 
				SiNo
					tablero(i,j) = " * "
				FinSi
				
			FinSi
//			Escribir Sin Saltar tablero(i,j)
		Fin Para
		aux = aux + 1
//		aux2=0
		Escribir ""
	Fin Para
	
FinSubProceso

SubProceso buscarR(tablero, fila, columna, posR Por Referencia, long Por Referencia, aux)
	Definir i, j Como Entero
	
	posR=0; long=0
	
	Para i<-aux Hasta aux Con Paso 1 Hacer
		Para j<-0 Hasta columna-1 Con Paso 1 Hacer
			si tablero(i,j) = "r" y posR = 0
				posR = j 
//				Escribir sin saltar posR
			FinSi
			si tablero(i,j) <> ""
				long = long + 1
//				Escribir Sin Saltar long
			FinSi
			
		Fin Para
//		long=0
//		posR=0
		Escribir ""
	Fin Para
FinSubProceso
