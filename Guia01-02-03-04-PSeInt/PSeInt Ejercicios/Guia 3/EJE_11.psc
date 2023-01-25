SubProceso buscarLetra (letra)
	
	letra = Mayusculas(letra);
	
	Si letra > "M" y letra < "T" Entonces
		Escribir "La letra ", letra, " se encuentra entre la M y la T";
	SiNo
		Escribir "La letra ", letra, " no se encuentra entre la M y la T";
	FinSi
	
FinSubProceso

Algoritmo EJE_11
	
	Definir letra Como Caracter;
	
	Escribir "Ingrese una letra";
	Leer letra;
	
	Mientras Longitud(letra) > 1 Hacer
		Escribir "Debe de ingresar solo una letra";
		Escribir "____________________________";
		Escribir "Ingrese una letra";
		Leer letra;
	Fin Mientras
	
	buscarLetra(letra);
	
FinAlgoritmo
