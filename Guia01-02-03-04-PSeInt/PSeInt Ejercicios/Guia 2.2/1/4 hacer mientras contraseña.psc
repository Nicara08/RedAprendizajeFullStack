Algoritmo sin_titulo
	Definir password Como Caracter
	Definir contador Como Entero
	
	contador = 0
	
	
	Repetir
		contador = contador + 1
		
		Escribir "ingrese la contrase�a"
		leer password
		
	Mientras Que password <> "eureka" Y contador < 3
	
	si password <> "eureka" Y contador = 3
		Escribir "sistema bloqueda! 3 ingresos incorrectos"
	SiNo		
		Escribir "bienvenido al sistema"
	FinSi
	
FinAlgoritmo


//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
//mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.