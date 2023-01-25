Algoritmo sin_titulo
	definir kg, precio Como Real
	Escribir "ingrese cuantos kg de manzanas necesita para conocer el precio a pagar"
	leer kg
	
	precio = 100
	
	si kg <= 2
		Escribir "usted deberá abonar $", kg * precio
	SiNo
		si kg > 2 Y kg <= 5
			Escribir "usted tiene el 10% de descuento, debera abonar $", (kg * precio) * 0.9
		SiNo
			si kg > 5 Y kg <= 10
				Escribir "usted tiene el 15% de descuento, debera abonar $", (kg * precio) * 0.85
			SiNo
				Escribir "usted tiene el 20% de descuento, debera abonar $", (kg * precio) * 0.8
			FinSi
		FinSi
	FinSi
FinAlgoritmo

//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
// 0 a 2 kg 0 %
// 2,01 a 5 kg el 10%
// 5,01 a 10 kg el 15%
// 10,01 en adelante el 20%
//Determinar cuánto pagará una persona que compre manzanas en esa verdulería