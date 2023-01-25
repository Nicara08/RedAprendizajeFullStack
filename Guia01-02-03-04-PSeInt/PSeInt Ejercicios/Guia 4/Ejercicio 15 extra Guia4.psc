//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.
//El informe final tendrá un formato como el que se muestra a continuación:
//	Lunes Martes Miércoles Jueves Viernes Total producto
//	Producto 1
//	Producto 2
//	Producto 3
//	Producto 4
//	Producto 5
//	Total semana
//	Producto más
//vendido
Algoritmo sin_titulo
	Definir Matriz, A, B, C, D, Ventas, FilasVentas, ColumnasVentas, SumaTotal, AcumuladorProducto, AcumuladorIndice, AcumuladorTotal, AcumuladorIndiceTotal Como Entero
	Definir Productos, Dias, ProductosMasVendidos Como Caracter
	
	Dimension Matriz(5, 5)
	Dimension Productos(7)
	Dimension Dias(7)
	Dimension ProductosMasVendidos(5)
	
	MasVendido(ProductosMasVendidos)
	ListaProducto(Productos)
	ListaDias(Dias)
	
	FilasVentas = 0
	ColumnasVentas = 0
	SumaTotal = 0
	AcumuladorProducto = 0
	AcumuladorIndice = 0
	AcumuladorTotal = 0
	AcumuladorIndiceTotal = 0
	
	Para A = 0 Hasta 6 Hacer
		Escribir Sin Saltar Dias(A)
	FinPara
	Escribir ""
	Para A = 0 Hasta 6 Hacer
		Escribir Sin Saltar Productos(A)
		Si A < 5 Entonces
			Para B = 0 Hasta 4 Hacer
				Matriz(A, B) = Aleatorio(1, 50)
				FilasVentas = Matriz(A, B) + FilasVentas
				Ventas = Matriz(A, B)
				Si FilasVentas > AcumuladorTotal Entonces
					AcumuladorTotal = FilasVentas
					AcumuladorIndiceTotal = A
				FinSi
				Escribir Sin Saltar NumeroEspacio(Ventas) "|"
			FinPara
			Escribir Sin Saltar NumeroEspacio(FilasVentas) "|"
			FilasVentas = 0
		FinSi
		Si A = 5 Entonces
			Para C = 0 Hasta 4 Hacer
				Para D = 0 Hasta 4 Hacer
					ColumnasVentas = Matriz(D, C) + ColumnasVentas
				FinPara
				SumaTotal = ColumnasVentas + SumaTotal
				Escribir Sin Saltar NumeroEspacio(ColumnasVentas) "|"
				ColumnasVentas = 0
			FinPara
			Escribir Sin Saltar NumeroEspacio(SumaTotal) "|"
		FinSi
		Si A = 6 Entonces
			Para C = 0 Hasta 4 Hacer
				Para D = 0 Hasta 4 Hacer
					Si Matriz(D, C) > AcumuladorProducto Entonces
						AcumuladorProducto = Matriz(D, C)
						AcumuladorIndice = D
					FinSi
				FinPara
				Escribir Sin Saltar ProductosMasVendidos(AcumuladorIndice)
				AcumuladorIndice= 0
				AcumuladorProducto = 0
			FinPara
			Escribir Sin Saltar Mayusculas(ProductosMasVendidos(AcumuladorIndiceTotal))
		FinSi
		Escribir ""
	FinPara
	
FinAlgoritmo

SubProceso MasVendido(ProductoMasV Por Referencia)
	Definir A Como Entero
	Definir NumeroATexto Como Caracter
	Para A = 0 Hasta 4 Hacer
		NumeroATexto = ConvertirATexto(A + 1)
		ProductoMasV(A) = "Producto " + NumeroATexto + "     |"
	FinPara
FinSubProceso

SubProceso ListaProducto(Prod Por Referencia)
	Prod(0)="|Producto 1             |"
    Prod(1)="|Producto 2             |"
    Prod(2)="|Producto 3             |"
    Prod(3)="|Producto 4             |"
    Prod(4)="|Producto 5             |"
    Prod(5)="|Total semana           |"
    Prod(6)="|Producto mas vendido   |"
FinSubProceso

SubProceso ListaDias(D Por Referencia)
	D(0)="|_______________________|"
    D(1)="Lunes          |"
    D(2)="Martes         |"
    D(3)="Miercoles      |"
    D(4)="Jueves         |"
    D(5)="Viernes        |"
    D(6)="Total producto |"
FinSubProceso

Funcion NumeroConvertido = NumeroEspacio(Num)
    Definir NumeroConvertido Como Caracter
    Definir A, LargoTexto Como Entero
    NumeroConvertido = ConvertirATexto(Num)
    LargoTexto = Longitud(NumeroConvertido)
    Para A = LargoTexto Hasta 14 Hacer
        NumeroConvertido = NumeroConvertido + " "
    FinPara
FinSubProceso