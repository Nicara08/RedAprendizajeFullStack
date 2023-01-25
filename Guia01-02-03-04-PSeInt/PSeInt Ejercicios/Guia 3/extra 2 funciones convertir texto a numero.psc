Funcion retorno <- conver ( num )
	Definir retorno Como Entero
	
	retorno = ConvertirANumero(num)
Fin Funcion

Algoritmo sin_titulo
	definir num Como Caracter
	Definir num1 como entero
	

	Repetir
		Escribir "ingrese un numero de 3 digitos"
		leer num
	Mientras Que Longitud(num) > 3
	
	Escribir conver(num) + 2

	
FinAlgoritmo


	

//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//	decimales