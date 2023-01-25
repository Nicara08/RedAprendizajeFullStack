Algoritmo sin_titulo
	Definir vocal Como Caracter
	Escribir 'ingrese una vocal hasta adivinar la vocal secreta'
	Leer vocal
	Si vocal='a' O vocal='e' O vocal='i' O vocal='o' O vocal='u' Entonces
		Mientras vocal <> 'i' Hacer
			Escribir 'ingrese nuevamente una vocal'
			Leer vocal
		FinMientras
		Escribir 'la vocal es la correcta'
	SiNo
		Escribir 'letra ingresada incorrecta'
	FinSi
FinAlgoritmo
