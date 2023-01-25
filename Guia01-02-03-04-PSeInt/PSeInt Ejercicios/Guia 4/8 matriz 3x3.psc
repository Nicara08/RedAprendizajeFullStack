Algoritmo sin_titulo
	Definir valores, vector, i, j Como Entero
	
	Dimension vector(3, 3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir "ingrese los valores de la posicion (" i ", " j ")"
			leer vector(i, j)
		Fin Para
		
	Fin Para
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar vector(i, j) ", "
			
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo


//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.