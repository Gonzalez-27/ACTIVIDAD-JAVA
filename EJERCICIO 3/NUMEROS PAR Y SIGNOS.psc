Algoritmo ParidadYSigno
    Definir numero Como Entero
	
    Escribir "Ingrese un numero entero:"
    Leer numero

    Si numero MOD 2 = 0 Entonces
        Escribir "El numero es par"
    SiNo
        Escribir "El numero es impar"
    FinSi
	
    // Determinar si es positivo, negativo o cero
    Si numero > 0 Entonces
        Escribir "El numero es positivo"
    SiNo
        Si numero < 0 Entonces
            Escribir "El numero es negativo"
        SiNo
            Escribir "El numero es cero"
        FinSi
    FinSi
	
FinAlgoritmo