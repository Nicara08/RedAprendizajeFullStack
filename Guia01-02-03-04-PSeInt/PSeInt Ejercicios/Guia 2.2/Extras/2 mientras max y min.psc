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

//Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
//se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
//Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
//intervalo