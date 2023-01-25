Algoritmo EJE_15
	
	Definir factorial, x, i  Como Entero;
	
	factorial = 1;
	
	Escribir "!", 1, " = " 1;
	
	Para x = 1 Hasta 5 Con Paso 1 Hacer
		factorial = factorial * x;
		Si x > 1 Entonces
			Escribir Sin Saltar "!", x, " = ";
			Para i = 1 Hasta x Con Paso 1 Hacer
				Si x <> i Entonces
					Escribir Sin Saltar i, " x ";
				SiNo
					Escribir Sin Saltar i, " = ", factorial;
				FinSi
			Fin Para
			Escribir "";
		FinSi
	Fin Para
	
FinAlgoritmo
