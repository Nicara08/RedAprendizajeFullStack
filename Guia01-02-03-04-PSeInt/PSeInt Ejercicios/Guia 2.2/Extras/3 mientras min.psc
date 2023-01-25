Algoritmo ejermientras
	definir num, NumMin Como Real
	
	Escribir "ingrese un numero decimal minimo"
	leer NumMin
	
	Escribir "ingrese un numero"
	leer num
	
	Mientras num >= NumMin Hacer
		Escribir "ingrese nuevamente un numero"
		leer num
	Fin Mientras
	
	Escribir "gracias"
	
FinAlgoritmo


// Escriba un programa que solicite al usuario números decimales mientras que el usuario
//escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
//	como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//número. El programa continuará solicitando valores sucesivamente mientras los valores
//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.