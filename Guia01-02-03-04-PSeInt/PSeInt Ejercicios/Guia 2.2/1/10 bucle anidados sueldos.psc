Algoritmo sin_titulo
	Definir sueldo, CantVentas, Ventas, empleados, contador, contador2, aux como real
	
	Escribir "ingrese la cantidad de vendedores"
	leer empleados
	
	
	Para contador<-1 Hasta empleados Con Paso 1 Hacer
		Escribir "ingrese el sueldo del vendedor n� " contador
		leer sueldo
		Escribir "ingrese la cantidad de ventas realizadas del empleado n� " contador
		leer CantVentas
		ventas = 0
		aux = 0
		Para contador2<-1 Hasta CantVentas Con Paso 1 Hacer
			Escribir "indique el monto total de la venta n� " contador2
			leer Ventas
			aux = aux + ventas
		Fin Para
		Escribir "el sueldo base del empleado N� " contador " es de $" sueldo " + la comision del 10% de $" aux * 0.1 " sumando un total de $" (aux * 0.1) + sueldo
	Fin Para
FinAlgoritmo


//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.