Algoritmo recursion
	Definir num Como Entero
	
	Escribir "ingrese un numero par"
	leer num
	
	Escribir "la suma de los numeros pares anteriores es " suma(num) - num
	
FinAlgoritmo

Funcion retorno <- suma(num)
	Definir i, sumar, ant, retorno Como Entero

		
	Mientras num mod 2 <> 0 Hacer
		Escribir "ingrese nuevamente un numero, que sea par"
		leer num
	Fin Mientras
	

	
	si num = 0
		Escribir ""
	SiNo
		ant = suma(num-2)
		retorno = ant + num
	FinSi
		
	Fin Funcion
	

//Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
//Chequear que si N es impar se muestre un mensaje de error.