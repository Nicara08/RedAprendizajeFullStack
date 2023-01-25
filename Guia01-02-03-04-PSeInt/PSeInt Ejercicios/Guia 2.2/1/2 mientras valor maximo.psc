Algoritmo sin_titulo
	definir valMax, num,aux como entero
	
	Escribir "ingrese un valor limite maximo positivo"
	leer valMax
	
	Escribir "ingrese un valor inicial"
	leer num
	
	aux = 0
	
	si num >= valMax
		Escribir "fin del sistema!"
	FinSi
	aux = aux + num
	Mientras aux <= valMax Hacer
	Escribir "ingrese otro valor"
	leer num
	aux = aux + num
Fin Mientras

Escribir "su valor final fue de: ", aux
FinAlgoritmo


// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
// números al usuario hasta que la suma de los números introducidos supere el límite inicial.