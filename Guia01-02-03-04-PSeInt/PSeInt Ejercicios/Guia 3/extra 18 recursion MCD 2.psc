Funcion retorno <- mcd(num1, num2, aux1, aux2)
	Definir retorno, aux3 Como Entero
	
	si num1 mod 2 = 0 y num2 mod 2 = 0
		si num1 > num2
			si num1 mod aux2 = 0 y num2 mod aux2 = 0
				retorno = aux2
				Escribir retorno
				
			SiNo
				aux2 = aux2 - 1
				aux3 = mcd(num1, num2, aux1, aux2)
			FinSi
		SiNo
			si num2 mod aux1 = 0 y num1 mod aux1 = 0
				retorno = aux1
				Escribir retorno
				
				
			SiNo
				aux1 = aux1 - 1
				aux3 = mcd(num1, num2, aux1, aux2)
			FinSi
			
		FinSi
		
	FinSi
	
	si num1 mod 2 <> 0 o num2 mod 2 <> 0
		retorno = 1
	FinSi
	
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir num1, num2, aux1, aux2, i Como Entero
	
	Escribir "ingrese 2 numeros enteros para conocer el MCD"
	leer num1, num2
	
	aux1 = num1
	aux2 = num2
	
	
	Escribir "el MCD de los numeros ingresados es " 
	
	i = mcd(num1, num2, aux1, aux2)
	
FinAlgoritmo



//Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros positivos. Si
//M >= N una función recursiva para MCD es:
//MCD = M, si N =0
//MCD = MCD (N, M mod N), si N <> 0
//El programa le debe permitir al usuario ingresar los valores para M y N. Una función recursiva
//es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD. 