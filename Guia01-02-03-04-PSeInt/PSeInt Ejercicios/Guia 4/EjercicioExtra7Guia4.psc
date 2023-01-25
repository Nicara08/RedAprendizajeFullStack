///Programe una función recursiva que calcule la suma de un arreglo de números
Algoritmo EjercicioExtra7Guia4
	Definir vector, i, n, suma Como Entero
	Dimension vector(5)
	
	Para i<-0 Hasta 4 Hacer
		vector(i)=Aleatorio(1,10)
	FinPara
	n=5
	suma=sumatoria(vector,n)
	Escribir "La suma de los elementos es: ", sumatoria(vector,n)
	para i<-0 Hasta 4 Hacer
		Escribir vector(i)
	FinPara
FinAlgoritmo
SubProceso suma<-sumatoria(vector,n)
	Definir suma Como Entero
	n=n-1
	si n=0 entonces
		suma= vector(n)
	sino
		suma = vector(n) + sumatoria(vector,n)
	FinSi
	FinSubProceso