Algoritmo sin_titulo
	Definir dia, mes, anio Como Entero
	
	Escribir "ingrese un dia en numero entero"
	leer dia
	Escribir "ingrese un mes del 1 al 12"
	leer mes
	Escribir "ingrese un año"
	leer anio
	
	diaAnterior(dia, mes, anio)
	
FinAlgoritmo 	


SubProceso diaAnterior(dia, mes, anio)
	Definir diaAnt Como Entero
	
	Mientras dia < 0 o dia > 31 Hacer
		Escribir "ingrese un dia valido"
		leer dia
	Fin Mientras
	
	Mientras mes < 1 o mes > 12 Hacer
		Escribir "ingrese un mes valido"
		leer mes
	Fin Mientras
	
	Mientras anio < 1900 o anio > 2022 Hacer
		Escribir "ingrese un año valido"
		leer anio
	Fin Mientras
	
	diaAnt = 1
	
	si diaAnt - dia = 0
		dia = 31
		mes = mes - 1
	SiNo
		dia = dia -1
	FinSi
	
	Escribir "el dia anterior es " dia " del mes numero " mes " del año " anio
	
FinSubProceso

//
//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//		representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//		asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
//			los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.