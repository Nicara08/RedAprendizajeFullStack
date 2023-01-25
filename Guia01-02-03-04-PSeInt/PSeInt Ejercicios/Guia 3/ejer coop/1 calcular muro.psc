Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion

Algoritmo sin_titulo
	Definir espesor Como Entero
	Definir largo, alto Como Real
	
	
	Repetir
		Escribir "indique 1 si el muro sera de 20 cm o 2 si el muro sera de 30 cm de espesor"
		leer espesor
	Mientras Que espesor < 1 o espesor > 2
	
	Escribir "indique el largo de la pared"
	leer largo
	Escribir "indique el alto de la pared"
	leer alto
	
	calcularMuro(espesor, largo, alto)
	
	
	
FinAlgoritmo

SubProceso calcularMuro(espesor, largo, alto)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (largo, alto)
	
	superficieMuro = superficie
	
	si espesor = 1
		Escribir ""
		Escribir "la superficie del muro es " superficie "m2"
		Escribir "usted necesitara la cantidad de cemento de " superficie * 10.9 "kg"
		Escribir "usted necesitara la cantidad de arena de " superficie * 0.09 "m3"
		Escribir "usted necesitara la cantidad de ladrillos de " superficie * 90 " ladrillos"
		Escribir ""
	SiNo
		Escribir ""
		Escribir "la superficie del muro es " superficie "m2"
		Escribir "usted necesitara la cantidad de cemento de " superficie * 15.2 "kg"
		Escribir "usted necesitara la cantidad de arena de " superficie * 0.115 "m3"
		Escribir "usted necesitara la cantidad de ladrillos de " superficie * 120 " ladrillos"
		Escribir ""
		
	FinSi
	
	
	
	
	
FinSubProceso



//subprograma calcularMuro
//Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A
//	partir de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de
//	materiales que necesitaremos para construirlo.
//	Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3
//			de arena y 120 ladrillos.
//		Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de
//				arena y 90 ladrillos.