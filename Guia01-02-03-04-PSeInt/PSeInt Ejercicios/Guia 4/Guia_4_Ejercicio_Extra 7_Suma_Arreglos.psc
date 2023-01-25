Algoritmo Suma_Arreglos
	//	Programe una función recursiva que calcule la suma de un arreglo de números enteros.
	
	Definir vector,N,resultado Como Entero
	Escribir "Ingrese la longitud del vector."
	Leer N
	Dimension vector[N]
	
	resultado=sumar[vector,N]
	
	Escribir "La suma de los ", n " naturales sumados  en el vector es: ", resultado
	
FinAlgoritmo
	
	Funcion resultado<-sumar(vector Por Referencia, n1 Por Referencia)
		Definir resultado,i Como Entero
		Para i=0 Hasta -1 Con Paso 1 Hacer
			Si n==0 Entonces
				resultado = n
			SiNo	
				//resultado = n+suma(n-1)
			FinSi
		FinPara
FinFuncion

	

