Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	
	Escribir "el sistema eligira un numero al azar entre 1 y 10"
	num2 = Aleatorio(1,10)
	
	Repetir
		Escribir "ingrese un numero del 1 al 10 hasta adivinar"
		leer num1
		
		si num1 > 10 o num1 < 1
			Escribir "numero ingresado incorrecto"
		FinSi
		si num1 < num2
			Escribir "numero ingresado menor al del sistema"
		SiNo
			Escribir "numero ingresado mayor al del sistema"
		FinSi
		
	Mientras Que num1 <> num2
	Escribir "feliciaciones usted adivino el numero incongnito del sistema " num2
FinAlgoritmo


///Programar un juego donde la computadora elige un número al azar entre 1 y 10, y a
///continuación el jugador tiene que adivinarlo. La estructura del programa es la siguiente:
///	1º) El programa elige al azar un número n entre 1 y 10.
///	2º) El usuario ingresa un número x.
///	3º) Si x no es el número exacto, el programa indica si n es más grande o más pequeño que
///		el número ingresado.
///	4º) Repetimos desde 2) hasta que x sea igual a n.
///	El programa tiene que imprimir los mensajes adecuados para informarle al usuario qué
///	hacer y qué pasó hasta que adivine el número.
///	NOTA: Para generar un número aleatorio entre 1 y 10 se puede utilizar la función
///	Aleatorio(limite_inferior, limite_superior) de PseInt.