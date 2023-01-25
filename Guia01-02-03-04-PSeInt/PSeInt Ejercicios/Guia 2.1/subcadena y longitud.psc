Algoritmo sin_titulo
	Definir palabra Como caracter
	Definir x Como Entero
	Escribir "ingrese una palabra"
	leer palabra
	x = longitud (palabra)
	si Subcadena(palabra, 0, 0) = Subcadena(palabra,x-1,x)
		Escribir "correcto"
	SiNo
		Escribir "incorrecto"
		
	FinSi
	
FinAlgoritmo