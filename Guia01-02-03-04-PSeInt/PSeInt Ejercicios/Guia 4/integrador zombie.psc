Algoritmo sin_titulo
	Definir matrizAB, matrizCD, muestraA, muestraB, muestraC, muestraD, muestra Como Caracter
	Definir tres, cuatro, opc, letra Como Entero
	
	tres = 1
	cuatro = 2
	siete = 3
	
	n = Aleatorio(1,3)
	si n = 1
		num = 3
	SiNo
		si n = 2
			num = 4
		SiNo
			num = 37
		FinSi
	FinSi
	
	dimension matriz(num,num)
	
	opc = Aleatorio(1,4)
	
	letra = Aleatorio(65,58)
	
	letra = ConvertirATexto(letra)
	Escribir letra
	
	
//	muestraA = "ABCABCABC"
//	muestraB = "ABACACADA"
//	muestraC = "ABCDABCDABCDABCD"
//	muestraD = "ACDDCADBCDABDBBA"
//	
//	Repetir
//		Escribir "ingrese que muestra quiere analizar, A, B, C o D"
//		leer muestra
//		muestra = Mayusculas(muestra)
//	Mientras Que muestra <> "A" Y muestra <> "B" Y muestra <> "C" Y muestra <> "D" 
	
	Segun opc Hacer
		1: 
			mat(matriz, num)
		2: 
			mat(matrizAB, matrizCD, muestraB)
		3:
			mat(matrizAB, matrizCD, muestraC)
		4:
			mat(matrizAB, matrizCD, muestraD)
	Fin Segun
	
	genZ(matrizAB, matrizCD, muestraA, tres, cuatro)
	
	
	
FinAlgoritmo

SubProceso 	mat(matrizAB Por Referencia, matrizCD Por Referencia, muestraA)
	Definir i, j, contador, long Como Entero
	
	long = Longitud(muestraA)
	
	si long = 9
		contador=0
		Para i<-0 Hasta 2 Con Paso 1 Hacer
			Para j<-0 Hasta 2 Con Paso 1 Hacer
				matrizAB(i,j) = Subcadena(muestraA, contador, contador)
				Escribir Sin Saltar matrizAB(i,j) " "
				contador = contador + 1
			Fin Para
			Escribir ""
		Fin Para
	SiNo
		
		contador=0
		Para i<-0 Hasta 3 Con Paso 1 Hacer
			Para j<-0 Hasta 3 Con Paso 1 Hacer
				matrizCD(i,j) = Subcadena(muestraA, contador, contador)
				Escribir Sin Saltar matrizCD(i,j) " "
				contador = contador + 1
			Fin Para
			Escribir ""
		Fin Para
	FinSi
	
FinSubProceso 

SubProceso genZ(matrizAB, matrizCD, muestraA, tres, cuatro)
	Definir long, i, j, contador, n, contadorA Como Entero
	Definir letra, letra2 Como Caracter
	
	long = Longitud(muestraA)
	contador = 0
	contadorA = 0

	
	si long = 9
		n = tres
		
	SiNo
		n = cuatro
		
	FinSi

	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			si i = 0 y j = 0
				letra = matrizAB(i,j)
			FinSi
			
			si i = j
				si letra = matrizAB(i,j)
					contador = contador + 1
				FinSi
			FinSi
			
			si i = contadorA y j = n-1
				letra2 = matrizAB(i,j)
			FinSi
			
			si contadorA = i Y j = n-1
				si letra2 = matrizAB(i,j)
					contador = contador + 1
				FinSi
			FinSi
			
		Fin Para
		contadorA = contadorA + 1
	Fin Para
	
		

	si contador = 6
		Escribir "Se ha detectado el Gen Z"
	SiNo
		Escribir "No se ha detectado el Gen Z"
	FinSi
		
		
	
FinSubProceso
	