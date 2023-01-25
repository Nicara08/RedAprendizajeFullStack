Algoritmo ejCooperativo_Guia2
	Definir usuario, contra, respuesta2 Como Caracter
	Definir intento, respuesta, i, botellas, peso, gr, s, total, saldot como entero
	definir login Como Logico
	Escribir "Ingrese el usuario"
	leer usuario 
	contra = "caramelos"
	intento = 0
	login = Falso
	peso = 0
	s = 0
	total=0
	saldot=0
	
	
	si usuario = "A" Entonces
		mientras login=Falso y intento<3  hacer
			escribir "Ingrese Contraseña"
			leer contra
			
		 intento = intento +1
		si contra="caramelos" Entonces
			login=Verdadero
		FinSi
	FinMientras
	
		si login = verdadero Entonces
			escribir "Contraseña correcta"
		sino escribir "Agotaste los intentos"
		finsi	
		
		
	FinSi
	
	si login = verdadero entonces 
		Repetir
		Escribir "Ingrese 1 para botella, 2 para saldo y 3 salir"
		leer respuesta
		si respuesta = 1 Entonces
			Escribir "Ingrese cantidad de botellas"
			leer botellas
			Para i<-1 Hasta botellas  Hacer
				gr = Aleatorio(100, 3000)
				peso = gr + peso
				
			Fin Para
			Escribir "Las " botellas " botellas son "  peso " gramos"
			si peso <= 500 Entonces
				escribir "corresponden $50"
				saldot=saldot+50
			sino 
				si peso >500 y peso <= 1500 Entonces
					escribir "corresponden $125"
					saldot=saldot+125
				sino 
					escribir "corresponden $200"
					saldot=saldot+200
				FinSi
				
			FinSi
			Escribir "esta conforme con su saldo"
			Leer respuesta2
			respuesta2=Minusculas(respuesta2)
			si respuesta2="si" Entonces
				escribir"el dinero se acredito a su saldo"
				s=s+saldot
				saldot=0
			SiNo
				escribir "devolviendo material"
				saldot=0
				
			FinSi
		FinSi
		si respuesta = 2 Entonces
			Escribir "su saldo es: ",s
			
		FinSi
		
	
		Mientras Que respuesta <>3
	finsi
	escribir "Gracias"
	
FinAlgoritmo
