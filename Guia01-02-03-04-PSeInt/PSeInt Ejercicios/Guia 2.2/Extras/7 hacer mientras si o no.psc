Algoritmo ejerhacermientras
	Definir num1, num2, num3, aux Como entero
	definir i como caracter
	
	aux = 0
	
	Repetir
		Escribir "ingrese un numero entero positivo"
		leer num1
		Escribir "deseea ingresar un nuevo numero? SI o NO?"
		leer i
		
		i = Mayusculas(i)
		si i = "SI"
			aux = aux + num1
		sino
			si i = "NO"
				aux = aux + num1
				num1 = 0
			FinSi
		FinSi
	Mientras Que num1 >= 1
	Escribir "la suma de los numeros ingresados es " aux
FinAlgoritmo


///Se debe realizar un programa que:
///1�) Pida por teclado un n�mero (entero positivo).
///2�) Pregunte al usuario si desea introducir o no otro n�mero.
///3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
///4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario.