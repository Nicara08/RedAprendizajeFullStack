Funcion retorno <- factorial (numM)
	
	Definir retorno, x Como Real;
	
	retorno = 1;
	
	Para x = 1 Hasta numM Con Paso 1 Hacer
		retorno = retorno * x;
	Fin Para
	
Fin Funcion

Algoritmo EJE_9
	
	Definir numM, numM2, numN, guardar, X, I Como Real;
	
	Escribir "Ingrese el primer numero mayor a 1";
	Leer numM;
	
	Mientras numM < 1  Hacer
		Escribir "El numero que ingreso es menor a 1";
		Escribir "----------------------------------";
		Escribir "Ingrese el primer numero mayor a 1";
		Leer numM;
	Fin Mientras
	
	Escribir "Ingrese un numero que sea mayor a 0 y sea menor a el primer numero";
	Leer numN;
	
	Mientras numN <= 0 o numM <= numN Hacer
		Escribir "El numero que ingreso es menor a (0) o es mayor al primer numero ingresado";
		Escribir "----------------------------------";
		Escribir "Ingrese un numero que sea mayor a 0 y sea menor a el primer numero";
		Leer numN;
	Fin Mientras
	
	Escribir "Combinacion (", numM, "/", numN, ") = ", numM, "! / ", numN, "! x (", numM, " - ", numN, ")!";	
	Escribir "Combinacion (", numM, "/", numN, ") = ", numM, "! / ", numN, "! x ", numM - numN, "!";
	
	Si numN < (numM - numN) Entonces
		guardar = numN;
	SiNo
		guardar = (numM - numN);
	FinSi
	
	Escribir Sin Saltar "Combinacion (", numM, "/", numN,") = ";
	
	numM2 = numM;
	
	Para X = guardar Hasta 1 Con Paso -1 Hacer
		Si X <> 1 Entonces
			Escribir Sin Saltar numM2, " X ";
		SiNo
			Escribir Sin Saltar numM2, " / ";
		Fin Si
		numM2 = numM2 - 1;
	Fin Para
	
	Para I = guardar Hasta 1 Con Paso -1 Hacer
		Si I <> 1 Entonces
			Escribir Sin Saltar I, " X " ;
		SiNo
			Escribir Sin Saltar I, " = ";
		FinSi
	Fin Para
	
	Escribir factorial(numM) / (factorial(numN) * factorial(numM - numN)) " Resultado";
	
FinAlgoritmo
