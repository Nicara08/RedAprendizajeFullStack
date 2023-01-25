Algoritmo sin_titulo
	Definir usuario, pass, resp Como Caracter
	Definir contador1, contador2, option, i, bot, suma, peso, sumatemp, saldo Como Entero
	definir login Como Logico
	
	contador1 = 0
	contador2 = 0
	i = 0
	suma = 0
	sumatemp = 0
	saldo = 0
	
	Escribir "ingrese el nombre de usuario"
	leer usuario
	si usuario = "albus"
	SiNo
		Repetir
			contador1 = contador1 + 1
			Escribir "ingrese nuevamente el usuario"
			leer usuario
		Mientras Que contador1 < 2 Y usuario <> "albus"
	FinSi
	
	Escribir "ingrese la contraseña"
	leer pass
	si pass = "caramelo"
		login = Verdadero
		Escribir ""
		Escribir "bienvenido al sistema"
		Escribir ""
	SiNo
		si	pass <> "caramelo"
			Mientras pass <> "caramelo" Y contador2 < 2 hacer
				contador2 = contador2 + 1
				Escribir "ingrese la contraseña nuevamente"
				leer pass
			FinMientras
			si pass <> "caramelo" Y contador2 < 2
				Escribir "sistema bloqueado, ingreso 3 contraseñas incorrectas"
				
			SiNo
				Escribir ""
				Escribir "bienvenido al sistema"
				Escribir ""
				login = Verdadero
			FinSi
		FinSi
		
	FinSi
	
	si login = Verdadero
		Repetir
			Escribir "ingrese 1 para ingresar botellas, 2 para consultar saldo o 3 para salir"
			leer option
			si option = 1
				Escribir "ingrese la cantidad de botellas"
				leer bot
				Para i<-1 Hasta bot Con Paso 1 Hacer
					peso = aleatorio(100,3000)
					suma = suma + peso
				FinPara
				
				si suma < 500
					Escribir "le corresponde $50"
					sumatemp = 0
					sumatemp = sumatemp + 50
				SiNo
					si suma > 500 Y suma < 1500
						Escribir "le corresponde $125"
						sumatemp = 0
						sumatemp = sumatemp + 125
					SiNo
						Escribir "le corresponde $200"
						sumatemp = 0
						sumatemp = sumatemp + 200
					FinSi
					Repetir
						Escribir "esta de acuerdo con el monto ofrecido? indique S / N"
						leer resp
						resp = minusculas(resp)
						Escribir resp
					Mientras Que resp <> "s" y resp <> "n"
					si resp = "s"
						saldo = saldo + sumatemp
					SiNo
						Escribir ""
						Escribir "devolviendo material"
						Escribir ""
					FinSi
				FinSi
				
				
				SiNo
					si option = 2
						Escribir "su saldo actual es de $" saldo
						
					
				SiNo
					Escribir ""
					escribir "numero ingresado incorrecto"
					Escribir ""
					
				FinSi
						
				
	FinSi
		Mientras Que option <> 3
		si option = 3
			Escribir "gracias por utilizar el sistema"
		
		FinSi
	FinSi
	

	

FinAlgoritmo



//	 Ejercicio .
//	Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//	máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar nuestro
//	usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
//	- Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//	verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es correcta
//	haremos que una variable llamada Login sea verdadera.
//	- Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un bucle
//	Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
//	- Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al menú de
//	opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
//	- Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema. Una vez
//	que tenemos el número vamos a usar un bucle para, a fin de ir ingresando cada botella. En
//	cada ciclo del bucle se debe generar un número aleatorio entre 100 y 3000 gr, que va a ser el
//	peso de las botellas a reciclar (simulando que el usuario está ingresando botellas en la
//	máquina). Una vez generado, según el peso del material, usaremos un condicional múltiple
//	para asignarle un valor monetario:
//	- Si es menos de 500 gr, corresponden $50
//	- Si es entre 501 gr y 1500 gr, corresponden $125
//	- Si es más de 1501 gr, corresponden $200
//	- Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
//	usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (sólo mostrar en
//	pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
//	- Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
//	- Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.