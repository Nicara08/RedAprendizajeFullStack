Algoritmo sin_titulo
	Definir i, j, venta, suma, suma1, matriz, max1, pos1 Como Entero
	
	
	Dimension matriz(8,7)
	suma=0
	suma1=0
	max1=0
	
	
	
	Para i<-0 Hasta 7 Con Paso 1 Hacer
		Para j<-0 Hasta 6 Con Paso 1 Hacer
			si i >= 1 Y i <= 5 y j > 0 y j < 6
				matriz(i,j) = Aleatorio(1,9)
				
//						Escribir "la venta del producto N° " i " correspondiente al dia " matriz(0,j) " fue de " matriz(i,j)
				suma = matriz(i,j) + suma
				Escribir Sin Saltar matriz(i,j) " "
				
			SiNo
				si i >= 1 Y i <= 5 y j = 6
					matriz(i,j) = suma
					Escribir Sin Saltar matriz(i,j)
					
//								Escribir matriz(i,j)
					suma=0
					
				FinSi
			FinSi
		Fin Para
		Escribir ""
	Fin Para
	
	Para j<-0 Hasta 6 Con Paso 1 Hacer
		Para i<-0 Hasta 7 Con Paso 1 Hacer
			si j >= 1 y j <= 5 y i >= 1 y i <= 5
				//				Escribir Sin Saltar matriz(j,i) ", "
				suma = matriz(i,j) + suma
			SiNo
				si j >= 1 Y j <= 5 y i = 6
					matriz(i,j) = suma
					//					Escribir "la venta total de los productos del dia " j " es igual a " matriz(i,j)
					suma=0
				FinSi
			FinSi
			
			
			
		Fin Para
	Fin Para
	
	Para i<-0 Hasta 7 Con Paso 1 Hacer
		Para j<-0 Hasta 6 Con Paso 1 Hacer
			si i = 0 Y j = 0
				escribir sin saltar "|                      |"
				matriz(i,j) = 0
			SiNo
				si i = 0 Y j = 1
					escribir sin saltar " LUNES |"
					matriz(i,j) = 0
				SiNo
					si i = 0 Y j = 2
						escribir sin saltar " MARTES |"
						matriz(i,j) = 0
					SiNo
						si i = 0 Y j = 3
							escribir sin saltar " MIERCOLES |"
							matriz(i,j) = 0
						SiNo
							si i = 0 Y j = 4
								escribir sin saltar " JUEVES |"
								matriz(i,j) = 0
							SiNo
								si i = 0 Y j = 5
									escribir Sin Saltar " VIERNES |"
									matriz(i,j) = 0
								SiNo
									si i = 0 Y j = 6
									escribir sin saltar " TOTAL DE PRODUCTO |"
									matriz(i,j) = 0
								FinSi
							FinSi
						FinSi
					FinSi
					
						
							
					FinSi
				FinSi
			FinSi
			si j = 0 Y i >= 1 Y i <= 5
				escribir sin saltar "|      PRODUCTO " i "      |"
				matriz(i,j) = 0
			SiNo
				si j = 0 Y i = 6
					escribir sin saltar "|      TOTAL SEMANA    |"
					matriz(i,j) = 0
				SiNo
					si j=0 Y i = 7
						escribir sin saltar "| PRODUCTO MAS VENDIDO |"
						matriz(i,j) = 0
					FinSi
				FinSi
				
			FinSi
			si i >= 1 Y i <= 5 y j > 0 y j < 6
				Escribir Sin Saltar"  " matriz(i,j) "    |  "
				//				Escribir "la venta del producto N° " i " correspondiente al dia " matriz(0,j) " fue de " matriz(i,j)
				suma = matriz(i,j) + suma
				
			SiNo
				si i >= 1 Y i <= 5 y j = 6
					matriz(i,j) = suma
					Escribir Sin Saltar matriz(i,j) 
					//					Escribir matriz(i,j)
					suma=0
					
				FinSi
			FinSi
			si i = 6 y j = 1
				Escribir Sin Saltar "  " matriz(i,j) "   |"
			SiNo
				si i = 6 y j >= 2 y j <= 5
					Escribir Sin Saltar "    " matriz(i,j) "   |"
				FinSi
			FinSi
			
			si i = 6 Y j >= 1 y j <= 5
				suma1 = suma1 + matriz(i,j)
			SiNo
				si i = 6 y j = 6
					matriz(i,j) = suma1
					Escribir " " matriz(i,j)
				FinSi
			FinSi
			
			
		Fin Para
		Escribir " "
	FinPara
	
	
//	Para i<-0 Hasta 7 Con Paso 1 Hacer
//		Para j<-0 Hasta 6 Con Paso 1 Hacer
//			si i >= 1 Y i <= 5 y j > 0 y j < 6
//				matriz(i,j) = Aleatorio(1,20)
//				Escribir Sin Saltar matriz(i,j) " | "
////				Escribir "la venta del producto N° " i " correspondiente al dia " matriz(0,j) " fue de " matriz(i,j)
//				suma = matriz(i,j) + suma
//				
//			SiNo
//				si i >= 1 Y i <= 5 y j = 6
//					matriz(i,j) = suma
//					Escribir Sin Saltar matriz(i,j)
////					Escribir matriz(i,j)
//					suma=0
//					
//				FinSi
//			FinSi
//		Fin Para
//		Escribir " "
//	Fin Para
	
	
	
	
//	Para i<-0 Hasta 7 Con Paso 1 Hacer
//		Para j<-0 Hasta 6 Con Paso 1 Hacer
//			si i = 0 Y j = 0
//				escribir sin saltar "|                      |"
//				matriz(i,j) = 0
//			SiNo
//				si i = 0 Y j = 1
//					escribir sin saltar " LUNES |"
//					matriz(i,j) = 0
//				SiNo
//					si i = 0 Y j = 2
//						escribir sin saltar " MARTES |"
//						matriz(i,j) = 0
//					SiNo
//						si i = 0 Y j = 3
//							escribir sin saltar " MIERCOLES |"
//							matriz(i,j) = 0
//						SiNo
//							si i = 0 Y j = 4
//								escribir sin saltar " JUEVES |"
//								matriz(i,j) = 0
//							SiNo
//								si i = 0 Y j = 5
//									escribir Sin Saltar " VIERNES |"
//									matriz(i,j) = 0
//								SiNo
//									si i = 0 Y j = 6
//										escribir sin saltar " TOTAL DE PRODUCTO |"
//										matriz(i,j) = 0
//									SiNo
//										Escribir sin saltar matriz(i,j) "    |"
//									FinSi
//								FinSi
//							FinSi
//						FinSi
//						
//						
//						
//					FinSi
//				FinSi
//			FinSi
//			si j = 0 Y i >= 1 Y i <= 5
//				escribir sin saltar "|      PRODUCTO " i "      |"
//				matriz(i,j) = 0
//			SiNo
//				si j = 0 Y i = 6
//					escribir sin saltar "|      TOTAL SEMANA    |"
//					matriz(i,j) = 0
//				SiNo
//					si j=0 Y i = 7
//						escribir sin saltar "| PRODUCTO MAS VENDIDO |"
//						matriz(i,j) = 0
//					SiNo
//						Escribir Sin Saltar matriz(i,j)
//					FinSi
//				FinSi
//				
//			FinSi
//		Fin Para
//		Escribir " "
//	FinPara
	
	
	
FinAlgoritmo



////Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
////productos en los 5 días hábiles de la semana. Se desea conocer:
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.
////El informe final tendrá un formato como el que se muestra a continuación:
////	Lunes Martes Miércoles Jueves Viernes Total producto
////	Producto 1
////	Producto 2
////	Producto 3
////	Producto 4
////	Producto 5
////	Total semana
////	Producto más
////vendido