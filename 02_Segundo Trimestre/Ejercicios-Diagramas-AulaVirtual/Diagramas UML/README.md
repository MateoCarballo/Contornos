# Ejercicios-Diagramas-AulaVirtual

Ejercicios
Representa mediante Diagrama de Clases (con nombres de relaciones y roles), las siguientes especificaciones:



## Tarea 1. Empleados de Empresa

Una aplicación guardará información sobre empresa, empleados y clientes. Estos dos últimos se caracterizan por nombre y edad.
Empleados tienen sueldo bruto, los empleados directivos tienen una categoría, así como un conjunto de empleados subordinados.
Clientes a mayores se necesita conocer teléfono de contacto.
Se necesita mostrar en la aplicación datos de empleados y clientes.

### Solución:
    Tenemos una clase empresa que es la que ejecuta la main y nos enseña un menu para elegir que queremos hacer
    

![Alt text](Diagramas%20UML/Ejercicio%201.drawio.svg)


## Tarea 2. Biblioteca

Una biblioteca tiene copias de libros.
Los libros se caracterizan por su nombre, tipo (novela, teatro, poesía, ensayo), editorial, año y autor.
Los autores se caracteriza por su nombre, nacionalidad y fecha de nacimiento.
Cada copia tiene un identificador y puede estar en la biblioteca, prestada, con retraso o en reparación.
Los lectores pueden tener un máximo de 3 libros en préstamo.
Cada libro se presta un máximo de 30 días. Por cada día de retraso, se impone una "multa" de dos días sin posibilidad de coger un nuevo libro.
Añadir los métodos necesarios para realizar el préstamo y devolución de libros.


#### SOLUCION:

![](Diagramas%20UML/Ejercicio%202.drawio.svg)

## Tarea 3. Redes de Ordenadores


Los elementos que se pueden incluir en la red son: Servidor, PC, Impresora, Hub, Cable de Red
PCs se pueden conectar con un único hub, los servidores con uno o varios.
Los Servidores y PCs pueden generar mensajes, con una cierta longitud.
Los Hubs tienen un número de puertos, algunos de los cuales pueden usarse para conectar otros Hubs.
Tienen cierta probabilidad de "perder" mensajes.
Las impresoras pueden averiarse, con cierta probabilidad, durante cierto tiempo.


## Tarea 4.  Robot Modular

Se quiere hacer el diseño de un robot modular. El robot estará compuesto por varios módulos entre los que se encuentran: rotación, extensión, helicoidal, cámara. Los módulos podrán ser:

dinámicos (capaces de moverse: rotación, extensión, helicoidal)
o estáticos (no se pueden mover: cámara).
Los módulos tendrán un identificador (1-255) y unas dimensiones (largo, ancho y alto, entre 1 y 200mm). Los módulos estarán compuestos de un sistema de control y un sistema de comunicación.

Los módulos dinámicos tendrán:

motores (1 ó 2).
un parámetro que es el tipo de movimiento que pueden realizar.
una función que es moverse (con parámetro el tipo de movimiento).
Los módulos estáticos podrán tener sensores (de 0 a 5).

El sistema de control utiliza el sistema de mensajes para comunicarse. Los módulos pueden enviar y recibir mensajes de/hacia el usuario y otros módulos, con un parámetro que es un array de datos a mandar o recibir. También utiliza los motores para moverse y los sensores para captar información del medio.

Se pide que utilizando herencia siempre que se pueda, se realice un diseño UML de las clases necesarias para representar todas las entidades del sistema, indicando atributos y métodos, así como las relaciones existentes entre las clases.

#### Aclaraciones para mi solución del ejercicio:
   

## Tarea 5. Sistema de Gestión Bibliográfica

Se desea realizar el modelo de un sistema de gestión bibliográfica. Para ello se consideran los siguientes conceptos:

 Hay “Bases_de_datos” que tienen un atributo que es su “url”, y un método “anadir_publicación” (que devuelve un puntero a “Publicación” y tiene un parámetro que es un string).
Las bases de datos se componen de “Publicaciones”.
Una publicación tiene dos atributos: “nombre” (de tipo string) y “fecha” (de tipo Date – suponerla ya implementada). 
Hay varios tipos de publicaciones: “Articulo_de_conferencia”, “Capitulo_de_libro” y “Libro”. A su vez hay un tipo de libro que son los “Proceedings”, que son libros compuestos por varios artículos de una misma conferencia. Los artículos de conferencia tienen un atributo: “num_paginas” (int). Los capítulos de libro tienen un atributo: “num_capitulo” (int). Los libros tienen un atributos: “ISBN” (array de 4 enteros). Los proceedings tienen un atributo: “lugar_conferencia” (string).
Los libros pueden contener capítulos de libro.
Los proceedings están compuestos por artículos de conferencia.
También hay “Autores”, que tienen tres atributos: “nombre” (string), “correo_electronico” (string) y “entidad” (string), y un método: “añadir_entidad” (no devuelve nada, y tiene un parámetro de tipo string).
Los autores pueden escribir artículos y consultar bases de datos.
Utilizando herencia siempre que se pueda, realizar un diseño UML de clases del sistema indicando:
Las clases que se consideren necesarias con sus atributos y métodos. El tipo de privacidad más idóneo. Las relaciones entre clases: asociación, dependencia, herencia, agregación, composición, etc. La multiplicidad en las relaciones entre clases. Al menos una de las clases debe ser abstracta (indicarlo claramente).



## Tarea 6: Gestión de pedidos.

• Una aplicación de gestión de pedidos desea guardar información de los pedidos que realizan sus clientes y la fecha en que se formalizan.

• Los pedidos constan habitualmente de varios productos.

• El coste total del pedido se calcula a partir de los precios individuales de cada producto, así como de la cantidad e impuestos asociados.

• Hay que mantener información sobre las existencias de cada producto, con el fin de poder informar al cliente si habrá retrasos en la entrega del pedido.

• El pedido se podrá pagar de una vez o en varios pagos.

• Las formas de pago posible son:

      ◦ Tarjeta de crédito (fecha de caducidad, número o MASTERCARD).

      ◦ Efectivo (moneda). ◦ Cheque (nombre, entidad bancaria).

• El pedido podrá estar en uno de estos estados: pendiente, pagado, procesando, enviado y entregado.



## Tarea 7: Hospital.

• Un hospital trabaja con un conjunto de pacientes, médicos y enfermeros.

• Un paciente es atendido por uno o más médicos y es asistido por un grupo de enfermeros.

• Cada paciente se describe por su número de historia clínica, su nombre y su dirección.

• Del personal sanitario (médicos y enfermeros) se mantiene información sobre su número de empleado, nombre y tipo. En los médicos hay que indicar, además, su especialidad.

• De cada paciente se mantiene un registro de los análisis realizados, identificados por un número de referencia, además se indica el tipo de análisis, la fecha de realización, el médico que solicitó dicho análisis, el o los enfermeros que realizaron las prueba y los resultados obtenidos en dicha prueba