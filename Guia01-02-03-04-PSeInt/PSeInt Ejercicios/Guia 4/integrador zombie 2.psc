Algoritmo sin_titulo
	Definir matriz, codigo Como caracter
	Definir i, j, opc, num, genz, contador Como Entero
	i=0;j=0;contador=0
	
	Repetir
		Escribir "ingrese el tamaño de la muestra: 1 (3), 2 (4) o 3 (37)"
		leer opc
		Borrar Pantalla
	Mientras Que opc < 1 o opc > 3
	
	mat(opc, num)
//	Escribir num
	
	Dimension matriz(num,num)
	
	Repetir
		completarMatriz(matriz, num, codigo)
		analizarMatriz(matriz, num, i, j, genz)
		contador = contador + 1
		Escribir " "
	Mientras Que num <> (genz/2)
	Escribir "la muestra numero " contador " es gen z"
	
FinAlgoritmo

SubProceso mat(opc, num Por Referencia)
	
	Segun opc Hacer
		1:
			num=3
		2:
			num=4
		3:
			num=37
	Fin Segun
FinSubProceso

SubProceso completarMatriz(matriz, num, codigo Por Referencia)
	Definir i,j,aux Como Entero

	
	Para i<-0 Hasta num-1 Con Paso 1 Hacer
		Para j<-0 Hasta num-1 Con Paso 1 Hacer
			aux=Aleatorio(1,4)
			letra(aux, codigo)
			matriz(i,j) = codigo
			Escribir Sin Saltar matriz(i,j) " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso
	
SubProceso letra(aux, codigo Por Referencia)
	
	Segun aux Hacer
		1:
			codigo = "A"
		2:
			codigo = "B"
		3:
			codigo = "C"
		4:
			codigo = "D"
	Fin Segun
FinSubProceso

SubProceso analizarMatriz(matriz, num, i, j, genz Por Referencia)
	Definir aux1, aux2 Como Caracter
	Definir contador, contador1, contadorI, contadorJ Como Entero
	
	contador=1; contador1=1; contadorI=0; contadorJ=num-1
	
		Para i<-0 Hasta num-1 Con Paso 1 Hacer
			Para j<-0 Hasta num-1 Con Paso 1 Hacer
				si i = 0 y j = 0
					aux1 = matriz(i,j)
					Para i<-0 Hasta num-1 Con Paso 1 Hacer
						Para j<-num-1 Hasta 0 Con Paso -1 Hacer
							si i = 0 y j = num-1
								aux2 = matriz(i,j)
							SiNo
								si i = contadorI y j = contadorJ
									si matriz(i,j) = aux2
										contador1 = contador1 + 1
										//									Escribir Sin Saltar contador1
									FinSi
								FinSi
							FinSi
							
						Fin Para
						contadorI = contadorI + 1
						contadorJ = contadorJ - 1
					Fin Para
					i=0
					j=0
				SiNo
					si i = j
						si matriz(i,j) = aux1
							contador = contador + 1
							//						Escribir Sin Saltar contador
						FinSi
					FinSi
				FinSi
			Fin Para
		Fin Para
		genz = contador + contador1
//		Escribir genz
FinSubProceso
	