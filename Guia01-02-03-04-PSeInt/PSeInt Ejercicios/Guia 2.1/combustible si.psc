Algoritmo sin_titulo
	definir minutos Como Entero
	definir litros Como Real
	Escribir "ingres la cantidad de minutos utilizado"
	leer minutos
	
	si minutos <= 120
		Escribir "usted debe abonar $400"
	SiNo
		Escribir "ingrese los litros consumidos"
		leer litros
		Escribir "el total a pagar es de $", (((minutos - 120 ) * 5.2) + 400) + (litros * 40)
	FinSi
FinAlgoritmo
