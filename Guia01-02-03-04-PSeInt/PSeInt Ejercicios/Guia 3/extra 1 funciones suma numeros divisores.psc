Funcion retorno <- div(num, aux Por Referencia)
	Definir i Como Entero
	
	aux = 0
	
	Para i<-1 Hasta num-1 Con Paso 1 Hacer
		si num mod i = 0
			aux = aux + i
			
		FinSi
	Fin Para
	num = aux
Fin Funcion

Algoritmo sin_titulo
	Definir num, aux Como real
	
	Escribir "ingrese un numero entero"
	leer num
	Escribir div(num, aux)
	escribir "la suma de los divisores del numero ingresado es " aux
	
FinAlgoritmo


//Realizar una función que calcule y retorne la suma de todos los divisores del número n
//distintos de n. El valor de n debe ser ingresado por el usuario.