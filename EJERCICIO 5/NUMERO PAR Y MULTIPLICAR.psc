Algoritmo TablaPares
    Definir numero, contador, resultado Como Entero
	
    contador <- 0
	
    Escribir "Ingrese un numero:"
    Leer numero
	
    resultado <- numero * 1
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 2
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 3
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 4
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 5
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 6
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 7
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 8
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 9
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    resultado <- numero * 10
    Si resultado MOD 2 = 0 Entonces
        contador <- contador + 1
    FinSi
	
    Escribir "Resultados pares: ", contador
FinAlgoritmo
