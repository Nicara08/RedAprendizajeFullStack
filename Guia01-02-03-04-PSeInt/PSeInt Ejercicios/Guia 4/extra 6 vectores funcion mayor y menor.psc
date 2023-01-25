Funcion retorno <- vect(vector, cant, min Por Referencia, max Por Referencia)
	Definir i, retorno Como Entero
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		Escribir "ingrese un valor para el vector subindice " i
		leer vector(i)
		
		si i = 0
			min = vector(i)
			max = vector(i)
		SiNo
			si vector(i) > max
				max = vector(i)
			SiNo
				si vector(i) < min
					min = vector(i)
				FinSi
			FinSi
		FinSi
	Fin Para
	
	retorno = min - max
Fin Funcion

Algoritmo sin_titulo
	Definir vector, cant, i, min, max Como Entero
	
	Escribir "ingrese la dimension del vactor"
	leer cant
	
	Dimension vector(cant)
	
	Escribir vect(vector, cant, min, max) " es la diferencia del valor menor y el mayor"
	
	
	
FinAlgoritmo


////Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
////su valor más grande.