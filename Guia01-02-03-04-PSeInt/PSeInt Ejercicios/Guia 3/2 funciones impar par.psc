Funcion retorno <- impar(num)
	Definir retorno Como Logico
	
	si num mod 2 = 0
		retorno = Falso
	SiNo
		retorno = Verdadero
	FinSi
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Real
	Definir res Como Logico
	
	Escribir "ingrese un numero impar"
	leer num
	
	res = impar(num)
	
	si res = Falso
		Escribir "su numero es par"
	SiNo
		Escribir  "su numero es impar" 
	FinSi
	
	
FinAlgoritmo



//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.