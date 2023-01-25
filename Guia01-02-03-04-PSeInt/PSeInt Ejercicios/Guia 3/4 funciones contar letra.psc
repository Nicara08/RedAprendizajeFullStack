Funcion contador <- res(palabra, letra)
	Definir contador, i como entero
	
	contador = 0
	
	Para i<-0 Hasta Longitud(palabra) Con Paso 1 Hacer
		si Subcadena(palabra,i,i) = letra
			contador = contador + 1
		FinSi
		
	Fin Para
	
	
	
Fin Funcion

Algoritmo sin_titulo
	Definir palabra, letra Como Caracter
	
	Escribir "ingrese una palabra"
	leer palabra
	Escribir "ingrese una letra"
	leer letra
	
	palabra = Minusculas(palabra)
	letra = Minusculas(letra)
	

	
	Escribir "la letra " letra " se repite " res(palabra, letra)
FinAlgoritmo



//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//función Subcadena().