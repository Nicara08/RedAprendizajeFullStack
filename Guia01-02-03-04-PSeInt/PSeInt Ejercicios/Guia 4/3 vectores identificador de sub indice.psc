Algoritmo sin_titulo
	Definir cant, i, vector, num, numvec, contador	Como Entero
	contador = 0
	
	Escribir "ingrese el tama�o del vector"
	leer cant
	
	Dimension vector(cant)
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		Escribir Sin Saltar "escriba el valor del vector subindice " i 
		leer vector(i)
	Fin Para
	
	Escribir "ingrese un numero para saber si se encuentra dentro del vector"
	leer num
	
	Para i<-0 Hasta cant-1 Con Paso 1 Hacer
		numvec = vector(i)
		
		si numvec = num
			Escribir "el numero ingresado es igual al ingresado en el sub indice " i " del vector "
		SiNo
			contador = contador + 1
		FinSi
		
	Fin Para
	
	si contador = cant
		Escribir "el numero ingresado no se encuentra dentro del vector"
	FinSi
	
FinAlgoritmo


//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.