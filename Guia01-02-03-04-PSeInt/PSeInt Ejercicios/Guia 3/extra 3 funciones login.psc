Funcion retorno <- login ( usuario, pass )
	Definir retorno Como Logico
	
	si usuario = "usuario1" y pass = "asdasd"
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
Fin Funcion

Algoritmo sin_titulo
	Definir usuario, pass Como Caracter
	Definir contador Como Entero
	
	contador=0
	
	Escribir "ingrese nombre de usuario"
	leer usuario
	Escribir "ingrese la contrase�a"
	leer pass
	
	Mientras login(usuario, pass) = falso Y contador < 2 Hacer
		Escribir "ingrese nuevamente el nombre de usuario"
		leer usuario
		Escribir "ingrese nuevamente la contrase�a"
		leer pass
		contador = contador + 1
	Fin Mientras
	
	
	si login(usuario, pass) = Verdadero
		Escribir "login exitoso"
	SiNo
		Escribir "login incorrecto, 3 intentos fallidos"
	FinSi
FinAlgoritmo


//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd".
//	Adem�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos
//	solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.