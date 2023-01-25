Algoritmo sin_titulo
	Definir matriz, i, j, suma, sumaCol, columna, suma1, max, pos Como Entero
	Definir dia Como Caracter
	Dimension matriz(8,7)
	suma=0
	suma1=0
	columna=1
	sumaCol=0
	pos=0
	Para i<-0 Hasta 7 Con Paso 1 Hacer
		Para j<-0 Hasta 6 Con Paso 1 Hacer
			
			si i = 0
				matriz(i,j) = j
//				Escribir Sin Saltar "(" i ", " j ")" matriz(i,j)  ", "
				dias(matriz, i, j)
			FinSi
			
			si j = 0 y i >= 1
				matriz(i,j) = i
//			Escribir Sin Saltar "(" i ", " j ")" matriz(i,j)  ", "
				prod(matriz, i, j)
			FinSi
			
			si i >= 1 Y i <= 5 Y j >= 1 Y j <= 5 
				matriz(i,j) = Aleatorio(1,9)
//				Escribir Sin Saltar  "(" i ", " j ")" matriz(i,j)  ", "
				Escribir Sin Saltar  "   " matriz(i,j)  "   |"
				suma = suma + matriz(i,j)
			FinSi
			
			si j = 6 y i >= 1 y i <= 5
				matriz(i,j) = suma	
//				Escribir Sin Saltar "(" i ", " j ")" matriz(i,j)  ", "
				Escribir Sin Saltar " " matriz(i,j)  " |"
			FinSi
			
			si i=5 y j = 6
				Para j<-1 Hasta 6 Con Paso 1 Hacer
					Para i<-1 Hasta 7 Con Paso 1 Hacer
						si i = 1 y i < 6 y j < 6
							max = matriz(i,j)
						FinSi
						si i < 6
							suma1 = suma1 + matriz(i,j)
							
							si matriz(i,j) > max
								max = matriz(i,j)
								pos = i
//								matriz(7,j) = i
							FinSi
								
							
						SiNo
							matriz(i,j) = suma1
						FinSi
						
						si i = 7 y j >= 1 y j <= 5
							matriz(i,j) = pos
						FinSi
						
					Fin Para
					suma1=0
					pos=0
				Fin Para
				i = 5 
				j = 6
			FinSi
			
			si i = 6 y j >= 1 y j <= 6
//				Escribir Sin Saltar "(" i ", " j ")" matriz(i,j)  ", "
				Escribir Sin Saltar "   " matriz(i,j)  " | "
			FinSi
			
			si i = 7 y j >= 1 y j <= 5
				Escribir Sin Saltar "Producto " matriz(i,j) ", "
			FinSi
		Fin Para
		suma=0
		Escribir ""
	Fin Para
	
	
FinAlgoritmo

SubProceso dias(matriz, i, j)
	Segun j Hacer
		0:
			escribir Sin Saltar "|                     "
		1: 
			escribir Sin Saltar "| LUNES "
		2: 
			escribir Sin Saltar "| MARTES "
		3:
			escribir Sin Saltar "| MIERCOLES "
		4:
			escribir Sin Saltar "| JUEVES "
		5:
			escribir Sin Saltar "| VIERNES "
		6:
			escribir Sin Saltar "| TOTAL PRODUCTOS |"
	Fin Segun
FinSubProceso

SubProceso prod(matriz, i, j)
	
	Segun i Hacer
		1:
			Escribir Sin Saltar "|      PRODUCTO 1     |"
		2:
			Escribir Sin Saltar "|      PRODUCTO 2     |"
		3:
			Escribir sin saltar "|      PRODUCTO 3     |"
		4:
			Escribir Sin Saltar "|      PRODUCTO 4     |"
		5:
			Escribir Sin Saltar "|      PRODUCTO 5     |"
		6:
			Escribir Sin Saltar "|     TOTAL SEMANA    |"
		7:
			Escribir Sin Saltar "| PRODUCTO MAS VENDIDO|"
	Fin Segun
	
FinSubProceso

////Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
////productos en los 5 días hábiles de la semana. Se desea conocer:
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.
////El informe final tendrá un formato como el que se muestra a continuación: