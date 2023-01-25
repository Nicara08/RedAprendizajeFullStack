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
//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.