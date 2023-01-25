Algoritmo sin_titulo
	Definir i Como Entero
	Definir vector, suma, resta, multiplicacion Como Real
	suma=0
	resta=0
	multiplicacion=1
	
	Dimension vector(10)
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "ingrese 10 valores"
		leer vector(i)
	Fin Para
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		suma = vector(i) + suma
		resta = vector(i) - resta
		multiplicacion = vector(i) * multiplicacion
	Fin Para
	
	Escribir ""
	Escribir "la suma de todos los elementos ingresados es: " suma
	Escribir "la resta de todos los elementos ingresados es: " resta
	Escribir "la multiplicacion de todos los elementos ingresados es: " multiplicacion
	Escribir ""
	
FinAlgoritmo



//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.