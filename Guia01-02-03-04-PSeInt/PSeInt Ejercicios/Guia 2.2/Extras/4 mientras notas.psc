Algoritmo ejermientras
	Definir alumno, practica, teoria, problema, aux Como Real
	
	Escribir "ingrese la cantidad de alumnos que rindieron"
	leer alumno
	aux = 0
	Mientras alumno > aux Hacer
		aux = aux + 1
		Escribir "ingrese la nota de la parte practica del alumno N° " aux
		leer practica
		Escribir "ingrese la nota de la parte de problemas N° " aux
		leer problema
		Escribir "ingrese la nota de la parte teorica N° " aux
		leer teoria
		
		si practica <= 10 Y practica > 0 Y teoria <= 10 Y teoria > 0 Y problema <= 10 Y problema > 0
			Escribir "el promedio del alumno numero °" aux " es de " (practica * 0.1) + (problema * 0.5) + (teoria * 0.4)
		SiNo
			Escribir "alguna nota ingresada esta fuera de 0 y 10"
		FinSi
	Fin Mientras
	
FinAlgoritmo

//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
//el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas
//obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del
//siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar
//comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio
//y se mostrará un mensaje de error