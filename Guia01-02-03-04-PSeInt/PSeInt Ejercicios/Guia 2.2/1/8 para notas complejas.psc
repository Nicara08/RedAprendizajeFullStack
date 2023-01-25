Algoritmo sin_titulo
	Definir cantidad Como Entero
	definir notafinal Como Real
	Definir nota1, nota2, nota3, max, aux, aux2, aux3 como real
	
	Escribir "ingrese la cantidad de alumnos"
	leer cantidad
	
	aux = 0
	aux2 = 0
	aux3 = 0
	max = 0
	
	Para  aux = 0 Hasta cantidad - 1 Hacer
		Escribir "ingrese las 3 notas"
		leer nota1, nota2, nota3
		notafinal = (nota1 * 0.35) + (nota2 * 0.25) + (nota3 * 0.4)
		
		si notafinal < 6.5 Entonces
			Escribir "usted reprobo el examen"
		FinSi
		
		si nota1 >= 7.5 Entonces
			aux3 = aux3 + 1
		FinSi
		
		si nota3 >= 4 Y nota3 <= 7.5
			aux2 = aux2 + 1
		FinSi
		
		si nota2 > max Entonces
			max = nota2
		FinSi
	Fin Para
	
	Escribir "porcentajes de alumnos que tienen nota de integrador mayor a 7.5: ", (aux3 * 100) / cantidad "%"
	Escribir "la nota maxima en las exposiciones fue: ", max
	Escribir "el total de estudiantes que obtuvieron en el parcial entre 4 y 7 fueron: ", aux2

	
	
FinAlgoritmo


//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:

//- Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//- Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//- La mayor nota obtenida en las exposiciones.
//- Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.

//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.