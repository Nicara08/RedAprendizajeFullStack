//Gia 4 EJERCICIOS DE APRENDIZAJE EXTRA 16
//Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
//ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas:
//		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas
//		estadísticas sobre el comportamiento de sus representantes en cada zona. 
//		Se desea hacer un programa que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.
Algoritmo sin_titulo
	Definir I, J, X, Zonas, Suma, SumaNorte, SumaSur, SumaEste, SumaOeste, SumaCentro, SumaVendedor0, SumaVendedor1, SumaVendedor2, SumaVendedor3 Como Entero
	Definir Eleccion, Zona, Vendedor Como Caracter
	Dimension Zonas(5, 4, 30)
	
	Suma = 0; SumaNorte = 0; SumaSur = 0; SumaEste = 0; SumaOeste = 0; SumaCentro = 0; SumaVendedor0 = 0; SumaVendedor1 = 0; SumaVendedor2 = 0; SumaVendedor3 = 0;
	
	Para I = 0 Hasta 4 Hacer
		Para J = 0 Hasta 3 Hacer
			Para X = 0 Hasta 29 Hacer
				Zonas(I, J, X) = Aleatorio(1, 5)
				Suma = Suma + Zonas(I, J, X)
			FinPara
			
			Segun I Hacer
				0:
					SumaNorte = SumaNorte + Suma
				1:
					SumaSur = SumaSur + Suma
				2:
					SumaEste = SumaEste + Suma
				3:
					SumaOeste = SumaOeste + Suma
				4:
					SumaCentro = SumaCentro + Suma
			FinSegun
			
			Segun J Hacer
				0:
					SumaVendedor0 = SumaVendedor0 + Suma
				1:
					SumaVendedor1 = SumaVendedor1 + Suma
				2:
					SumaVendedor2 = SumaVendedor2 + Suma
				3:
					SumaVendedor3 = SumaVendedor3 + Suma
			FinSegun
			
			Suma = 0
		FinPara
		
	FinPara
	
	Hacer
		Borrar Pantalla
		Escribir " ================================================"
		Escribir "|           Menu Distribuidora Nescafé          |"
		Escribir " ================================================"
		Escribir "|     Ingrese una opcion:                       |"
		Escribir "| A - Total de ventas por zona.                 |"
		Escribir "| B - Total ventas por representante.           |"
		Escribir "| C - Total ventas de todos los representantes. |"
		Escribir "| D - Salir                                     |"
		Escribir "================================================="
		Leer Eleccion
		Eleccion = Mayusculas(Eleccion)
		Segun Eleccion Hacer
			"A":
				Escribir "Ingrese la zona: Norte(N) Sur(S) Este(E) Oeste(O) Centro(C) : "
				Leer Zona
				Zona = Mayusculas(Zona)
				Segun Zona Hacer
					"N":
						Escribir "Total ventas zona Norte : " SumaNorte
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"S":
						Escribir "Total ventas zona Sur : " SumaSur
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"E":
						Escribir "Total ventas zona Este : " SumaEste
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"O":
						Escribir "Total ventas zona Oeste : " SumaOeste
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"C":
						Escribir "Total ventas zona Centro : " SumaCentro
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					De Otro Modo:
						Escribir "Ingresar una opcion correcta. "
						Leer Zona
				FinSegun
				
			"B":
				Escribir "Seleccionar vendedor : Ozuna(1), Bad Bunny(2), Duki(3), FMK(4)"
				Leer Vendedor
				Segun Vendedor Hacer
					"1":
						Escribir "Ozuna vendio un total de : " SumaVendedor0
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"2":
						Escribir "Bad Bunny vendio un total de : " SumaVendedor1
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"3":
						Escribir "Duki vendio un total de : " SumaVendedor2
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					"4":
						Escribir "FMK vendio un total de : " SumaVendedor3
						Escribir "Pulsar tecla para volver al menu principal. "
						Esperar Tecla
					De Otro Modo:
						Escribir "Ingresar una opcion valida : "
						Leer Vendedor
				FinSegun
				
			"C":
				Escribir "La suma total es : " SumaVendedor1 + SumaVendedor2 + SumaVendedor3 + SumaVendedor4
				Escribir "Pulsar tecla para volver al menu principal. "
				Esperar Tecla
			"D":
				Si Eleccion = "D" Entonces
					Escribir "Presione una tecla para abondanar el sistema"
				FinSi
				Esperar Tecla
			De Otro Modo:
				Escribir "Error de seleccion."
				Escribir "Pulsar tecla para volver al menu principal. "
				Esperar Tecla
		FinSegun
		
	Mientras Que Eleccion <> "D"
FinAlgoritmo