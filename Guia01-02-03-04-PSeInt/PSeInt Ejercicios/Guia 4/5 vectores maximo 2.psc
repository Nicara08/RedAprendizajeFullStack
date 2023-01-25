Funcion retorno <- Funcion_vec(vector, cant, i, posicion Por Referencia)
	Definir retorno, max Como Entero
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		si i = 0
			max = vector(i)
		SiNo
			si max < vector(i)
				max = vector(i)
				posicion = i
			FinSi
		FinSi
	Fin Para
	
	retorno = max
	
Fin Funcion





Algoritmo sin_titulo
	Definir cant, i, vector, posicion Como Entero
	
	Escribir "ingrese la longitud del vector"
	leer cant
	
	Dimension vector(cant)
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		Escribir "ingrese el valor del sub indice N°" i
		leer vector(i)
	Fin Para
	
	Escribir "el numero maximo ingresado fue " Funcion_vec(vector, cant, i, posicion) " y la posicion del subindice fue " posicion
	
FinAlgoritmo



//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.