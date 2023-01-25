Algoritmo sin_titulo
	definir nota1, nota2, nota3, nota4, notMin, notMax Como Real
	Escribir "ingresar las 4 notas"
	leer nota1, nota2, nota3, nota4
	
	si nota1 <= 100 y nota1 >= 1 Y nota2 <= 100 y nota2 >= 1 Y nota3 <= 100 y nota3 >= 1 Y nota4 <= 100 y nota4 >= 1
		Escribir "notas ingresadas correctamente"
	SiNo
		Escribir "1 o 2 mas notas incorrectas, de 1 a 100"
	FinSi
	
	si nota1 < nota2 Y nota1 < nota3 Y	nota1 < nota4
		notMin = nota1
		Escribir "el promedio de las notas es: ", (nota2 + nota3 + nota4) / 3
		Escribir "la nota baja eliminada es: ", notMin
	SiNo
		si nota2 < nota1 Y nota2 < nota3 Y	nota2 < nota4
			notMin = nota2
			Escribir "el promedio de las notas es: ", (nota1 + nota3 + nota4) / 3
			Escribir "la nota baja eliminada es: ", notMin
		SiNo
			si nota3 < nota1 Y nota3 < nota2 Y	nota3 < nota4
				notMin = nota3
				Escribir "el promedio de las notas es: ", (nota1 + nota2 + nota4) / 3
				Escribir "la nota baja eliminada es: ", notMin 
			SiNo
				Escribir "el promedio de las notas es: ", (nota1 + nota2 + nota3) / 3
				Escribir "la nota baja eliminada es: ", nota4
				
			FinSi
		FinSi
	FinSi
FinAlgoritmo

// El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
// cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
// programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
// de un estudiante