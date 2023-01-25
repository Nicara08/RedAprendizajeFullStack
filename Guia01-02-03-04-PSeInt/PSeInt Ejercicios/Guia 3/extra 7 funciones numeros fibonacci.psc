Funcion retorno <- fibo(num)
	definir retorno Como Logico
	Definir i, aux, aux1, aux2, contador, contador2 Como Entero
	aux=0
	aux1=1
	aux2=1
	contador=0
	contador2=0
	
	si num <= 1
		retorno = Verdadero
		contador = contador + 1
	SiNo
		
		Repetir
		si aux1=1 Y aux2=1
			Escribir Sin Saltar 1 ", ", 1 ", "
		FinSi
		aux = aux1 + aux2
		Escribir Sin Saltar aux ", "
		aux1=aux2
		aux2=aux
		contador2 = contador2 + 1
		si aux = num
			contador = contador + 1
		FinSi
	Mientras Que aux < num
	FinSi

	
	Escribir ""
	
	si contador = 1
		Escribir "la posicion N en la serie fibonacci es de " contador2 + 2
		retorno = Verdadero
	SiNo
		retorno = falso
	FinSi
	
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese un numero para corroborar si esta dentro de la sucesion de fibonacci"
	leer num
	
	Escribir "el numero ingresado esta dentro de la serie " fibo(num)
FinAlgoritmo


//Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La
//sucesión de Fibonacci es la sucesión de los siguientes números:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
//	La sucesión del número 2 se calcula sumando (1+1)
//	Análogamente, la sucesión del número 3 es (1+2),
//	Y la del 5 es (2+3),
//	Y así sucesivamente?
//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//		Fibonacci (n) = 1 para todo n <= 1
//			Por lo tanto, si queremos calcular el término "n" debemos escribir una función que reciba
//				como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
//			Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
//				https://quantdare.com/numeros-de-fibonacci/