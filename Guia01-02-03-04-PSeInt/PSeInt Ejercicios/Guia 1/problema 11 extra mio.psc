//. Ejercicio .
//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo si el número ingresado por pantalla es 123 el programa debe mostrar
//CENTENA: 1
//DECENA: 2
//UNIDAD: 3
Algoritmo sin_titulo
	definir num, centena, decena, unidad Como Entero 
	Escribir "ingrese un numero entero de 3 cifras"
	leer num
	centena = trunc (num / 100)
	decena = (trunc (num / 10)) mod 10
	unidad = num mod 10
	Si num <= 999 Entonces
		Si num >= 100 Entonces
			Escribir "centena ", centena
			escribir "decena ", decena
			escribir "unidad ", unidad
		SiNo
			escribir "numero ingresado incorrecto"
		Fin Si
	SiNo
		escribir "numero ingresado incorrecto"
	Fin Si
FinAlgoritmo
//