Algoritmo sin_titulo
	definir minutos2 Como entero
	definir opc Como Caracter
	definir litros Como Real
	Escribir Sin Saltar "si usted utilizo el auto 2 horas, ingrese 1 sino 2"
	leer opc

	Segun  opc hacer
		"1":
			Escribir "el monto a pagar es de $400 y la nafta gratis"
		"2":
			Escribir Sin Saltar "ingrese el total de minutos de uso del vehiculo"
			leer minutos2
			Escribir Sin Saltar "ingrese la cantidad de litros consumidos"
			leer litros
			Escribir "usted debe abonar la suma de ", "$ ", (((minutos2 - 120) * 5.2) + 400) + (litros * 40) 
	FinSegun
	

FinAlgoritmo
