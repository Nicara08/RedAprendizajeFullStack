Algoritmo sin_titulo
	Definir palabra Como Caracter
	
	Escribir "ingrese una frase"
	leer palabra
	
	vocal(palabra)
	
FinAlgoritmo

SubProceso vocal(palabra)
	Definir letra Como Caracter
	Definir i, contadorA, contadorE, contadorI, contadorO, contadorU Como Entero
	
	contadorA=0
	contadorE=0
	contadorI=0
	contadorO=0
	contadorU=0
	
	
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		letra = Minusculas(palabra)
		letra = subcadena(palabra,i,i)
		
		Segun letra Hacer
			"a":
				si contadorA = 0
					contadorA = contadorA + 1
					Escribir Sin Saltar letra
				SiNo
					escribir Sin Saltar " "
				FinSi
			"e":
				si contadorE = 0
					contadorE = contadorE + 1
					Escribir Sin Saltar letra
				SiNo
					escribir Sin Saltar " "
				FinSi
			"i":
				si contadorI = 0
					contadorI = contadorI + 1
					Escribir Sin Saltar letra
				SiNo
					escribir Sin Saltar " "
				FinSi
			"o":
				si contadorO = 0
					contadorO = contadorO + 1
					Escribir Sin Saltar letra
				SiNo
					escribir Sin Saltar " "
				FinSi
			"u":
				si contadorU = 0
					contadorU = contadorU + 1
					Escribir Sin Saltar letra
				SiNo
					escribir Sin Saltar " "
				FinSi
				
			De Otro Modo:
				Escribir Sin Saltar letra
		Fin Segun
	Fin Para
FinSubProceso


//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
//repetidas. Al final el procedimiento mostrará la frase final.