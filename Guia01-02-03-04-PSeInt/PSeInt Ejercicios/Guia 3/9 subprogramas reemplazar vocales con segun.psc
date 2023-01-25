Algoritmo sin_titulo
	definir palabra Como Caracter
	
	Escribir "ingrese una palabra o frase"
	leer palabra
	palabra = concatenar(palabra, ".")
	
	palabra = minusculas(palabra)
	concat(palabra)
	
	
FinAlgoritmo 

SubProceso concat(palabra)
	Definir i, aux2 Como Entero
	Definir letra, palabra2 Como Caracter
	
	
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		letra = Subcadena(palabra,i,i)
				
		aux2 = Longitud(palabra)
		Segun letra Hacer
			"a":
				palabra2 = Concatenar("","@")
				Escribir Sin Saltar palabra2
			"b":palabra2 = concatenar("","b")
				Escribir Sin Saltar palabra2
			"c":
				palabra2 = concatenar("","c")
				Escribir Sin Saltar palabra2
			"d":
				palabra2 = concatenar("","d")
				Escribir Sin Saltar palabra2
			"e":
				palabra2 = concatenar("","#")
				Escribir Sin Saltar palabra2
			"f":
				palabra2 = concatenar("","f")
				Escribir Sin Saltar palabra2
			"g":
				palabra2 = concatenar("","g")
				Escribir Sin Saltar palabra2
			"h":
				palabra2 = concatenar("","h")
				Escribir Sin Saltar palabra2
			"i":
				palabra2 = concatenar("","$")
				Escribir Sin Saltar palabra2
			"j":
				palabra2 = concatenar("","j")
				Escribir Sin Saltar palabra2
			"k":
				palabra2 = concatenar("","k")
				Escribir Sin Saltar palabra2
			"l":
				palabra2 = concatenar("","l")
				Escribir Sin Saltar palabra2
			"m":
				palabra2 = concatenar("","m")
				Escribir Sin Saltar palabra2
			"n":
				palabra2 = concatenar("","n")
				Escribir Sin Saltar palabra2
			"o":
				palabra2 = concatenar("","%")
				Escribir Sin Saltar palabra2
			"p":
				palabra2 = concatenar("","p")
				Escribir Sin Saltar palabra2
			"q":
				palabra2 = concatenar("","q")
				Escribir Sin Saltar palabra2
			"r":
				palabra2 = concatenar("","r")
				Escribir Sin Saltar palabra2
			"s":
				palabra2 = concatenar("","s")
				Escribir Sin Saltar palabra2
			"t":
				palabra2 = concatenar("","t")
				Escribir Sin Saltar palabra2
			"u":
				palabra2 = concatenar("","*")
				Escribir Sin Saltar palabra2
			"v":
				palabra2 = concatenar("","v")
				Escribir Sin Saltar palabra2
			"w":
				palabra2 = concatenar("","w")
				Escribir Sin Saltar palabra2
			"x":
				palabra2 = concatenar("","x")
				Escribir Sin Saltar palabra2
			"y":
				palabra2 = concatenar("","y")
				Escribir Sin Saltar palabra2
			"z":
				palabra2 = concatenar("","z")
				Escribir Sin Saltar palabra2
			De Otro Modo:
				Escribir Sin Saltar " "
				
		Fin Segun
		Escribir Sin Saltar ""
	FinPara

FinSubProceso

//. Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//		La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//		NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.