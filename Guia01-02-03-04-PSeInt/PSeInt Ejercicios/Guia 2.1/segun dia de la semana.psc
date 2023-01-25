Algoritmo sin_titulo
	Definir num Como caracter
	Escribir "ingrese un numero entre 1 y 7 para indicar el dia de la semana"
	leer num
	
	Segun num  hacer
		
		"1":
			Escribir "dia lunes"
		"2":
			Escribir "dia martes"
		"3":
			Escribir "dia miercoles"
		"4":
			Escribir "dia jueves"
		"5":
			Escribir "dia viernes"
		"6":
			Escribir "dia sabado"
		"7":
			Escribir "dia domingo"
			
		De Otro Modo:
			Escribir "numero ingresado incorrecto"
	FinSegun
FinAlgoritmo
// Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por pantalla
// un mensaje que indique a qué día de la semana corresponde. Considere que el número 1
// corresponde al día "Lunes", y así sucesivamente.