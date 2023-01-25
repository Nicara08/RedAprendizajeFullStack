Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion


Algoritmo sin_titulo
	Definir largo, ancho Como Real
	
	Escribir "indique el ancho de la habitacion"
	leer ancho
	Escribir "indique el largo de la habitacion"
	leer largo
	
	calcularIluminacion(ancho, largo)
	
FinAlgoritmo

SubProceso calcularIluminacion(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "la cantidad minima de superficie de iluminacion natural es de: " superficie * 0.2 "m2"
	Escribir ""
	
FinSubProceso
//subprograma calcularIluminacion
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente
//forma: superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural
//	(ventanas y puertas de vidrio). Mostrar resultado