Algoritmo ConversionCelsiusFahrenheit
	
    Definir FACTOR_CONVERSION Como Real
    Definir AJUSTE_FAHRENHEIT Como Real
	
  
    Definir celsius Como Real
    Definir fahrenheit Como Real
	
    
    FACTOR_CONVERSION <- 9 / 5
    AJUSTE_FAHRENHEIT <- 32
	
  
    Escribir "Ingrese la temperatura en grados Celsius:"
    Leer celsius
	
 
    fahrenheit <- (celsius * FACTOR_CONVERSION) + AJUSTE_FAHRENHEIT
	

    Escribir "Temperatura en Celsius: ", celsius, " grados C"
    Escribir "Temperatura en Fahrenheit: ", fahrenheit, " grados F"
	
FinAlgoritmo