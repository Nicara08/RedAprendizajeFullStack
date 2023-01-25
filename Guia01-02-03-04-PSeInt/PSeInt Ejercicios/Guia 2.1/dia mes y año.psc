Algoritmo sin_titulo
	definir dia, ano Como Entero
	Definir mes Como Caracter
	Escribir Sin Saltar "ingresar dia"
	leer dia
	Escribir Sin Saltar "ingrese numero de mes"
	leer mes
	Escribir Sin Saltar "ingrese el año"
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
			Escribir "año ingresado incorrecto"
		FinSi
	SiNo
		Escribir "dia ingresado incorrecto"
FinSi

	

FinAlgoritmo
// Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
// válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
// válida se debe imprimir la fecha cambiando el número que representa el mes por su
// nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".