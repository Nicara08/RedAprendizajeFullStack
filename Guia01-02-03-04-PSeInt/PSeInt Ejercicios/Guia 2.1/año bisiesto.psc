Algoritmo sin_titulo
	definir num Como Entero
	Escribir Sin Saltar "ingrese un a�o"
	leer num
	
	Mientras (num mod 4 <> 0 o num mod 100 = 0) Y (num mod 100 <> 0 o num mod 400 <> 0)
		Escribir "ingrese nuevamente un a�o"
		leer num
	FinMientras
Escribir num, " el a�o ingresado es bisiesto"
FinAlgoritmo


// Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
// bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
// por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
// bisiesto. Nota: recuerde la funci�n mod de PseInt