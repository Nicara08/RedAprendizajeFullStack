Algoritmo sin_titulo
	Definir largo Como Real
	
	Escribir "Indique el largo de la viga"
	leer largo
	
	calcularViga(largo)
	
FinAlgoritmo

SubProceso calcularViga(largo)
	
	Escribir ""
	Escribir "Por metro lineal de viga se necesitara " largo * 9 "kg de cemento"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.02 "m3 de arena"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.02 "m2 de piedra"
	Escribir "Por metro lineal de viga se necesitara " largo * 4 "m de hierro del 8"
	Escribir "Por metro lineal de viga se necesitara " largo * 3 "m de hierro del 4"
	Escribir ""
	
FinSubProceso




//subprograma calcularViga
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento,
//	0.02 m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.