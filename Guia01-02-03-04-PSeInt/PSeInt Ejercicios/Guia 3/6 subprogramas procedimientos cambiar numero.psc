subproceso aux ( num1 Por Referencia,num2 Por Referencia)
	Definir aux1 Como Entero
	
	aux1 = num1
	num1 = num2
	num2 = aux1
	
	
	
FinSubProceso


Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	
	Escribir "ingrese el primer numero"
	leer num1
	Escribir "ingrese el segundo numero"
	leer num2
	
	aux(num1,num2)
	
	Escribir "el numero 1 ahora es " num1 " y el numero 2 es " num2
FinAlgoritmo



//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.