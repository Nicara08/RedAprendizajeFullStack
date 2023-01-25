//Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//máquina nos pagará dinero por la cantidad de plástico reciclado. 

Algoritmo Guia2_2_Ejercicio_Colaborativo
	
	// DECLARACIÓN DE VARIABLES
	
	Definir usuario, contrasena, operacion, menu Como Caracter
	Definir i, w, cant_botellas, gramos, saldo Como Entero
	Definir login Como Logico
	
	i = 0
	w = 0
	usuario = z
	login = 4 > 5
	menu = z
	cant_botellas = 0
	gramos = 0
	saldo = 0
	
	// LOGIN
	
	//Tenemos que ingresar nuestro
	//usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
	//? Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
	//verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es correcta
	//haremos que una variable llamada Login sea verdadera.
	
	Mientras  i <> 3 y w <> 3 y contrasena <> "caramelosDeLimon" Hacer
		
		Si usuario <> "Albus_D" Entonces
			escribir "ingrese la usuario: "
			leer usuario
			i = i + 1
		FinSi
		
		Si usuario = "Albus_D" y contrasena <> "caramelosDeLimon" Entonces
			escribir "ingrese la contraseña: "
			leer contrasena			
			w = w + 1
		FinSi		
		
	FinMientras
	
	Si contrasena = "caramelosDeLimon" Entonces
		login = 4 < 5
	FinSi
	
	
	Si login = VERDADERO Entonces
		
	// MENU DE OPCIONES:
	
		Repetir
		
		//? Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al menú de
		//opciones: "Ingresar botellas", "Consultar saldo" y "Salir"
		
			Escribir "MENU:"
			Escribir "1-Ingresar cantidad de botellas"
			Escribir "2-Consultar saldo"
			Escribir "3-Salir"
			leer menu
		
		//? Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema. Una vez
		//que tenemos el número vamos a usar un bucle para, a fin de ir ingresando cada botella. En
		//cada ciclo del bucle se debe generar un número aleatorio entre 100 y 3000 gr, que va a ser el
		//peso de las botellas a reciclar (simulando que el usuario está ingresando botellas en la
		//máquina). Una vez generado, según el peso del material, usaremos un condicional múltiple
		//para asignarle un valor monetario:
		//? Si es menos de 500 gr, corresponden $50
		//? Si es entre 501 gr y 1500 gr, corresponden $125
		//? Si es más de 1501 gr, corresponden $200
		
			Segun menu Hacer
				"1":
					Escribir "Indique cantidad de botellas: "
					leer cant_botellas
				
					Para i <- 1 Hasta cant_botellas Con Paso 1 Hacer
						gramos = gramos + aleatorio(100,3000)
					Fin Para
				
					Si gramos < 500 Entonces
						saldo = 50
					FinSi
					Si gramos > 500 y gramos < 1501 Entonces
						saldo = 125					
					FinSi
					Si gramos > 1501 Entonces
						saldo = 200
					FinSi
				
				//? Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
				//usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (sólo mostrar en
				//pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
				
					Escribir "El precio por la cantidad de botellas que se ingreso es: " gramos "$"
					Escribir "Seleccione una opciòn: "
					Escribir "ACEPTAR                                          RECHAZAR"
					leer menu
				
					Si menu = RECHAZAR Entonces
						Escribir "Devolviendo Material"
						saldo = 0
					FinSi
				
				//? Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
				//? Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.
				"2":
					Escribir " El saldo en su cuenta es: " saldo "$"
				"3":
					menu = salir
				De Otro Modo:
					Escribir "No ha ingresado una opciòn correcta."
			Fin Segun
		
		Hasta Que menu = salir
	
	FinSi
	
FinAlgoritmo
