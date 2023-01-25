Funcion retorno <- jornal(turno, horas, feriado)
	Definir retorno Como Real
	
	si turno = 1
		retorno = horas * 90
	SiNo
		retorno = horas * 125
	FinSi
	
	si feriado = "s" Y turno = 1
		retorno = retorno * 1.1		
	SiNo
		si feriado = "s" Y turno = 2
			retorno = retorno * 1.15
		FinSi
	FinSi
	
Fin Funcion

Algoritmo sin_titulo
	Definir contador, trabajadores, turno, horas, i Como Entero
	Definir dia, feriado, nombre Como Caracter
	
	contador = 1
	
		
	Repetir
		contador = contador + 1
		Escribir "ingrese la cantidad de trabajadores"
		leer trabajadores
		
		Para i<-1 Hasta trabajadores Con Paso 1 Hacer
			Escribir "ingrese el nombre del trabajador numero " i
			leer nombre
			Escribir "ingrese el dia de la semana"
			leer dia
			Escribir "ingrese 1 para turno mañana y 2 para turno noche"
			leer turno
			Escribir "ingrese la cantidad de horas trabajadas en el dia " dia
			leer horas
			Escribir "el dia trabajado fue feriado? indique s/n"
			leer feriado
			Escribir "el trabajador " nombre " le corresponde un total de $" jornal(turno, horas, feriado) " por el dia " dia
		Fin Para
	Mientras Que contador < trabajadores
FinAlgoritmo



//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//			debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//				festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.