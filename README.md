# Trabajo-Test-Conducir

Empezamos haciendo el Conector a la base de datos, este hace una referencia al archivo properties que contiene la url de la base de datos
esta es guardada en la variable url para su utilizacion posteriormente.

En la clase Recolector creo ArrayList de la clase Preguntas la cual contiene un constructor con todos los parametros que utilizo,
en la clase Recolector utilizo los metodos RellenarArrayListD y RellenarArrayListF para rellenar los arrayList con objetos de la
clase Preguntas.

Las clases Inicio y Examen son las clases que contienen interfaz grafica.
En la clase Inicio Establezco la cantidad de preguntas que quiero y la dificultad de estas.
Posteriormente se rellenaran los arrayList Especificos a la dificultad escogida y se trabaja con ellos en la clase examen la cual va sacando 
objetos del arraylist de forma aleatoria y los va colocando, en sus especificas posiciones.
No pude establecer que las respuestas se pusiesen de forma aleatoria, por lo que todas las respuestas correctas se encuentran en la primera posicion.

Los botones de la clase examen, el de salir te saca a la pantalla de inicio en el momento en el que tu le pulsas y te dice las preguntas acertadas.
El boton de continuar en cambio de va pasando de preguntas hasta que llega el limite que has establecido al principio, entonces te dice las
preguntas que has acertado y te saca de la aplicacion
