Algoritmo sin_titulo
	Definir cantidad, num, vector, i Como Entero
	Definir suma Como Real
	
	Escribir "ingrese la dimension del vector"
	leer cantidad
	
	Dimension vector(cantidad)
	
	suma=0
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir Sin Saltar "ingrese el valor para el vector subindice (" i ") "
		leer vector(i)
		
		suma = suma + vector(i)
		
	Fin Para
	
	Escribir "el promedio de la suma de los valores del vector es igual a " suma / cantidad
FinAlgoritmo


////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.