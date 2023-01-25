Algoritmo sin_titulo
	definir num Como Entero
	Escribir Sin Saltar "ingrese un año"
	leer num
	
	Mientras (num mod 4 <> 0 o num mod 100 = 0) Y (num mod 100 <> 0 o num mod 400 <> 0)
		Escribir "ingrese nuevamente un año"
		leer num
	FinMientras
Escribir num, " el año ingresado es bisiesto"
FinAlgoritmo


// Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
// bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
// por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
// bisiesto. Nota: recuerde la función mod de PseInt