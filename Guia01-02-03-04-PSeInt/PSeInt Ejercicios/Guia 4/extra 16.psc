Algoritmo sin_titulo
	Definir i, j, matriz,sumaZona, sumaVendedor, opc, zona, vendedor Como Entero
	
	Dimension matriz(7,6)
	sumaVendedor=0
	sumaZona=0
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		Para j<-0 Hasta 5 Con Paso 1 Hacer
			si i = 0 
				vendedores(j)
				matriz(i,j) = 0
			FinSi
			
			si i >= 1 y j = 0
				zonas(i)
				matriz(i,j) = 0
			FinSi
			
			si i >= 1 y i <= 5 y j >= 1 y j <= 4
				matriz(i,j) = Aleatorio(10,99)
				sumaZona = sumaZona + matriz(i,j)
//				Escribir Sin Saltar "(" i ", " j ")" matriz(i,j)
				Escribir Sin Saltar "     " matriz(i,j) "     |"
			FinSi
			
			si j = 5 y i >= 1 y i <= 5
				matriz(i,j) = sumaZona
				Escribir Sin Saltar "       " matriz(i,j) "      |"
			FinSi
			
			Mientras i = 6 y j = 5 Hacer
				Para j<-0 Hasta 5 Con Paso 1 Hacer
					Para i<-0 Hasta 6 Con Paso 1 Hacer
						
						si i >= 1 y i <= 5 y j >= 1 y j <= 5
							sumaVendedor = sumaVendedor + matriz(i,j)
						FinSi
						
						si i = 6 y j >= 1 y j <= 5
							matriz(i,j) = sumaVendedor
							Escribir Sin Saltar "    " matriz(i,j) "     |"
						FinSi
					Fin Para
					sumaVendedor=0
					Escribir Sin Saltar ""
					
				Fin Para
			Fin Mientras
			
			
			
		Fin Para
		sumaZona=0
		Escribir ""
	Fin Para
	
	Repetir
		Escribir "Ingrese una opción"
		Escribir " "
		Escribir "1 - Total de ventas de una zona determinada"
		Escribir "2 - Total de ventas de un vendedor determinado"
		Escribir "3 - Total de ventas"
		Escribir "4 - Salir del sistema"
		Escribir " "
		leer opc
		si opc <= 4 y opc >= 1
			Segun opc Hacer
				1: escribir "ingrese la zona para conocer las ventas"
					Escribir "1 - Zona Norte"
					Escribir "2 - Zona Sur"
					Escribir "3 - Zona Este"
					Escribir "4 - Zona Oeste"
					Escribir "5 - Zona Centro"
					leer zona
					Mientras zona <= 0 o zona >= 6 Hacer
						Escribir "Opcion incorrecta, vuelva a intentar"
						leer zona
					Fin Mientras
					si zona >= 1 y zona <= 5
						zo(zona, matriz)
						Escribir ""
					FinSi
					
				2:
					escribir "ingrese el vendedor para conocer la ventas"
					Escribir "1 - Vendedor 1"
					Escribir "2 - Vendedor 2"
					Escribir "3 - Vendedor 3"
					Escribir "4 - Vendedor 4"
					leer vendedor
					Mientras vendedor <= 0 o vendedor >= 5 Hacer
						Escribir "Opcion incorrecta, vuelva a intentar"
						leer vendedor
					Fin Mientras
					si vendedor >= 1 y vendedor <= 4
						ve(vendedor, matriz)
						Escribir ""
					FinSi
				3:
					Escribir "El total de ventas es de " matriz(6,5)
				4:
					Escribir "Muchas gracias por utilizar el sistema"
			Fin Segun
		FinSi
	Mientras Que opc < 1 o opc > 4 o opc <> 4
	
	
	
FinAlgoritmo

SubProceso vendedores(j)
	
	Segun j Hacer
		0:
			escribir Sin Saltar "|                |"
		1:
			escribir Sin Saltar " VENDEDOR 1 |"
		2:
			Escribir Sin Saltar " VENDEDOR 2 |"
		3:
			Escribir Sin Saltar " VENDEDOR 3 |"
		4:
			Escribir Sin Saltar " VENDEDOR 4 |"
		5:
			Escribir Sin Saltar " TOTAL POR ZONA |"
	Fin Segun
	
FinSubProceso

SubProceso zonas(i)
	
	Segun i Hacer
		1:
			Escribir Sin Saltar "|   ZONA NORTE   |"
		2:
			Escribir Sin Saltar "|   ZONA SUR     |"
		3:
			Escribir Sin Saltar "|   ZONA ESTE    |"
		4:
			Escribir Sin Saltar "|   ZONA OESTE   |"
		5:
			Escribir Sin Saltar "|   ZONA CENTRO  |"
		6:
			Escribir Sin Saltar "| TOTAL VENDEDOR |"
	Fin Segun
FinSubProceso

SubProceso zo(zona, matriz)
	
	Segun zona Hacer
		1:
			Escribir "La venta total de la zona norte es de " matriz(zona,5)
		2:
			Escribir "La venta total de la zona sur es de " matriz(zona,5)
		3:
			Escribir "La venta total de la zona este es de " matriz(zona,5)
		4:
			Escribir "La venta total de la zona oeste es de " matriz(zona,5)
		5:
			Escribir "La venta total de la zona centro es de " matriz(zona,5)
	Fin Segun
	
FinSubProceso

SubProceso ve(vendedor, matriz)
	
	Segun vendedor Hacer
		1:
			Escribir "La venta total del vendedor 1 es " matriz(6,vendedor)
		2:
			Escribir "La venta total del vendedor 2 es " matriz(6,vendedor)
		3:
			Escribir "La venta total del vendedor 3 es " matriz(6,vendedor)
		4:
			Escribir "La venta total del vendedor 4 es " matriz(6,vendedor)
	Fin Segun
FinSubProceso

////Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
////ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
////		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
////		estadísticas sobre el comportamiento de sus representantes en cada zona. Se desea hacer un
////	programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
////		a) el total de ventas de una zona introducida por teclado
////		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
////		c) el total de ventas de todos los representantes.