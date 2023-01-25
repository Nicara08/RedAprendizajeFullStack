Algoritmo sin_titulo
	Definir largo Como Real
	
	Escribir "Indique el largo de la columna"
	leer largo
	
	calcularColumna(largo)
	
FinAlgoritmo

SubProceso calcularColumna(largo)
	
	Escribir ""
	Escribir "Por metro lineal de columna se necesitara " largo * 7.5 "kg de cemento"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.016 "m3 de arena"
	Escribir "Por metro lineal de viga se necesitara " largo * 0.016 "m2 de piedra"
	Escribir "Por metro lineal de viga se necesitara " largo * 6 "m de hierro del 10"
	Escribir "Por metro lineal de viga se necesitara " largo * 3 "m de hierro del 4"
	Escribir ""
	
FinSubProceso

//subprograma calcularColumna
//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg
//	de cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro
//	del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.