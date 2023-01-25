Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion

Funcion retorno <- calcularVolumen(espesor, ancho, largo)
	Definir retorno Como Real
	
	retorno = espesor * ancho * largo
	
Fin Funcion


Algoritmo sin_titulo
	Definir opc como entero
	
	Repetir
		Escribir "ingrese una opcion del menu"
		escribir "1 - Calcular muro de ladrillo"
		escribir "2 - Calcular viga de hormigón"
		escribir "3 - Calcular columnas de hormigón"
		escribir "4 - Calcular contrapisos"
		escribir "5 - Calcular techo"
		escribir "6 - Calcular pisos"
		escribir "7 - Calcular pintura"
		escribir "8 - Calcular iluminación"
		escribir "9 - Salir"
		leer opc
		menu(opc)
	Mientras Que opc < 9 Y opc > 0
	

	
	
FinAlgoritmo

SubProceso menu(opc)
	Definir largo, alto, ancho, espesor Como Real
	
		
	Segun opc Hacer
		1: 
			Repetir
				Escribir "indique 1 si el muro sera de 20 cm o 2 si el muro sera de 30 cm de espesor"
				leer espesor
			Mientras Que espesor < 1 o espesor > 2
			
			Escribir "indique el largo de la pared"
			leer largo
			Escribir "indique el alto de la pared"
			leer alto
			
			calcularMuro(espesor, largo, alto)
			
		2:
			Escribir "Indique el largo de la viga"
			leer largo
			
			calcularViga(largo)
			
		3:
			Escribir "Indique el largo de la columna"
			leer largo
			
			calcularColumna(largo)
			
		4:
			Escribir "indique el espesor del contrapiso"
			leer espesor
			Escribir "indique el ancho del contrapiso"
			leer ancho
			Escribir "indique el largo del contrapiso"
			leer largo
			
			calcularContrapisos(espesor, ancho, largo)
			
		5: 
			Escribir "indique el espesor del techo"
			leer espesor
			Escribir "indique el ancho del techo"
			leer ancho
			Escribir "indique el largo del techo"
			leer largo
			
			calcularTecho(espesor, ancho, largo)
			
		6: 
			Escribir "indique el ancho del piso"
			leer ancho
			Escribir "indique el largo del piso"
			leer largo
			
			calcularPisos(ancho, largo)
			
		7:
			Escribir "indique el ancho del muro"
			leer ancho
			Escribir "indique el largo del muro"
			leer largo
			
			calcularPintura(ancho, largo)
			
		8:
			Escribir "indique el ancho de la habitacion"
			leer ancho
			Escribir "indique el largo de la habitacion"
			leer largo
			
			calcularIluminacion(ancho, largo)
			
		De Otro Modo:
			Escribir "Gracias por utilizar la calculadora de materiales!"
	Fin Segun
FinSubProceso

SubProceso calcularMuro(espesor, largo, alto)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (largo, alto)
	
	
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

SubProceso calcularViga(largo)
	
	Escribir ""
	Escribir "Por metro lineal de viga se necesitara " largo * 9 "kg de cemento"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.02 "m3 de arena"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.02 "m2 de piedra"
	Escribir "Por metro lineal de viga se necesitara " largo * 4 "m de hierro del 8"
	Escribir "Por metro lineal de viga se necesitara " largo * 3 "m de hierro del 4"
	Escribir ""
	
FinSubProceso

SubProceso calcularColumna(largo)
	
	Escribir ""
	Escribir "Por metro lineal de columna se necesitara " largo * 7.5 "kg de cemento"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.016 "m3 de arena"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.016 "m2 de piedra"
	Escribir "Por metro lineal de viga se necesitara " largo * 6 "m de hierro del 10"
	Escribir "Por metro lineal de viga se necesitara " largo * 3 "m de hierro del 4"
	Escribir ""
	
FinSubProceso

SubProceso calcularContrapisos(espesor, ancho, largo)
	Definir volumen Como Real
	
	volumen = calcularVolumen(espesor, ancho, largo)
	
	Escribir ""
	Escribir "la cantidad de m3 de contra piso sera de: " volumen "m3"
	Escribir "Por metro cúbico de contrapiso se necesita: " volumen * 105 "kg de cemento"
	Escribir "Por metro cúbico de contrapiso se necesita: " volumen * 0.45 "m3 de arena"
	Escribir "Por metro cúbico de contrapiso se necesita: " volumen * 0.9 "m3 de piedra"
	Escribir ""
	
FinSubProceso

SubProceso calcularTecho(espesor, ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "Por metro cuadrado de techo se necesita: " superficie * 33 "kg de cemento"
	Escribir "Por metro cuadrado de techo se necesita: " superficie * 0.072 "m3 de arena"
	Escribir "Por metro cuadrado de techo se necesita: " superficie * 0.072 "m2 de piedra"
	Escribir "Por metro cuadrado de techo se necesita: " superficie * 7 "m de hierro del 8"
	Escribir "Por metro cuadrado de techo se necesita: " superficie * 4 "m de hierro del 6"
	Escribir ""
	
FinSubProceso

SubProceso calcularPisos(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "los metros cuadrados de piso necesario + el 10% es: " superficie * 1.1 "m2"
	Escribir ""
	
FinSubProceso

SubProceso calcularPintura(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "la cantidad de pintura para el muro seleccionado sera: " superficie * 6 " litros de pintura"
	Escribir ""
	
FinSubProceso

SubProceso calcularIluminacion(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "la cantidad minima de superficie de iluminacion natural es de: " superficie * 0.2 "m2"
	Escribir ""
	
FinSubProceso
