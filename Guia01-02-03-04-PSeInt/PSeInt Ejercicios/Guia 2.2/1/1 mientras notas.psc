Algoritmo sin_titulo
	Definir nota Como Entero
	
	Escribir "ingrese la nota del examen"
	leer nota
	
	Mientras nota < 0 o nota > 10 Hacer
		Escribir "ingrese la nota nuevamente"
		leer nota
	Fin Mientras
	
FinAlgoritmo



// Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la nota
// se pedir� de nuevo hasta que la nota sea correcta.