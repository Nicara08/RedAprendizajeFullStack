Algoritmo sin_titulo
	Definir torDef, tor Como Entero
	Escribir Sin Saltar "indique cantidad de tornillos defuctuosos en un dia (menos 200)"
	leer torDef
	Escribir Sin Saltar "indique cantidad de tornillos sin defectos en un dia (mas 10000)"
	Leer tor
	
	si torDef <= 200 y tor > 10000
		Escribir "su grado de trabajo es 8"
	FinSi			
	
	si torDef > 200 y tor > 10000
		Escribir "su grado de trabajo es 7"
	FinSi
	
	si 	torDef <= 200 y tor < 10000
		Escribir "su grado de trabajo es 6"
	FinSi
			
	si torDef > 200 y tor < 10000
		Escribir "su grado de trabajo es 5"
	FinSi		
			
FinAlgoritmo
