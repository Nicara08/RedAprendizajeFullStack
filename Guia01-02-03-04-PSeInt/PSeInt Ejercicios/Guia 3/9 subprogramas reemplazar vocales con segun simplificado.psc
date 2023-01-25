Algoritmo sin_titulo
	definir palabra como caracter
	
	Escribir "ingrese una palabra o frase"
	leer palabra
	
	palabra = Concatenar(palabra,".")
	comparacion(palabra)
	Escribir ""
FinAlgoritmo

SubProceso comparacion(palabra Por Referencia)
	definir i como entero
	Definir letra, letra2 Como Caracter
	
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		letra = subcadena(palabra,i,i)
		
		Segun letra Hacer
		"a":
			letra2 = Concatenar("","@")
			Escribir Sin Saltar letra2
		"e":
			letra2 = Concatenar("","#")
			Escribir Sin Saltar letra2
		"i":
			letra2 = Concatenar("","$")
			Escribir Sin Saltar letra2
		"o":
			letra2 = Concatenar("","%")
			Escribir Sin Saltar letra2
		"u":
			letra2 = Concatenar("","*")
			Escribir Sin Saltar letra2
		De Otro Modo:
			letra2 = Concatenar("", letra)
			Escribir Sin Saltar letra
	Fin Segun
Fin Para
	
FinSubProceso

//
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el car�cter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificaci�n
//	correspondiente. Utilice la estructura "seg�n" para la transformaci�n.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//		La salida del programa deber�a ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//		NOTA: investigue el uso de la funci�n concatenar de PSeInt para armar la palabra/frase.