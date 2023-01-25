Algoritmo sin_titulo
	Definir num1, num2, aux, contador Como Real
	
	Escribir "ingrese el primer numero llamado dividendo"
	leer num1
	Escribir "ingrese el segundo numero llamado divisor"
	leer num2
	
	division(num1, num2, aux, contador)
	
	Escribir "dado que " aux " es menor que " num2 " entonces: el residuo es " aux " y el cociente es " contador
FinAlgoritmo

SubProceso division(num1,num2, aux Por Referencia, contador Por Referencia)
	
	contador = 1
	aux = num1 - num2
	
	Mientras aux > num2 Hacer
		contador = contador + 1
		aux = aux - num2
	Fin Mientras
FinSubProceso
//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.