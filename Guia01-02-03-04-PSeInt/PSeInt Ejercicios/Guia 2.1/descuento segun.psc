Algoritmo sin_titulo
	definir mes Como Caracter
	definir importe Como Real
	Escribir "ingrese el mes de compra"
	leer mes
	Escribir "ingrese el monto abonado"
	leer importe
	

	Segun mes hacer
		"septiembre":
			Escribir "importe a pagar " importe * 0.9
		"octubre":
			Escribir "importe a pagar " importe * 0.9
		"noviembre":
			Escribir "importe a pagar " importe * 0,9
		De Otro Modo:
			Escribir "importe a pagar " importe
	FinSegun
FinAlgoritmo
