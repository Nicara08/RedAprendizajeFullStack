Algoritmo sin_titulo
	definir i, j, num Como Entero
	
	Escribir "ingrese un numero entero"
	leer num
		
	Para i<-1 Hasta num Con Paso 1 Hacer
		Para j<-1 Hasta num Con Paso 1 Hacer
		Escribir sin saltar "*"
		Fin Para
		Escribir "" 
		num = num - 1
		
	Fin Para
	
	
FinAlgoritmo


///Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
///invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
///deberá mostrar:
///	*****
///	****
///	***
///	**
///* 