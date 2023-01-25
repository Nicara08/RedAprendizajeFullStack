Algoritmo sin_titulo
	Definir vectorA, vectorB, i, j Como Entero
	
	Dimension vectorA(5)
	Dimension vectorB(5)
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		vectorA(i) = Aleatorio(1, 9)
		vectorB(i) = Aleatorio(1, 9)
		
		Escribir "el vector A sub indice (" i ") es " vectorA(i)
		Escribir "el vector B sub indice (" i ") es " vectorB(i)
	Fin Para
FinAlgoritmo


////Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
////muestre por pantalla.