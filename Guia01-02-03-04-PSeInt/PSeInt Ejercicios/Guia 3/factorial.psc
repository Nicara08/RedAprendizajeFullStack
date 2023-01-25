
Algoritmo sin_titulo
	Definir num, res Como entero
	
	Escribir "ingrese un numero para calcular su factorial"
	leer num
	
	res = factorial(num)
	
	Escribir "finalmente, el factorial del numero ", num, " es ", res
	
FinAlgoritmo

Funcion retorno <- factorial(num)
	Definir f, ant Como Entero
	
	Escribir "- inicia ejecucion del calculo de ", num, "!"
	
	si num = 0 o num = 1
		f = 1
		Escribir " condicion de base ", num, "! = 1"
	SiNo
		Escribir " Para conocer el ", num, "! debo calcular el ", (num-1), "!"
		ant = factorial(num-1)
		f = num * ant
		Escribir " ahora si! el ", num, "! = ", num, " * ", (num-1), "! = " num, " * ", ant, " = ", f
	FinSi
	Escribir " - finaliza ejecucion del calculo de ", num, "!"
	
Fin Funcion


	