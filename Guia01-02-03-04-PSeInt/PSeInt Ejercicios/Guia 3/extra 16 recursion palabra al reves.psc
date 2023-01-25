Funcion  retorno = pal (palabra)
	Definir retorno, letra, f Como Caracter
	Definir cantidad, contador Como Entero
	
	
	
	cantidad = Longitud(palabra)
	si cantidad >= 1
		letra = Subcadena(palabra,cantidad-1,cantidad-1)
		
		Escribir Sin Saltar letra
		
		palabra = Subcadena(palabra,0, cantidad-2)
		f = pal(palabra)
	SiNo
	FinSi

	
FinFuncion



Algoritmo sin_titulo
	Definir palabra Como Caracter
	Definir aux Como Entero
	
	Escribir "ingrese una palabra"
	leer palabra
	
	aux = Longitud(palabra)
	
	Escribir "la palabra al reves es " pal(palabra)
FinAlgoritmo


//Implemente de forma recursiva una función que le dé la vuelta a una cadena de caracteres.
//NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán. 