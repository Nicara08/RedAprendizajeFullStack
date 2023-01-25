//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//(incluyendo a las vocales acentuadas) se mantienen sin cambios.
///Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
///Utilice la estructura "según" para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
///NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
Algoritmo Ejerc9
	Definir palabra Como Cadena
	Escribir "Ingrese su usuario:"
	Leer palabra
	Limpiar Pantalla
	Escribir lala(palabra)
FinAlgoritmo
SubProceso caract<-lala(palabra)
	Definir caract, letra, palabra2 como cadena
	Definir i, aux, cont Como Entero
	i = 0 
	aux=0
	cont = Longitud(palabra) 
	Repetir
		Escribir ""; escribir "Ingrese una palabra:"
		Leer palabra
	Para i <- 0 Hasta cont Hacer 		
		letra = SubCadena(palabra,i,i)
		aux=aux+1 
		Segun letra Hacer
			"a": 
				palabra2<-Concatenar("","@")
				Escribir Sin Saltar palabra2
			"e":
				palabra2<-Concatenar("","#")
				Escribir Sin Saltar palabra2
			"i":
				palabra2<-Concatenar("","$")
				Escribir Sin Saltar palabra2
			"o":
				palabra2<-Concatenar("","%")
				Escribir Sin Saltar palabra2
			"u":
				palabra2<-Concatenar("","*")
				Escribir Sin Saltar palabra2
			"b":
				palabra2<-Concatenar("","b")
				Escribir Sin Saltar palabra2
			"c":
				palabra2<-Concatenar("","c")
				Escribir Sin Saltar palabra2
			"d":
				palabra2<-Concatenar("","d")
				Escribir Sin Saltar palabra2
			"f":
				palabra2<-Concatenar("","f")
				Escribir Sin Saltar palabra2
			"g":
				palabra2<-Concatenar("","g")
				Escribir Sin Saltar palabra2
			"h":
				palabra2<-Concatenar("","h")
				Escribir Sin Saltar palabra2
			"j":
				palabra2<-Concatenar("","j")
				Escribir Sin Saltar palabra2
			"k":
				palabra2<-Concatenar("","k")
				Escribir Sin Saltar palabra2
			"l":
				palabra2<-Concatenar("","l")
				Escribir Sin Saltar palabra2
			"m":
				palabra2<-Concatenar("","m")
				Escribir sinsaltar palabra2
			"n":
				palabra2<-Concatenar("","n")
				Escribir Sin Saltar palabra2
			"ñ":
				palabra2<-Concatenar("","ñ")
				Escribir Sin Saltar palabra2
			"p":
				palabra2<-Concatenar("","p")
				Escribir Sin Saltar palabra2
			"q":
				palabra2<-Concatenar("","q")
				Escribir Sin Saltar palabra2
			"r":
				palabra2<-Concatenar("","r")
				Escribir Sin Saltar palabra2
			"s":
				palabra2<-Concatenar("","s")
				Escribir sinsaltar palabra2
			"v":
				palabra2<-Concatenar("","v")
				Escribir Sin Saltar palabra2
			"w":
				palabra2<-Concatenar("","w")
				Escribir Sin Saltar palabra2
			"x":
				palabra2<-Concatenar("","x")
				Escribir Sin Saltar palabra2
			"y":
				palabra2<-Concatenar("","y")
				Escribir Sin Saltar palabra2
			"z":
				palabra2<-Concatenar("","z")
				Escribir Sin Saltar palabra2
		FinSegun
	Fin Para 
Hasta Que letra = "." y palabra = "."
FinSubProceso
