Algoritmo sin_titulo
	
	definir num, contador, suma Como Real
	
	Escribir "ingrese un valor positivos, finalizando con el ingreso de -1"
	leer num
	
	contador = 0
	suma = 0
	
	Mientras num <> -1 Hacer
		contador = contador + 1
		suma = num + suma
		
		Escribir "ingrese nuevamente un valor"
		leer num
		
	Fin Mientras
	
	Escribir "su promedio es: ", suma / contador
FinAlgoritmo

//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,??,-1; realizar un programa que calcule el promedio de los
//números ingresados. Suponemos que el usuario no insertará número negativos.