Algoritmo ejerhacermientras
	Definir num, suma Como Entero
	
	suma = 0
	Repetir
		Escribir "ingrese un numero entero par"
		leer num
		
		si num mod 2 = 0
			suma = suma + num
		SiNo
			Escribir "el total de los numeros pares ingresados es de " suma
		FinSi
		
	Mientras Que (num mod 2 = 0)
FinAlgoritmo


///Se pide escribir un programa que calcule la suma de los N primeros n�meros pares. Es
///decir, si ingresamos el n�mero 5 como valor de N, el algoritmo nos debe realizar la suma
///de los siguientes valores: 2+4+6+8+10. 