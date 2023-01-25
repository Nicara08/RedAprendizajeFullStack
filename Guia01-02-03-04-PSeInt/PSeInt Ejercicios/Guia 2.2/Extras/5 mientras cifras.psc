Algoritmo ejermientras
	Definir contador, num Como Entero
	Definir aux Como Real
	
	Escribir "ingrese un numero entero"
	leer num
	
	contador = 0
	

	Mientras num >= 1 Hacer
		
		aux = trunc(num / 10)
		
		num = aux
		
		contador = contador + 1
		
	Fin Mientras
	
	Escribir  contador

FinAlgoritmo



///Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
///convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
///	investigar la función trunc().