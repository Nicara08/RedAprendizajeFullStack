//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
//	Nota: recordar el uso de las variables de tipo lógico.


Algoritmo Eje7Guia4
	Definir n,i como entero	
	i=0
	Definir bandera Como Logico
	bandera=Falso
	Escribir "Ingrese el tamaño de los vectores"
	Leer n
	vectorA(n,i)
	
FinAlgoritmo

SubProceso vectorA (n,i)
	
	Definir vecA,vecB Como Entero
	Dimension vecA(n), vecB(n)
	
	Para i=0 Hasta n-1 Hacer
		vecA(i)=aleatorio(0,30)
		vecB(i)=Aleatorio(0,30)
	FinPara
	Escribir comparacion(vecA,vecB,n,i)
	
FinSubProceso

Funcion resultado<-comparacion (vecA,vecB, n,i)
	Definir resultado Como Entero
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar "a",vecA(i)
	FinPara
	FinFuncion






	