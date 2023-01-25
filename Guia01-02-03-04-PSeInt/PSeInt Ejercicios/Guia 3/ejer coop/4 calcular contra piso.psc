
Algoritmo sin_titulo
	Definir espesor, ancho, largo Como Real
	
	Escribir "indique el espesor del contrapiso"
	leer espesor
	Escribir "indique el ancho del contrapiso"
	leer ancho
	Escribir "indique el largo del contrapiso"
	leer largo
	
	calcularContrapisos(espesor, ancho, largo)
	
FinAlgoritmo

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

Funcion retorno <- calcularVolumen(espesor, ancho, largo)
	Definir retorno Como Real
	
	retorno = espesor * ancho * largo
	
Fin Funcion

//subprograma calcularContrapisos
//Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
//Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3
//	de piedra.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.