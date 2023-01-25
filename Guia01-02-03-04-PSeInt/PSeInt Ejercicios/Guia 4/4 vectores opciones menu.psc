Algoritmo sin_titulo
	Definir cantidad, vectorA, vectorB, vectorC, suma, resta, c, i, auxA, auxB como entero
	Definir opc, opc1 Como Caracter
	
	Escribir "ingrese la longitud del vector"
	leer cantidad
	
	Dimension vectorA(cantidad)
	Dimension vectorB(cantidad)
	Dimension vectorC(cantidad)
	
	suma=0
	resta=0
	c=0
	
	Repetir 
		
		Escribir "Bienvenido al sistema"
		Escribir "A - llenar vector A"
		Escribir "B - llenar vector B"
		Escribir "C - llenar vector C con la suma de A + B"
		Escribir "D - llenar vector D con la resta de B - A"
		Escribir "E - mostrar vector A, B o C"
		Escribir "F - salir del sistema"
		leer opc
		opc = Minusculas(opc)
		si opc = "f"
		SiNo
			
		si opc <> "a" Y opc <> "b" Y opc <> "c" Y opc <> "d" Y opc <> "e"
			Escribir ""
			Escribir "ingrese una opcion correcta"
			Escribir ""
		FinSi
	FinSi
	
		Segun opc Hacer
			"a":
				Escribir "el vector se lleno"
				
				Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
					
					auxA = Aleatorio(-100,100)
					vectorA(i) = auxA
					suma = suma + auxA
					
					Escribir "el valor del vector numero " i " es igual a " vectorA(i)
					
				Fin Para
				
			"b":
				Escribir "el vector se lleno"
				
				Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
					
					auxB = Aleatorio(-100,100)
					vectorB(i) = auxB
					resta = resta + auxB
					escribir "el valor del vector numero " i " es igual a " vectorB(i)
					
				Fin Para
				
			"c":
				si suma = 0 Y resta = 0
					Escribir "debe ingresar primero a las opciones A y B"
				SiNo
					si suma = 0 Y resta <> 0
						Escribir "debe ingresar primero a la opcion A"
					SiNo
						si	suma <> 0 Y resta = 0
							Escribir "debe ingresar primero a la opcion B"
						SiNo
							Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
								vectorC(i)= vectorA(i) + vectorB(i)
								Escribir "la suma del sub indice A" vectorA(i) " + subindice B " vectorB(i) " es igual al vector C " vectorC(i)
							Fin Para
						FinSi
					FinSi
				FinSi
				
			"d": si suma = 0 Y resta = 0
					Escribir "debe ingresar primero a las opciones A y B"
				SiNo
					si suma = 0 Y resta <> 0
						Escribir "debe ingresar primero a la opcion A"
					SiNo
						si	suma <> 0 Y resta = 0
							Escribir "debe ingresar primero a la opcion B"
						SiNo
							Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
								vectorC(i)= vectorA(i) + vectorB(i)
								Escribir "la resta del sub indice A" vectorA(i) " - subindice B " vectorB(i) " es igual al vector C " vectorC(i)
								c = c + 1
							Fin Para
						FinSi
					FinSi
				FinSi
				
			"e": 
				si suma = 0 Y resta = 0
					Escribir "debe ingresar primero a las opciones A y B"
					SiNo
						si suma = 0 Y resta <> 0
						Escribir "debe ingresar primero a la opcion A"
							SiNo
								si	suma <> 0 Y resta = 0
								Escribir "debe ingresar primero a la opcion B"
									SiNo
										si c = 0
											Escribir "debe ingresar primer a la opcion C"
										SiNo
											Escribir "ingrese que valor quiere conocer de A, B o C"
											leer opc1
											opc1 = Minusculas(opc1)
											si opc1 = "a"
												
												Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
													Escribir "el valor del sub indice " i " del vector A es " vectorA(i)
												Fin Para
											SiNo
												si opc1 = "b"
													Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
														Escribir "el valor del sub indice " i " del vector B es " vectorB(i)
													Fin Para
													
												SiNo
													si opc1 = "c"
														Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
															Escribir "el valor del sub indice " i " del vector C es " vectorC(i)
														Fin Para
													SiNo
														Escribir "opcion ingresada incorrecta"
													FinSi
												FinSi
											FinSi
								
									FinSi
								FinSi
						FinSi
				FinSi
						
									
		Fin Segun
					
	Mientras Que opc <> "f"
	
	Escribir ""
	Escribir "gracias por utilizar el sistema"
	Escribir ""

FinAlgoritmo

SubProceso subVectorA(cantidad, suma Por Referencia)
	Definir i, aux, vector Como Entero
	
	Dimension vector(cantidad)	
	suma=0
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		
		aux = Aleatorio(-100,100)
		vector(i) = aux
		suma = suma + aux
		
		Escribir "el valor del vector numero " i " es igual a " vector(i)
		
	Fin Para
	
	
FinSubProceso

SubProceso subVectorB(cantidad, resta Por Referencia)
	Definir i, aux, vector Como Entero
	
	Dimension vector(cantidad)	
	resta=0
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		
		aux = Aleatorio(-100,100)
		vector(i) = aux
		resta = aux - resta
		
		Escribir "el valor del vector numero " i " es igual a " vector(i)
		
	Fin Para
	
	
FinSubProceso



//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
//que ingrese la opci�n Salir:
//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una
//vez.
//
//"b":
//	secuencia_de_acciones_2
//"c":
//	secuencia_de_acciones_3
//	"d"
//	
//	"e"