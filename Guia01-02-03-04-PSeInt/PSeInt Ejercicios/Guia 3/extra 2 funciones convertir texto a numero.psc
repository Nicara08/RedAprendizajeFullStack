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


	

//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con
//	decimales