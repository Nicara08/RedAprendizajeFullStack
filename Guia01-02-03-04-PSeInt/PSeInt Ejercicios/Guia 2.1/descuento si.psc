Algoritmo sin_titulo
	definir mes Como caracter
	definir importe Como Real
	Escribir "ingrese el mes de compra"
	leer mes
	Escribir "ingrese el monto abonado"
	leer importe
	
	si mes = "septiembre"
		Escribir importe * 0.9
	SiNo
		si mes = "octubre"
			Escribir importe * 0.9
		SiNo
			si mes = "noviembre"
				Escribir importe * 0.9
			SiNo
				Escribir importe
			FinSi
		FinSi
		
	FinSi
	
finAlgoritmo