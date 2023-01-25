Funcion retorno <- fibo(num, num1, num2)
	Definir retorno, f, suma, aux, aux1, aux2 Como Entero
	

	si num2 <= num
		suma = num1 + num2
		num1=num2
		num2=suma
		si suma <= num Entonces
		Escribir Sin Saltar suma, ", "
		
		f = fibo(num, num1, num2)
	FinSi
	
		
	FinSi

	
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir num, num1, num2 Como Entero
	num1=1
	num2=1
	Escribir "ingrese un numero entero para devolver el numero fibonacci mas cercano"
	leer num
	
	escribir "los numeros fibonacci anteriores al numero ingresado son " fibo(num, num1, num2)
FinAlgoritmo


//Realice nuevamente un programa que calcule la función de Fibonacci, pero esta vez de
//manera recursiva.
