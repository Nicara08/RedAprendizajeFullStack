Funcion retorno <- capicua(num)
	Definir i, contador, contador1, contador2 Como Entero
	Definir aux, aux2, aux3, aux4, num1, num2 como real
	Definir retorno Como Logico

	contador = 0
	contador1 = 2
	contador2 = 0
	aux2 = 1
	num1 = num
	num2 = num
	
	Repetir
		contador = contador + 1
		aux = num1 / 10
		aux = trunc(aux)
		num1 = aux
		
	Mientras Que aux > 0
	
	
	
	Repetir
		contador1 = contador1 + 1
		aux2 = aux2 * 10
		
	Mientras Que contador >= contador1
	
	contador = trunc(contador / 2)
	
	Repetir
		contador2 = contador2 + 1
		aux3 = trunc(num2/aux2) 
		
		si num2 <> 0
			aux4 = num2 mod 10
		FinSi
		
		si num2 <> 0
			num2 = num2 mod aux2
		FinSi
		
		aux2 = aux2 / 100
		num2 = trunc(num2/10)
	Mientras Que aux3 = aux4 
	
	si (contador2 - 1) = contador
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
Fin Funcion



Algoritmo sin_titulo
	Definir num Como Entero
	
	
	Escribir "ingrese un numero para evaluar si es capicua"
	leer num
	
	Escribir "el numero ingresado es capicua? " capicua(num)
	
FinAlgoritmo


//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.