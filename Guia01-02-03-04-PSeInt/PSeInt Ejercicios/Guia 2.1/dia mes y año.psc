Algoritmo sin_titulo
	definir dia, ano Como Entero
	Definir mes Como Caracter
	Escribir Sin Saltar "ingresar dia"
	leer dia
	Escribir Sin Saltar "ingrese numero de mes"
	leer mes
	Escribir Sin Saltar "ingrese el a�o"
	leer ano
	
	si dia <= 31 y dia >= 1 entonces
		si ano <= 2022 y ano >= 1920 entonces
			segun mes Hacer
			"1": 
				Escribir dia, " de enero de ", ano
			"2": 
				Escribir dia, " de febrero de ", ano
			"3": 
				Escribir dia, " de marzo de ", ano
			"4": 
				escribir dia, " de abril de ", ano
			"5": 
				Escribir dia, " de mayo de ", ano
			"6": 
				Escribir dia, " de junio de ", ano
			"7": 
				Escribir dia, " de julio de ", ano
			"8": 
				Escribir dia, " de agosto de ", ano
			"9": 
				Escribir dia, " de septiembre de ", ano
			"10": 
				Escribir dia, " de octubre de ", ano
			"11": 
				Escribir dia, " de noviembre de ", ano
			"12": 
				Escribir dia, " de diciembre de ", ano
		De Otro Modo:
			Escribir "mes ingresado incorrecto"
	FinSegun
		SiNo
			Escribir "a�o ingresado incorrecto"
		FinSi
	SiNo
		Escribir "dia ingresado incorrecto"
FinSi

	

FinAlgoritmo
// Leer tres n�meros que denoten una fecha (d�a, mes, a�o) y comprobar que sea una fecha
// v�lida. Si la fecha no es v�lida escribir un mensaje de error por pantalla. Si la fecha es
// v�lida se debe imprimir la fecha cambiando el n�mero que representa el mes por su
// nombre. Por ejemplo: si se introduce 1 2 2006, se deber� imprimir "1 de febrero de 2006".