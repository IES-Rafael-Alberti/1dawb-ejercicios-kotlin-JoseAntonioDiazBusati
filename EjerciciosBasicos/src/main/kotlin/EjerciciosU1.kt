import kotlin.math.roundToInt

/**
 *Ejercicio 1.2.4
 * Escribe un programa que le pida al usuario una temperatura en grados Celsius,
 * la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
 */
fun ejercicio1(){
    print("Introduce una temperatura en Celsisus para convertirla en Fahrenheit: ")
    val celsius = readln().toDouble()
    val fahrenheit = ((celsius * 9/5) + 32)
    println("La temperatura sería de ${fahrenheit}ºF.")

}
/**
 *Ejercicio 1.2.6
 * Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla
 * el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).
 */
fun ejercicio2(){
    print("Introduce el precio de un producto: ")
    val articulo = readln().toDouble()
    var iva = 0.1
    val ivaprecio = (articulo * iva)
    val precio = (articulo - ivaprecio)
    println("Se ha pagado ${ivaprecio}€ de IVA y el importe sin IVA es de ${precio}€")
}

/**
 * Ejercicio 1.2.12
 * Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal
 * y lo almacene en una variable,y muestre por pantalla la frase Tu índice de masa corporal es donde
 * es el índice de masa corporal calculado redondeado con dos decimales.
 */
fun ejercicio3(){
    print("Introduce su peso en kg: ")
    val peso = readln().toInt()
    print("Introduce su altura en m: ")
    val altura = readln().toDouble()
    val imc = (peso/(altura * altura))
    println("Tu índice de masa corporal es de ${imc}.")
}

/**
 * Ejercicio 1.2.15
 * Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año.
 * Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de
 * tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros,
 * introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras
 * el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.
 */
fun ejercicio4(){

}

/**
 * Ejercicio 1.2.18
 * Escribir un programa que pregunte el nombre completo del usuario en la consola y
 * después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas,
 * otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula.
 * El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.
 */
fun ejercicio5(){}

/**
 * Ejercicio 1.2.20
 * Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34,
 * y la extensión tiene dos dígitos (por ejemplo +34-913724710-56).
 * Escribir un programa que pregunte por un número de teléfono con este formato y m
 * uestre por pantalla el número de teléfono sin el prefijo y la extensión.
 */


/**
 * Ejercicio 1.2.21
 * Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.
 */


/**
 * Ejercicio 1.2.22
 * Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal,
 * y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.
 */

/**
 * Ejercicio 1.2.24
 * Escribir un programa que pregunte por consola el precio de un producto en euros
 * con dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido
 */


/**
 * Ejercicio 1.2.25
 * Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla,
 * el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.
 */



/** Ejercicio 1.2.26
 * Escribir un programa que pregunte por consola por los productos de una cesta de la compra,
 * separados por comas, y muestre por pantalla cada uno de los productos en una línea distinta.
 */


/** Ejercicio 1.2.27
 * Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades y muestre
 * por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales,
 * el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
 */