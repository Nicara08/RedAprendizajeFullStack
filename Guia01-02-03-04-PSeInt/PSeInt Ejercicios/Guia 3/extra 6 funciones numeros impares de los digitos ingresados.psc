Funcion retorno <- impares(num)
	Definir i, contadorPar, contadorImpar, aux, decimal Como Entero
	Definir retorno Como Logico
	
	contadorPar = 0
	contadorImpar = 0
	
	Repetir
		
		decimal = num mod 10
		
		si decimal mod 2 = 0
			contadorPar = contadorPar + 1
			
		SiNo
			contadorImpar = contadorImpar + 1
		FinSi
		
		aux = trunc(num/10)
		num = aux
		
	Mientras Que num > 0
	
	si contadorImpar >= 1 Y contadorPar = 0
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese un numero entero"
	leer num
	
	Escribir "el numero ingresado tiene todos los numeros impares " impares(num)
FinAlgoritmo



//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//		Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio