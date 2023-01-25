Funcion retorno <- vec(vector, cant)
	Definir retorno, i, ant, anterior Como Entero
	
	
	si cant = cant
	ant = 0	
	ant = ant + vector(cant-1)
	cant = cant - 1
		SiNo
			si (cant - 1) > 0
				ant = ant + vector(cant)
				cant = cant - 1	
			retorno = ant + vec(vector, cant)
		FinSi
		
	
	FinSi

	
	

	
	
Fin Funcion

Algoritmo sin_titulo
	Definir vector, cant, i Como Entero
	
	Escribir "ingrese la dimension del vector"
	leer cant
	
	Dimension vector(cant)
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		Escribir Sin Saltar "ingrese el valor del subindice del vector (" i ")"
		leer vector(i)
	Fin Para
	
	Escribir "la suma recursiva de los numeros enteros es " vec(vector, cant)
FinAlgoritmo


///Programe una función recursiva que calcule la suma de un arreglo de números enteros.