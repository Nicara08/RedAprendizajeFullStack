Algoritmo sin_titulo
	Definir cantLlan Como entero
	Escribir "ingrese la cantidad de llantas que requiere comprar"
	leer cantLlan
	
	si cantLlan <= 4
		Escribir "el importe por llanta a pagar es de $3000, total de ", "$ ", cantLlan * 3000
	SiNo
		si cantLlan >= 5 y cantLlan <= 10
			Escribir "el importe por llanta a pagar es de $2500, total de ", "$ ", cantLlan * 2500
		SiNo
			Escribir "el importe por llanta a pagar es de $2000, total de ", "$ ", cantLlan * 2000
		FinSi
	FinSi
FinAlgoritmo





// Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
// entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
// Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
// llantas que compra, y el monto total que tiene que pagar por el total de la compra.
