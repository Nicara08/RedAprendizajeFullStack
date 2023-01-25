Algoritmo sin_titulo
	Definir palabra Como Caracter
	Definir cant, j, cont Como Entero
	
	Escribir "ingrese una palabra y el sistema lo devolvera al reves"
	leer palabra
	
	cant = Longitud(palabra)
	cont = 0
	Para j<-0 Hasta cant Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(palabra,cant - j,cant - j)
		escribir Sin Saltar " " 
		
	Fin Para
	
FinAlgoritmo


///Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
///pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
///	deberemos mostrar a l o H.