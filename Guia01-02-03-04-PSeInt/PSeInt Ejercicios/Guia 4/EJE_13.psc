SubProceso numeroAleatorio (matriz Por Referencia, tamanio)
	
	Definir i, x, a, b Como Entero;
	
	Para i = 0 Hasta tamanio - 1 Con Paso 1 Hacer
		Para x = 0 Hasta tamanio - 1 Con Paso 1 Hacer
			Hacer
				Escribir "Ingrese un numero entre el 1 y el 9 para darle un valor a la casilla";
				Escribir "------ [", i + 1, ",", x + 1, "] ------";
				Leer matriz[i , x];
				Si matriz[i, x] > 9 o matriz[i, x] < 0 Entonces
					Borrar Pantalla;
					Escribir "------------------------------------";
					Escribir "El numero que ingreso no es correcto";
					Escribir "------------------------------------";
				Fin Si
			Mientras Que matriz[i, x] > 9 o matriz[i, x] < 0 
		Fin Para
	Fin Para
	
	Borrar Pantalla;
	Escribir "------------------------------------";
	Escribir "  La matriz quedo de esta forma";
	Escribir "------------------------------------";
	
	Para a = 0 Hasta tamanio - 1 Con Paso 1 Hacer
		Para b = 0 Hasta tamanio - 1 Con Paso 1 Hacer
			Escribir Sin Saltar " [", a + 1, ",", b + 1, "] = ", matriz[a, b];;
		Fin Para
		Escribir "";
	Fin Para
	
FinSubProceso

SubProceso sumarLineas (matriz, tamanio)
	
	Definir contador, aux, vectorFilas, vectorColumnas, diagonal1, diagonal2, vectorTotal, i, x, a, b, c Como Entero;
	
	Dimension vectorColumnas[tamanio];
	Dimension vectorFilas[tamanio];

	diagonal1 = 0;
	diagonal2 = 0;
	contador = 0;
		
	Para i = 0 Hasta tamanio - 1 Con Paso 1 Hacer
		vectorFilas[i] = 0;
		vectorColumnas[i] = 0;
	Fin Para
	
	Para i = 0 Hasta tamanio - 1 Con Paso 1 Hacer
		Para x = 0 Hasta tamanio - 1 Con Paso 1 Hacer
			vectorFilas[i] = vectorFilas[i] + matriz[i , x];
			vectorColumnas[x] = vectorColumnas[x] + matriz[i , x];
			Si i = x Entonces
				diagonal1 = diagonal1 + matriz[i, x];
				diagonal2 = diagonal2 + matriz[i, tamanio - i - 1];
			FinSi
		Fin Para
	Fin Para
	
	Para a = 0 Hasta tamanio - 1 Con Paso 1 Hacer
		Escribir "Suma fila ", a + 1, " = ", vectorFilas[a], " Suma Columnas ", a + 1, " = ", vectorColumnas[a];
	Fin Para
	Escribir "La suma de la diagonal principal es ", diagonal1;
	Escribir "La suma de la diagonal secundaria es " diagonal2;
	
	Para b = 0 Hasta tamanio - 1  Con Paso 1 Hacer
		Si vectorFilas[b] = vectorFilas[0] y vectorFilas[b] = diagonal1 y vectorFilas[b] = diagonal2 Entonces
			contador = contador + 1;
		FinSi
		Para c = 0 Hasta tamanio - 1 Con Paso 1 Hacer
			Si vectorColumnas[c] = vectorColumnas[0] y vectorColumnas[c] = diagonal1 y vectorColumnas[c] = diagonal2 Entonces
				contador = contador + 1;
			FinSi
		Fin Para
	Fin Para
	
	aux = tamanio * tamanio + tamanio;
		
	Si contador = aux Entonces
		Escribir "------------------------------------";
		Escribir "       Es una matriz magica";
		Escribir "------------------------------------";
	SiNo
		Escribir "------------------------------------";
		Escribir "      No es una matriz magica";
		Escribir "------------------------------------";
	FinSi
	
FinSubProceso

Algoritmo EJE_13
	
	Definir matriz, tamanio Como Entero;
	
	Escribir "Ingrese el tamaño de la matriz que deseé (Tiene que ser entre el 1 y 10)";
	Leer tamanio;
	
	Mientras tamanio < 1 o tamanio > 10 Hacer
		Borrar Pantalla;
		Escribir "------------------------------------";
		Escribir "El numero que ingreso no es correcto";
		Escribir "------------------------------------";
		Escribir "Ingrese el tamaño de la matriz que deseé (Tiene que ser entre el 1 y 10)";
		Leer tamanio;
	Fin Mientras
	
	Dimension matriz[tamanio, tamanio];
	
	numeroAleatorio(matriz, tamanio);
	sumarLineas(matriz, tamanio);
	
FinAlgoritmo
