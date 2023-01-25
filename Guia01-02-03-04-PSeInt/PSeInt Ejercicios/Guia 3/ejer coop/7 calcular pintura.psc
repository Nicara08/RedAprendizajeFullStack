Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion


Algoritmo sin_titulo
	Definir largo, ancho Como Real
	
	Escribir "indique el ancho del muro"
	leer ancho
	Escribir "indique el largo del muro"
	leer largo
	
	calcularPintura(ancho, largo)
	
FinAlgoritmo

SubProceso calcularPintura(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "la cantidad de pintura para el muro seleccionado sera: " superficie * 6 "litros de pintura"
	Escribir ""
	
FinSubProceso
//subprograma calcularPintura
//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en
//cuenta que rinde 6 m2 por litro de pintura.