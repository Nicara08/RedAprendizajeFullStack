Algoritmo ejermientras
	Definir NumMax, NumMin, aux, num, num2 Como Entero
	
	Escribir "ingrese un numero entero maximo"
	leer NumMax
	
	Repetir
		Escribir "ingrese un numero entero minimo"
		leer NumMin
	Mientras Que NumMin >= NumMax
	
	Escribir "ingrese un numero entero dentro del minimo y maximo"
	leer num
	
	aux = 0
	Mientras NumMin <= num Y num <= NumMax Hacer
		Escribir "ingrese nuevamente un numero entero"
		leer num
		
		aux = aux + 1
				
	Fin Mientras
	
	Escribir "la cantidad de numeros ingresados fueron: " aux
FinAlgoritmo

//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
//se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
//Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
//intervalo