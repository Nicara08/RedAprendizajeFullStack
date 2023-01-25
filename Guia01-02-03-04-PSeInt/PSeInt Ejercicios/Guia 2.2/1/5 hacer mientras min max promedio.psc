Algoritmo sin_titulo
	Definir num, max, min, contador, suma Como Real
	
	contador = 0
	suma = 0
	
	Repetir
		
		Escribir "ingrese un numero entero"
		leer num
		
		contador = contador + 1
		suma = suma + num
		
		si contador = 1
			min = num
			max = num
		SiNo
			si min > num Y num <> 0
				min = num
			SiNo
				si max < num
					max = num
					
				FinSi
			FinSi
		FinSi
	Mientras Que num <> 0
	
	Escribir "el numero minimo es: ", min
	Escribir "el numero maximo es: ", max
	Escribir "el promedio es: ", suma / (contador - 1)
	
FinAlgoritmo


// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.