Algoritmo sin_titulo
	Definir opc Como Caracter
	Definir venTotal, horas, valHora Como Real
	
	Escribir "ingresar condicion de contratacion, a) comision, b) salario fijo + comision y c) salario fijo"
	leer opc
	
	ValHora = 400
	
	Segun opc Hacer
		"a":
			Escribir "ingresar la venta total de la semana"
			leer venTotal
			Escribir "su salario semanal es de: $", venTotal * 0.4
		"b":
			Escribir "Ingrese la cantidad de horas trabajadas"
			leer horas
			Escribir "Ingrese la venta total de la semana"
			leer venTotal
			si horas <= 40
				Escribir "su salario semanal + comision es de: $", horas * ValHora + venTotal * 0.25
			SiNo
				Escribir "su salario semanal + comision es de: $", 40 * ValHora + venTotal * 0.25
			FinSi
		"c":
			Escribir "Ingrese a cantidad de horas trabajadas"
			leer horas
			si horas <= 40
				Escribir "su salario semanal es de $:", horas * ValHora
			SiNo
				Escribir "su salario semanal es de $:", ((horas - 40) * ValHora * 1.5) + 40 * ValHora
			FinSi
		De Otro Modo:
			Escribir "valor ingresado incorrecto"
	Fin Segun
FinAlgoritmo


// Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
// formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
// (lunes a viernes) en base a las 3 modalidades de sueldo:

//a) comisión
//b) salario fijo + comisión, y
//c) salario fijo

//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//	empleado.

//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//del valor de venta total.

//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.