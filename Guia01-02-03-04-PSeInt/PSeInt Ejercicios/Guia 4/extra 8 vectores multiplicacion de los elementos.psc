Funcion retorno <- vec(vector, num, i)
	Definir retorno, mult Como Entero
	
	mult=1
	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		mult = mult * vector(i)
	Fin Para
	
	retorno = mult
	
Fin Funcion

Algoritmo sin_titulo
	Definir vector, i, num Como Entero
	
	Escribir "ingrese la dimension del vector"
	leer num
	
	Dimension vector(num)

	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Escribir "ingese el valor del vector subindice numero " i
		leer vector(i)
	Fin Para
	
	Escribir "la multiplicacion de todos los elementos del vector es " vec(vector, num, i)
FinAlgoritmo



////Programe una función que calcule el producto de un arreglo de números enteros. Para esto
////	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
////		igual a (V[1]*V[2]*V[3]*V[4])