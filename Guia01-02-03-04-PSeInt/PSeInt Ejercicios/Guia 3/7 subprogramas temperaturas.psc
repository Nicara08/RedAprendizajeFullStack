Algoritmo sin_titulo
	
	Definir min, max,i, dias, aux Como Real
	
	Escribir "ingrese la cantidad de dias"
	leer dias
aux = 0
	Para i<-1 Hasta dias Con Paso 1 Hacer
		
		Escribir "ingrese temp minima del dia " i
		leer min
		Escribir "ingrese temp maxima del dia " i
		leer max
		promedio(min,max,aux)
		Escribir "la temperatura promedio del dia ", i " es " aux
	Fin Para
	
FinAlgoritmo

SubProceso promedio(min,max,aux por referencia)
	
	aux = (min + max) / 2
	
FinSubProceso
//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.