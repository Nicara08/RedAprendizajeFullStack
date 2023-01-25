Funcion retorno <- sum(num)
	Definir retorno, aux1, aux2, aux3 Como Real
	Definir i Como Entero
	Definir aux Como Caracter
	
	
	aux = ConvertirATexto(num)
	aux1 = Longitud(aux)
	retorno = 0
	Para i<-1 Hasta aux1 Con Paso 1 Hacer
		aux2 = num mod 10
		aux3 = trunc(num/10)
		num = aux3
		retorno = aux2 + retorno
	Fin Para
	
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese un numero de 2 o mas digitos"
	leer num
	
	Escribir "la suma de los digitos del numero ingresado es " sum(num)
FinAlgoritmo


//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//		resto de una división entre 10. Recordar el uso de la función Mod y Trunc.