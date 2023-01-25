Algoritmo sin_titulo
	Definir matriz, i, j, filas, suma Como Entero
	
	Escribir "ingrese la cantidad de filas que quiera sumar"
	leer filas	
	
	Dimension matriz(filas, 3)
	suma = 0
	
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			si j = 0
				matriz(i,j) = Aleatorio(1,9)
				suma = matriz(i,j) + suma
				Escribir Sin Saltar  matriz(i,j) " + "
			SiNo
				si j = 1
					matriz(i,j) = Aleatorio(1,9)
					suma = matriz(i,j) + suma
					Escribir Sin Saltar matriz(i,j) " = "
				SiNo
					matriz(i,j) = suma
					Escribir Sin Saltar matriz(i,j)
				FinSi
				
			FinSi
			
		Fin Para
		Escribir ""
	Fin Para
	
FinAlgoritmo


////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
////deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
////la matriz de la siguiente forma:
////	3 + 5 = 8
////	4 + 3 = 7
////	1 + 4 = 5
////?