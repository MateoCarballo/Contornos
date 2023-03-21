
# Enunciado. 

## Parte 1.
Nos han contratado para diseñar un software de alquiler de vehículos. Nos hemos reunido con el
cliente para definir los requisitos.
Para cada vehículo, conocemos la marca y el modelo. Los vehículos que se alquilan son motos,
coches y bicis. Para las motos se almacena la matrícula y potencia; para los coches, la matrícula, el
tipo de combustible y el número de plazas; y para las bicis, el número de serie.
Los vehículos podrán alquilarse por usuarios de los que guardaremos el nombre, e-mail, teléfono y
fecha de caducidad del carnet de conducir. Cada vez que se alquile un vehículo se guardará la
fecha y hora de inicio, fecha y hora de fin y kilómetros recorridos.
Cuando se detecte un problema en un vehículo, se almacenará una descripción para cada
problema que se detecte. Inmediatamente, un mecánico se desplazará hasta el vehículo para
realizar las reparaciones necesarias. Los mecánicos no forman parte de la empresa, por lo que no
tendremos todos sus datos, únicamente se dispone de un código y la zona preferente de actuación.
Cada vez que se realiza una reparación, se debe registrar la fecha y el resultado de la reparación.
También se necesita tener un registro de los accidentes que ha sufrido cada vehículo, de los cuales
se necesita saber la fecha del accidente y la gravedad.



    Desarrolla un diagrama UML que cumpla con los requisitos propuestos por el cliente.
		
		
		
## Parte 2.
Se nos ha pedido que añadamos algunas funcionalidades exclusivas para los vehículos a motor y
otras funcionalidades exclusivas para los vehículos sin motor. Los vehículos a motor ahora tienen la
funcionalidad de verificar la salud del motor con el método engineStatus(). Los vehículos sin motor
verificarán el estado del mecanismo que utilicen con el método mechanismStatus().

		Desarrolla solo la parte del UML necesaria para que cumpla con este nuevo requisito.