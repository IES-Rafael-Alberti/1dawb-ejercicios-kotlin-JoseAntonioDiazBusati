/**
 * Ejercicio 3.1.4
 * Escribir un programa que pregunte al usuario los números ganadores
 * de la lotería primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
 */


/**
 * Ejercicio 3.1.6
 * Escribir un programa que almacene las asignaturas de un curso
 * (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota
 * que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas.
 * Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.
 */


/**
 * Ejercicio 3.1.8
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.
 */


/**
 * Ejercicio 3.1.9
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.
 */



/**
 * Ejercicio 3.1.10
 * Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.
 */


/**
 * Ejercicio 3.1.13
 * Escribir un programa que pregunte por una muestra de números, separados por comas,
 * los guarde en una lista y muestre por pantalla su media y desviación típica.
 */


/**
 * Ejercicio 3.2.3
 * Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte al usuario por una fruta,
 * un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta.
 * Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.
 */


/**
 * Ejercicio 3.2.5
 * Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso
 * {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por pantalla los créditos de cada asignatura en
 * el formato <asignatura> tiene <créditos> créditos, donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos.
 * Al final debe mostrar también el número total de créditos del curso.
 */



/** Ejercicio 3.2.6
 * Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre
 * una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario.
 * Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.
 */



 /**
 * Ejercicio 3.2.7
 * Escribir un programa que cree un diccionario simulando una cesta de la compra.
 * El programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar.
 * Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato
 */


/**
 * Ejercicio 3.2.8
 * Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas
 * por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe crear un diccionario con las palabras y sus traducciones.
 * Después pedirá una frase en español y utilizará el diccionario para traducirla palabra a palabra.
 * Si una palabra no está en el diccionario debe dejarla sin traducir.
 */


/**
 * Ejercicio 3.2.10
 * Escribir un programa que permita gestionar la base de datos de clientes de una empresa.
 * Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor será otro diccionario con
 * los datos del cliente (nombre, dirección, teléfono, correo, preferente), donde preferente tendrá el valor True si se trata de un cliente preferente.
 * El programa debe preguntar al usuario por una opción del siguiente menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4)
 * Listar todos los clientes, (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el programa tendrá que hacer lo siguiente:
 *
 * Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
 * Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
 * Preguntar por el NIF del cliente y mostrar sus datos.
 * Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
 * Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
 * Terminar el programa.
 */


/**
 * Ejercicio 3.2.11¶
 * El directorio de los clientes de una empresa está organizado en una cadena de texto como la de más abajo,
 * donde cada línea contiene la información del nombre, email, teléfono, nif, y el descuento que se le aplica.
 * Las líneas se separan con el carácter de cambio de línea \n y
 * la primera línea contiene los nombres de los campos con la información contenida en el directorio.
 *
 * "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
 * \n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
 *
 * Escribir un programa que genere un diccionario con la información del directorio, donde cada elemento corresponda
 * a un cliente y tenga por clave su nif y por valor otro diccionario con el resto de la información del cliente.
 * Los diccionarios con la información de cada cliente tendrán como claves los nombres de los campos y
 * como valores la información de cada cliente correspondientes a los campos. Es decir, un diccionario como el siguiente
 *
 * {'01234567L': {'nombre': 'Luis González', 'email': 'luisgonzalez@mail.com', 'teléfono': '656343576',
 * 'descuento': 12.5}, '71476342J': {'nombre': 'Macarena Ramírez', 'email': 'macarena@mail.com', 'teléfono': '692839321', 'descuento': 8.0},
 * '63823376M': {'nombre': 'Juan José Martínez', 'email': 'juanjo@mail.com', 'teléfono': '664888233', 'descuento': 5.2},
 * '98376547F': {'nombre': 'Carmen Sánchez', 'email': 'carmen@mail.com', 'teléfono': '667677855', 'descuento': 15.7}}
 */


/**
 * Ejercicio 3.3.1
 * Suponer una lista con datos de las compras hechas por clientes de una empresa a lo largo de un mes,
 * la cual contiene tuplas con información de cada venta: (cliente, día del mes, monto, domicilio del cliente). Ejemplo:
 *
 * [("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), ("Jorge Russo", 7, 699, "Mirasol 218"), ("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
 * ("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), ("Jorge Russo", 15, 958, "Mirasol 218")]
 *
 * Escribir una función que reciba como parámetro una lista con el formato mencionado anteriormente y retorne los domicilios de cada cliente
 * al cual se le debe enviar una factura de compra. Notar que cada cliente puede haber hecho más de una compra en el mes,
 * por lo que la función debe retornar una estructura que contenga cada domicilio una sola vez.
 */



/**
 * Ejercicio 3.3.2
 * Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela, finalizando cuando se introduzca “x”.
 * A continuación, solicitar que introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.
 *
 * Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
 * Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
 * Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
 * Mostrar si todos los nombres de primaria están incluidos en secundaria.
 */



/**
 * Ejercicio 3.3.3
 * El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.
 *
 * Por ejemplo, el conjunto potencia de {1,2,3} es:
 *
 * {∅,{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}}
 * Escriba la función conjunto_potencia(s) que reciba como parámetro un conjunto cualquiera s y retorne su «lista potencia» (la lista de todos sus subconjuntos):
 *
 * >>> conjunto_potencia({6, 1, 4})
 * [set(), set([6]), set([1]), set([4]), set([6, 1]), set([6, 4]), set([1, 4]), set([6, 1, 4])]
 */


/**
 * Ejercicio 3.3.4
 * Dadas las siguientes listas:
 *
 * frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
 * frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]
 * Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.
 * Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto llamado frutas_comunes.
 * Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un conjunto llamado frutas_solo_en_frutas1.
 * Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un conjunto llamado frutas_solo_en_frutas2.
 */



/**
 * Ejercicio 3.3.5
 * Dado el conjunto de números enteros:
 *
 * numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 * Crea un conjunto pares que contenga los números pares del conjunto numeros.
 * Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
 * Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres.
 */



/**
 * Ejercicio 3.3.6
 * Dado el conjunto de letras:
 *
 * vocales = {'a', 'e', 'i', 'o', 'u'}
 * Crea un conjunto consonantes que contenga las letras del alfabeto que no son vocales.
 * Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto vocales como en el conjunto consonantes.
 * Estos ejercicios te ayudarán a practicar y comprender mejor cómo trabajar con conjuntos en Python. ¡Espero que te sean útiles!
 * Si tienes alguna pregunta o necesitas más ejercicios, no dudes en decírmelo.
 */


