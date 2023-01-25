Algoritmo sin_titulo
	Definir vector, i, contador1, contador2, contador3, contador4 Como Entero
	
	Dimension vector(100)
	
	contador1=0
	contador2=0
	contador3=0
	contador4=0
	
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		vector(i) = Aleatorio(0, 20)
		
		si vector(i) <= 5
			contador1 = contador1 + 1
		SiNo
			si vector(i) >= 6 Y vector(i) <= 10
				contador2 = contador2 + 1
			SiNo
				si vector(i) >= 11 Y vector(i) <= 15
					contador3 = contador3 + 1
				SiNo
					contador4 = contador4 + 1
				FinSi
			FinSi
		FinSi
	Fin Para
	
	Escribir ""
	Escribir "de 100 alumnos:"
	Escribir "de " contador1 " sus notas fueron deficientes"
	Escribir "de " contador2 " sus notas fueron regulares"
	Escribir "de " contador3 " sus notas fueron buenas"
	Escribir "de " contador4 " sus notas fueron excelentes"
	Escribir ""
	
FinAlgoritmo


////Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
////20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
////Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
////	a) Deficientes 0-5
////	b) Regulares 6-10
////	c) Buenos 11-15
////	d) Excelentes 16-20