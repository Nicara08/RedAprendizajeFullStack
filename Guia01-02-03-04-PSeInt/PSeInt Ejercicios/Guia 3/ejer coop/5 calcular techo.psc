Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion


Algoritmo sin_titulo
	Definir largo, espesor, ancho Como Real
	
	Escribir "indique el espesor del techo"
	leer espesor
	Escribir "indique el ancho del techo"
	leer ancho
	Escribir "indique el largo del techo"
	leer largo
	
	calcularTecho(espesor, ancho, largo)
	
FinAlgoritmo

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


//subprograma calcularTecho
//Nos debe pedir espesor, ancho y largo del techo a calcular.
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3
//	de piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//	Debemos mostrar al usuario la cantidad de materiales necesaria.