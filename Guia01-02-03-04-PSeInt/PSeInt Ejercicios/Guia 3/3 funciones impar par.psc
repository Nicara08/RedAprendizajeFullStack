Funcion retorno <- esmultiplo(num1,num2)
	Definir retorno Como Logico
	Definir aux Como Real
	

	
	si num2 mod num1 = 0
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	
	Escribir "ingrese dos numeros"
	leer num1, num2
	
 Escribir "el primer numero ingresado es multiplo " esmultiplo(num1,num2)
	
FinAlgoritmo



//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.