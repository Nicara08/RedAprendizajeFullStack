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


//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.