Algoritmo sin_titulo
	definir vector, frase, letra Como Caracter
	Definir posicion, Long, i, aux, aux1, longEsp, min, min1, max, max1 Como Entero
	
	Dimension vector(20)
	
	Escribir "ingrese una palara u oracion de 20 caracteres como maximo"
	leer frase
	
	long = Longitud(frase)
	
	si long <= 20 Entonces
		Escribir "usted ingreso una oracion que esta por debajo de los 20 caracteres, se imprimiran espacios hasta 20"
		longEsp = 20 - long
		aux=1
	SiNo
		Escribir "usted ingreso una oracion que supera los 20 caracteres, se imprimira hasta 20"
		longEsp = long - 20
		aux=2
	FinSi
	
	Escribir "ingrese un caracter que quiera sumar a la oracion"
	leer letra
	
	Repetir
		Escribir "indique en que subindice quiere reemplazar el caracter, de 0 a 19"
		leer posicion
	Mientras Que posicion > 19
	
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		si aux = 1
			si long >= i + 1
				vector(i) = Subcadena(frase, i, i)
			SiNo
				vector(i) = " "
			FinSi
		SiNo
			vector(i) = Subcadena(frase, i, i)
		FinSi
		
	Fin Para
	
	min=0
	min1=0
	max=0
	max1=0
	
	si vector(posicion) = " "
		vector(posicion) = letra
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			Escribir Sin Saltar vector(i) 
		Fin Para
	SiNo
		vectorIzq(vector, frase, posicion, i, min, max)
		vectorDer(vector, frase, posicion, i, min, max)
		
	FinSi
	
	min1 = posicion - min
	max1 = max - posicion
	
	si min1 < max1
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			si i = posicion
				Escribir Sin Saltar letra
				Escribir Sin Saltar vector(i)
			SiNo
				si i < min
					Escribir Sin Saltar vector(i+1)
				SiNo
					Escribir Sin Saltar vector(i)
				FinSi
				
			FinSi
		Fin Para
	SiNo
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			si i = posicion
				Escribir Sin Saltar letra
				Escribir sin saltar vector(i)
			SiNo
				si i < posicion o i > posicion
					Escribir Sin Saltar vector(i)
				FinSi
				
			FinSi
		Fin Para
		
	FinSi
	
	
	
FinAlgoritmo

SubProceso vectorIzq(vector, frase, posicion, i, min Por Referencia, max)
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		si vector(i) = " " Y i < posicion
			min = i
		FinSi
	Fin Para
	
FinSubProceso

SubProceso vectorDer(vector, frase, posicion, i, min, max Por Referencia)
	Para i<-19 Hasta 0 Con Paso -1 Hacer
		si vector(i) = " " Y i > posicion
			max = i
		FinSi
	Fin Para
	
FinSubProceso 

////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////	más cercano.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
////	H o l a m u n d o c r u e l !
////	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con
////	desplazamiento sería:
////		h o l a m u n % d o c r u e l !
////		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10
////	estaba más cerca de la posición 8 que el espacio de la posición 4. Nota: En caso del que
////		desplazamiento requiera que se remueva una letra, se realizara, por ejemplo, para poner un
////			"%" en la posición 6, haríamos el desplazamiento a la izquierda y borraríamos la letra h.