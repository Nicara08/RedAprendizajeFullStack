Funcion retorno <- mcd(num1, num2)
	Definir retorno, aux, aux2 Como Entero
	

	
	si num1 >= num2 
		
		si num2 mod aux = 0 Y num1 mod aux = 0
			retorno = aux
		SiNo
			aux = aux - 1
			escribir mcd(num1,num2)
		FinSi
	SiNo
		si num1 <= num2 
			
			si num1 mod aux2 = 0 Y num2 mod aux2 = 0 
				retorno = aux2
			SiNo
				aux2 = aux2 - 1
				escribir mcd(num1,num2)
			FinSi
			
		FinSi
	FinSi
	
	
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir num1, num2 Como Entero
	
	Escribir "ingrese 2 numeros enteros para conocer el MCD"
	leer num1, num2
	
	Escribir "el MCD de los numeros ingresados es " mcd(num1, num2)
FinAlgoritmo



//Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si
//M >= N una función recursiva para MCD es:
//MCD = M, si N =0
//MCD = MCD (N, M mod N), si N <> 0
//El programa le debe permitir al usuario ingresar los valores para M y N. Una función recursiva
//es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD. 