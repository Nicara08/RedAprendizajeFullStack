Algoritmo sin_titulo
	definir palabra Como Caracter
	
	Escribir "ingrese una palabra o frase"
	leer palabra
	palabra = concatenar(palabra, ".")
	
	palabra = minusculas(palabra)
	concat(palabra)

	
	
FinAlgoritmo 

SubProceso concat(palabra)
	Definir i Como Entero
	
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		
		si Subcadena(palabra,i,i) = "a"
			
			Escribir Sin Saltar "@"
		SiNo
			si Subcadena(palabra,i,i) = "e"
				Escribir Sin Saltar "#"
				
			SiNo
				si Subcadena(palabra,i,i) = "i"
					escribir Sin Saltar "$"
				SiNo
					si Subcadena(palabra,i,i) = "o"
						Escribir Sin Saltar "%"
					SiNo
						si Subcadena(palabra,i,i) = "u"
							Escribir Sin Saltar "*"
						SiNo
							Escribir Sin Saltar Subcadena(palabra,i,i)
						FinSi
					FinSi
					
				FinSi
			FinSi
			
		FinSi
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