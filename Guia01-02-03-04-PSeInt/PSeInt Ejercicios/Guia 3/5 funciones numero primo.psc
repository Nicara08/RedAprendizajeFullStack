Funcion retorno <- primor ( num )
	Definir  i Como Real
	Definir retorno Como Logico
	Definir contador Como Entero
	
	contador = 0
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		si num mod i = 0
			contador = contador + 1
		FinSi
		
	Fin Para
	si contador <= 2
		retorno = Verdadero
	SiNo
		retorno = falso
	FinSi
Fin Funcion

Algoritmo sin_titulo
	Definir num Como real
	Escribir "ingrese un numero entero"
	leer num
	
	Escribir "el numero ingresado es primo " primor(num)

FinAlgoritmo


//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.