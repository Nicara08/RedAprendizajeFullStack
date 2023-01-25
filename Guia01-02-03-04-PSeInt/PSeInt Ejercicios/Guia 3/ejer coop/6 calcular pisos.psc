Funcion retorno <- calcularSuperficie ( largo, alto )
	Definir retorno Como Real
	
	retorno = largo * alto
	
Fin Funcion


Algoritmo sin_titulo
	Definir largo, espesor, ancho Como Real
	
	Escribir "indique el ancho del piso"
	leer ancho
	Escribir "indique el largo del piso"
	leer largo
	
	calcularPisos(ancho, largo)
	
FinAlgoritmo

SubProceso calcularPisos(ancho, largo)
	Definir superficie Como Real
	
	superficie = calcularSuperficie (ancho, largo)
	
	Escribir ""
	Escribir "los metros cuadrados de piso necesario + el 10% es: " superficie * 1.1 "m2"
	Escribir ""
	
FinSubProceso

//subprograma calcularPisos
//Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe
//calcular la superficie y añadirle un 10% extra por recortes
//Mostrar el resultado en m2