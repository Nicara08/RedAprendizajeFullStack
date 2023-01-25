Algoritmo ejerhacermientras
	Definir num, contadorPar, contadorImpar, aux, par, impar Como Entero
	par = 0
	impar = 0
	contadorImpar = 0
	contadorPar = 0
	
	Repetir
		Escribir "ingrese un numero entero"
		leer num
		si num MOD 2 = 0
			par = par + num
			contadorPar = contadorPar + 1
		SiNo
			impar = impar + num
			contadorImpar = contadorImpar + 1
		FinSi
	Mientras Que (contadorImpar + contadorPar) < 10
	Escribir "la media de los numeros pares es: " par / contadorPar
	Escribir "la media de los numeros impares es: " impar / contadorImpar
FinAlgoritmo


///Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
///ingresará diez números