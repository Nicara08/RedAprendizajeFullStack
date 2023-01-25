Algoritmo cocinarUnHuevo
	definir variable, variable2, variable3 Como caracter
	Escribir "usted va a comenzar la coccion del huevo"
	Escribir "el huevo lo va a freir? indique S o N"
	leer variable
	si variable = "s"
		Escribir "coloque aceite en la sarten hasta que este caliente para gregar el huevo"
		Escribir "una vez el huevo en la sarte, usted le agregara sal? indicar S o N"
		leer variable2
		si variable2 = "s"
			Escribir "coloque sal a gusto"
			Escribir "por ultimo coloque el huevo en el plato!"
		SiNo
			Escribir "coloque el huevo sin salar en el plato y disfrute"
		FinSi
	SiNo
		Escribir "coloque un jarrito con agua fria y el huevo para comenzar a hervirlo"
		Escribir "pasado los 10 minutos de hervor, lo retira del agua. Le agregara sal? indique S o N"
		leer variable3
		si variable3 = "s"
			Escribir "parta el huevo y sale a gusto"
			Escribir "coloque en el plato y disfrute"
		sino 
			Escribir "coloqun en el plato y disfrute"
			
		FinSi
	FinSi
	
FinAlgoritmo
