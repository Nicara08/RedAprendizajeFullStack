Algoritmo sin_titulo
	definir vec, i, max, subindice, num, vector Como Entero
	
	Escribir "ingrese el tama�o del vector"
	leer vec
	
	Dimension vector(vec)
	
	subindice = 0
	
	Para i<-0 Hasta vec-1 Con Paso 1 Hacer
		Escribir "ingrese el valor para el subindice " i " del vector " 
		leer vector(i)
		num = vector(i)
		
		si i = 0
			max = vector(i)
		SiNo
			si	max < num
			max = vector(i)
			subindice = i
			FinSi
		
		FinSi
	Fin Para
	
	si subindice = 0
		Escribir "el numero mayor ingresado se guardo en el sub indice 0 del vector"
	SiNo
		Escribir "el numero maximo ingresado fue el numero " max " ubicado en el subindice " subindice
	FinSi
FinAlgoritmo


//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.