Funcion retorno <- vec(vector, num)
	Definir retorno, suma Como Entero
	
	num = num - 1
	
	si num = 0
		suma = vector(num)
	SiNo
		suma = vector(num) + vec(vector, num)
		
	FinSi
	
	retorno = suma
	
Fin Funcion

Algoritmo sin_titulo
	Definir vector, i, num Como Entero
	
	Escribir "ingrese la dimension del vector"
	leer num
	
	Dimension vector(num)
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		vector(i) = Aleatorio(1,9)
		Escribir Sin Saltar vector(i) ", "
	Fin Para
	
	Escribir "la suma recursiva de los elementos del vector es " vec(vector, num)
	
FinAlgoritmo



////Programe una función recursiva que calcule la suma de un arreglo de números enteros.