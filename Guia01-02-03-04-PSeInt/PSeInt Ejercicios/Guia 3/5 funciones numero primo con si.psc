Funcion retorno <-aux(num)
	Definir i, contador como entero
	Definir retorno como logico
	
	
	contador = 0
	
	si num mod 2 <> 0 Y num mod 3 <> 0
		retorno = Verdadero
	SiNo
		retorno = falso
	FinSi
	
//	Para i<-1 Hasta num Con Paso 1 Hacer
//		si num mod i = 0 Entonces
//			contador = contador + 1
//			
//		FinSi
//	Fin Para
//	si contador = 2
//		retorno = Verdadero
//	SiNo
//		retorno = falso
//	FinSi
	
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese un numero entero"
	leer num
	
	escribir "el numero ingresado es primo " aux(num)
FinAlgoritmo



//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.