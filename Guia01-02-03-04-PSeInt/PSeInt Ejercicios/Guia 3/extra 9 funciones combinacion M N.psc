Funcion retorno <- comb ( m )
	Definir ant, f, retorno Como Entero
	
	si m = 1 o m = 0
		retorno = 1
	SiNo
		ant = comb(m-1)
		
		retorno = m * ant
			
	FinSi
	
	
Fin Funcion


Algoritmo sin_titulo
	Definir m, n, aux como entero
	Definir combinacion como real
		
	Escribir "ingrese un numero M"
	leer m
	
	Repetir
		Escribir "ingrese un numero N, mayor a cero y menor que M"
		leer n
	Mientras Que n < 1 o n >= m
	
	aux = m - n
		
	Escribir "el numero de combinaciones de m elementos tomados de n es: " comb(m) / (comb(n) * comb(aux))
	
//	/ (comb(n) * comb(aux))
	
FinAlgoritmo


//El número de combinaciones de m elementos tomados de n es:
//	  m          m!
//	(--) = (-----------)
//	 n       n! (m-n)!
//	Diseñar una función que permita calcular el número combinatorio de (
//	?
//	?)
//Nota: n debe ser mayor a 0 y menor que m.