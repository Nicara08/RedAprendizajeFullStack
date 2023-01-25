Algoritmo sin_titulo
	definir num1, num2 Como Entero
	Escribir Sin Saltar "ingrese el primer numero"
	leer num1
	Escribir Sin Saltar "ingrese el segundo numero"
	leer num2
	
	si (num1 mod 2 = 0) y (num2 mod 2 = 0)
		Escribir "ambos numeros son pares"
	SiNo
		si (num1 mod 2 = 0)
			Escribir "el primer numero ingresado es par"
		SiNo
			si (num2 mod 2 = 0)
				Escribir "el segundo numero ingresado es par"
			sino 
				escribir "ningun numero es par"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
