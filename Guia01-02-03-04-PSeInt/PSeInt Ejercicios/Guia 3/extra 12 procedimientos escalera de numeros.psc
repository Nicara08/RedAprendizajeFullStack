Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese el numero de altura de la escalera"
	leer num
	
	escalera(num)
	
FinAlgoritmo

SubProceso escalera(num)
	Definir i, j Como Entero
	
	j=1
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		Para j<-1 Hasta j  Con Paso 1 Hacer
			Escribir Sin Saltar j
		Fin Para
		
		Escribir ""
	Fin Para
FinSubProceso

//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123