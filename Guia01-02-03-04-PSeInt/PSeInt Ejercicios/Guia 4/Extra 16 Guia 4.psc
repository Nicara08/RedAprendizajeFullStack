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
	
	Definir I, Norte, Sur, Este, Oeste, Centro Como Entero
	Definir Contador1, Contador2, Contador3, Contador4, Vendedor1, Vendedor2, Vendedor3, Vendedor4 Como Entero
	Definir SumaNorte, SumaSur, SumaEste, SumaOeste, SumaCentro, SumaVendedor1, SumaVendedor2, SumaVendedor3, SumaVendedor4 Como Entero
	Definir Eleccion, Zona, Vendedor Como Caracter
	
///Zonas	
	Dimension Norte(30)
	Dimension Sur(30)
	Dimension Este(30)
	Dimension Oeste(30)
	Dimension Centro(30)
	
///Vendedores	
	Dimension Vendedor1(30)
	Dimension Vendedor2(30)
	Dimension Vendedor3(30)
	Dimension Vendedor4(30)
	
///Contadores	
	Contador1 = 0
	Contador2 = 0
	Contador3 = 0
	Contador4 = 0
	
///Suma Zonas	
	SumaNorte = 0
	SumaSur = 0
	SumaEste = 0
	SumaOeste = 0
	SumaCentro = 0
	
///Suma Vendedores	
	SumaVendedor1 = 0
	SumaVendedor2 = 0
	SumaVendedor3 = 0
	SumaVendedor4 = 0
	
///Bucle para llenar los vectores de los vendedores	
	Para I = 0 Hasta 29 Hacer
		Vendedor1(I) = 0
		Vendedor2(I) = 0
		Vendedor3(I) = 0
		Vendedor4(I) = 0
	FinPara
	
///Bucle Principal	
	Para I = 0 Hasta 29 Hacer
		
///Llenado de Zona con Vendedores aleatorios		
		Norte(I) = Aleatorio(1, 4)
		Sur(I) = Aleatorio(1, 4)
		Este(I) = Aleatorio(1, 4)
		Oeste(I) = Aleatorio(1, 4)
		Centro(I) = Aleatorio(1, 4)
		
///Condicional anidado para realizar las sumas
		Si Norte(I) = 1 Entonces///Inicia Condicional Norte Vendedor 1
			Contador1 = Contador1 + 1///Suma Contador 1
			Vendedor1(I) = Aleatorio(1, 10)///Llena Vector Vendedor 1
			SumaVendedor1 = SumaVendedor1 + Vendedor1(I)///Suma Ventas Vendedor 1
			SumaNorte = SumaNorte + Vendedor1(I)///Suma Ventas Norte
		SiNo///Cambio Vendedor 2
			Si Norte(I) = 2 Entonces///Inicia Condicional Norte Vendedor 2
				Contador2 = Contador2 + 1///Suma Contador 2
				Vendedor2(I) = Aleatorio(1, 10)///Llena Vector Vendedor 2
				SumaVendedor2 = SumaVendedor2 + Vendedor2(I)///Suma Ventas Vendedor 2
				SumaNorte = SumaNorte + Vendedor2(I)///Suma Ventas Norte
			SiNo///Cambio Vendedor 3
				Si Norte(I) = 3 Entonces///Inicia Condicional Norte Vendedor 3
					Contador3 = Contador3 + 1///Suma Contador 3
					Vendedor3(I) = Aleatorio(1, 10)///Llena Vector Vendedor 3
					SumaVendedor3 = SumaVendedor3 + Vendedor3(I)///Suma Ventas Vendedor 3
					SumaNorte = SumaNorte + Vendedor3(I)///Suma Ventas Norte
				SiNo///Cambio Vendedor 4
					Si Norte(I) = 4 Entonces///Inicia Condicional Norte Vendedor 4
						Contador4 = Contador4 + 1///Suma Contador 4
						Vendedor4(I) = Aleatorio(1, 10)///Llena Vector Vendedor 4
						SumaVendedor4 = SumaVendedor4 + Vendedor4(I)///Suma Ventas Vendedor 4
						SumaNorte = SumaNorte + Vendedor4(I)///Suma Ventas Norte
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si Sur(I) = 1 Entonces///Inicia Condicional Sur Vendedor 1
			Contador1 = Contador1 + 1///Suma Contador 1
			Vendedor1(I) = Aleatorio(1, 10)///Llena Vector Vendedor 1
			SumaVendedor1 = SumaVendedor1 + Vendedor1(I)///Suma Ventas Vendedor 1
			SumaSur = SumaSur + Vendedor1(I)///Suma Ventas Sur
		SiNo///Cambio Vendedor 2
			Si Sur(I) = 2 Entonces///Inicia Condicional Sur Vendedor 2
				Contador2 = Contador2 + 1///Suma Contador 2
				Vendedor2(I) = Aleatorio(1, 10)///Llena Vector Vendedor 2
				SumaVendedor2 = SumaVendedor2 + Vendedor2(I)///Suma Ventas Vendedor 2
				SumaSur = SumaSur + Vendedor2(I)///Suma Ventas Sur
			SiNo///Cambio Vendedor 3
				Si Sur(I) = 3 Entonces///Inicia Condicional Sur Vendedor 3
					Contador3 = Contador3 + 1///Suma Contador 3
					Vendedor3(I) = Aleatorio(1, 10)///Llena Vector Vendedor 3
					SumaVendedor3 = SumaVendedor3 + Vendedor3(I)///Suma Ventas Vendedor 3
					SumaSur = SumaSur + Vendedor3(I)///Suma Ventas Sur
				SiNo///Cambio Vendedor 4
					Si Sur(I) = 4 Entonces///Inicia Condicional Sur Vendedor 4
						Contador4 = Contador4 + 1///Suma Contador 4
						Vendedor4(I) = Aleatorio(1, 10)///Llena Vector Vendedor 4
						SumaVendedor4 = SumaVendedor4 + Vendedor4(I)///Suma Ventas Vendedor 4
						SumaSur = SumaSur + Vendedor4(I)///Suma Ventas Sur
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si Este(I) = 1 Entonces///Inicia Condicional Este Vendedor 1
			Contador1 = Contador1 + 1///Suma Contador 1
			Vendedor1(I) = Aleatorio(1, 10)///Llena Vector Vendedor 1
			SumaVendedor1 = SumaVendedor1 + Vendedor1(I)///Suma Ventas Vendedor 1
			SumaEste = SumaEste + Vendedor1(I)///Suma Ventas Este
		SiNo///Cambio Vendedor 2
			Si Este(I) = 2 Entonces///Inicia Condicional Este Vendedor 2
				Contador2 = Contador2 + 1///Suma Contador 2
				Vendedor2(I) = Aleatorio(1, 10)///Llena Vector Vendedor 2
				SumaVendedor2 = SumaVendedor2 + Vendedor2(I)///Suma Ventas Vendedor 2
				SumaEste = SumaEste + Vendedor2(I)///Suma Ventas Este
			SiNo///Cambio Vendedor 3
				Si Este(I) = 3 Entonces///Inicia Condicional Este Vendedor 3
					Contador3 = Contador3 + 1///Suma Contador 3
					Vendedor3(I) = Aleatorio(1, 10)///Llena Vector Vendedor 3
					SumaVendedor3 = SumaVendedor3 + Vendedor3(I)///Suma Ventas Vendedor 3
					SumaEste = SumaEste + Vendedor3(I)///Suma Ventas Este
				SiNo///Cambio Vendedor 4
					Si Este(I) = 4 Entonces///Inicia Condicional Este Vendedor 4
						Contador4 = Contador4 + 1///Suma Contador 4
						Vendedor4(I) = Aleatorio(1, 10)///Llena Vector Vendedor 4
						SumaVendedor4 = SumaVendedor4 + Vendedor4(I)///Suma Ventas Vendedor 4
						SumaEste = SumaEste + Vendedor4(I)///Suma Ventas Este
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si Oeste(I) = 1 Entonces///Inicia Condicional Oeste Vendedor 1
			Contador1 = Contador1 + 1///Suma Contador 1
			Vendedor1(I) = Aleatorio(1, 10)///Llena Vector Vendedor 1
			SumaVendedor1 = SumaVendedor1 + Vendedor1(I)///Suma Ventas Vendedor 1
			SumaOeste = SumaOeste + Vendedor1(I)///Suma Ventas Oeste
		SiNo///Cambio Vendedor 2
			Si Oeste(I) = 2 Entonces///Inicia Condicional Oeste Vendedor 2
				Contador2 = Contador2 + 1///Suma Contador 2
				Vendedor2(I) = Aleatorio(1, 10)///Llena Vector Vendedor 2
				SumaVendedor2 = SumaVendedor2 + Vendedor2(I)///Suma Ventas Vendedor 2
				SumaOeste = SumaOeste + Vendedor2(I)///Suma Ventas Oeste
			SiNo///Cambio Vendedor 3
				Si Oeste(I) = 3 Entonces///Inicia Condicional Oeste Vendedor 3
					Contador3 = Contador3 + 1///Suma Contador 3
					Vendedor3(I) = Aleatorio(1, 10)///Llena Vector Vendedor 3
					SumaVendedor3 = SumaVendedor3 + Vendedor3(I)///Suma Ventas Vendedor 3
					SumaOeste = SumaOeste + Vendedor3(I)///Suma Ventas Oeste
				SiNo///Cambio Vendedor 4
					Si Oeste(I) = 4 Entonces///Inicia Condicional Oeste Vendedor 4
						Contador4 = Contador4 + 1///Suma Contador 4
						Vendedor4(I) = Aleatorio(1, 10)///Llena Vector Vendedor 4
						SumaVendedor4 = SumaVendedor4 + Vendedor4(I)///Suma Ventas Vendedor 4
						SumaOeste = SumaOeste + Vendedor4(I)///Suma Ventas Oeste
					FinSi
				FinSi
			FinSi
		FinSi
		
		Si Centro(I) = 1 Entonces///Inicia Condicional Centro Vendedor 1
			Contador1 = Contador1 + 1///Suma Contador 1
			Vendedor1(I) = Aleatorio(1, 10)///Llena Vector Vendedor 1
			SumaVendedor1 = SumaVendedor1 + Vendedor1(I)///Suma Ventas Vendedor 1
			SumaCentro = SumaCentro + Vendedor1(I)///Suma Ventas Centro
		SiNo///Cambio Vendedor 2
			Si Centro(I) = 2 Entonces///Inicia Condicional Centro Vendedor 2
				Contador2 = Contador2 + 1///Suma Contador 2
				Vendedor2(I) = Aleatorio(1, 10)///Llena Vector Vendedor 2
				SumaVendedor2 = SumaVendedor2 + Vendedor2(I)///Suma Ventas Vendedor 2
				SumaCentro = SumaCentro + Vendedor2(I)///Suma Ventas Centro
			SiNo///Cambio Vendedor 3
				Si Centro(I) = 3 Entonces///Inicia Condicional Centro Vendedor 3
					Contador3 = Contador3 + 1///Suma Contador 3
					Vendedor3(I) = Aleatorio(1, 10)///Llena Vector Vendedor 3
					SumaVendedor3 = SumaVendedor3 + Vendedor3(I)///Suma Ventas Vendedor 3
					SumaCentro = SumaCentro + Vendedor3(I)///Suma Ventas Centro
				SiNo///Cambio Vendedor 4
					Si Centro(I) = 4 Entonces///Inicia Condicional Centro Vendedor 4
						Contador4 = Contador4 + 1///Suma Contador 4
						Vendedor4(I) = Aleatorio(1, 10)///Llena Vector Vendedor 4
						SumaVendedor4 = SumaVendedor4 + Vendedor4(I)///Suma Ventas Vendedor 4
						SumaCentro = SumaCentro + Vendedor4(I)///Suma Ventas Centro
					FinSi
				FinSi
			FinSi
		FinSi
///Tutores (se puede comentar)
//		Escribir I
//		Escribir "Norte:" Norte(I) " -Sur:" Sur(I) " -Este:" Este(I) " -Oeste:" Oeste(I) " -Centro:" Centro(I) " -C1:" Contador1 " -C2:" Contador2 " -C3:" Contador3 " -C4:" Contador4///Zonas, Contadores
//		Escribir "V1:" Vendedor1(I) " -V2:" Vendedor2(I) " -V3:" Vendedor3(I) " -V4:" Vendedor4(I)///Cantidad de ventas
//		Escribir "Suma Norte: " SumaNorte " -Suma Sur: " SumaSur " -Suma Este: " SumaEste " -Suma Oeste: " SumaOeste " -Suma Centro: " SumaCentro///Suma Zonas
//		Escribir "Suma V1: " SumaVendedor1 " -Suma V2: " SumaVendedor2 " -Suma V3: " SumaVendedor3 " -Suma V3: " SumaVendedor4///Suma Vendedores
//		Escribir "-----------------------------------------------------------------"
//		Esperar Tecla
	FinPara
	
///Inici Menu	
	Hacer
		Borrar Pantalla///Limpia pantalla
		Escribir " ========================================================"
		Escribir "                Menu Distribuidora Nescafé               "
		Escribir " ========================================================"
		Escribir "|     Ingrese una opcion:                               |"
		Escribir "| A - Total de ventas por zona.                         |"
		Escribir "| B - Total ventas por representante.                   |"
		Escribir "| C - Total ventas de todos los representantes.         |"
		Escribir "| D - Salir                                             |"
		Escribir "========================================================"
		Leer Eleccion
		Eleccion = Mayusculas(Eleccion)
		
///Inicia Menu	
		Segun Eleccion Hacer
			"A":///Zonas
				Escribir "Ingrese la zona: Norte(N) Sur(S) Este(E) Oeste(O) Centro(C) : "
				Leer Zona
				Zona = Mayusculas(Zona)
					
				Segun Zona Hacer///Inicia Zonas
					"N":///Zona Norte
						Escribir "Total ventas zona Norte : " SumaNorte///Total Norte
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"S":///Zona Sur
						Escribir "Total ventas zona Sur : " SumaSur///Total Sur
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"E":///Zona Este
						Escribir "Total ventas zona Este : " SumaEste///Total Este
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"O":///Zona Oeste
						Escribir "Total ventas zona Oeste : " SumaOeste///Total Oeste
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"C":///Zona Centro
						Escribir "Total ventas zona Centro : " SumaCentro///Total Centro
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					De Otro Modo:
						Escribir "Ingresar una opcion correcta. "///Retorno
						Leer Zona
				FinSegun
				
			"B":///Suma Vendedores
				Escribir "Seleccionar vendedor : Ozuna(1), Bad Bunny(2), Duki(3), FMK(4)"
				Leer Vendedor
					
				Segun Vendedor Hacer///Inicia Suma Vendedores
					"1":///Vendedor 1
						Escribir "Ozuna vendio un total de : " SumaVendedor1///Total Vendedor 1
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"2":///Vendedor 2
						Escribir "Bad Bunny vendio un total de : " SumaVendedor2///Total Vendedor 2
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"3":///Vendedor 3
						Escribir "Duki vendio un total de : " SumaVendedor3///Total Vendedor 3
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
					"4":///Vendedor 4
						Escribir "FMK vendio un total de : " SumaVendedor4///Total Vendedor 4
						Escribir "Pulsar tecla para volver al menu principal. "///Retorno
						Esperar Tecla
						
					De Otro Modo:
						Escribir "Ingresar una opcion valida : "///Retorno
						Leer Vendedor
				FinSegun
				
			"C":///Suma Total Vendedores
				Escribir "La suma total es : " SumaVendedor1 + SumaVendedor2 + SumaVendedor3 + SumaVendedor4///Total Vendedores
				Escribir "Pulsar tecla para volver al menu principal. "///Retorno
				Esperar Tecla
				
			De Otro Modo:
				Escribir "Error de seleccion."
				Escribir "Pulsar tecla para volver al menu principal. "///Retorno
				Esperar Tecla
		FinSegun
		
		Si Eleccion = "D" Entonces
			Escribir "Presione una tecla para abondanar el sistema"///Exit
		FinSi
		Esperar Tecla
	Mientras Que Eleccion <> "D"

FinAlgoritmo
