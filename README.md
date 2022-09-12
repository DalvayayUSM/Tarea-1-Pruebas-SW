# Tarea-1-Pruebas-SW
Implementación  en Java que permite almacenar texto en una pila y realizar operaciones en la misma

## Nombre
Daniel Alvayay

## Descripción
Este programa consiste en una implementación de una pila que permite almacenar texto y realizar las siguientes operaciones:
* Agregar texto a la pila
* Ver cual es el texto más largo y el más corto
* Imprimir en pantalla algún texto
* Comparar los tamaños de dos textos

## Instalación
Para instalar este programa, basta con descargar los archivos que se encuentran en el [repositorio](https://github.com/DalvayayUSM/Tarea-1-Pruebas-SW), abrirlos en Visual Studio Code (u otro editor de preferencia) y ejecutarlos desde ahí. IMPORTANTE: Para la correcta ejecución del programa, se debe abrir la carpeta "Pila". Si no se hace esto, el programa puede mostrar error con las librerías de log4j2.

## Cómo usar
Al iniciar el programa, se le pedirá ingresar el tamaño de la pila.
Luego, se desplegará un menú con las siguientes opciones:
1. Agregar texto a la pila
2. Ver texto más largo y más corto
3. Imprimir texto de la pila
4. Comparar tamaños
5. Salir

Debe elegir una de estas opciones, las cuales se detallan a continuación.

### Agregar texto a la pila
Primero se verifica si la pila está llena. Si lo está, se notifica y se vuelve al menú principal. Si aún queda espacio, se pedirá ingresar un texto y luego se vuelve al menú principal.

### Ver texto más largo y más corto
Primero se verifica si la pila está vacía. Si lo está, se notifica y se vuelve al menú principal. Si hay al menos un elemento en la pila, se mostrará en pantalla cual es el texto más largo y el más corto. Luego se vuelve al menú principal.

### Imprimir texto de la pila
Primero se verifica si la pila está vacía. Si lo está, se notifica y se vuelve al menú principal. Si hay al menos un elemento en la pila, se pedirá ingresar una de las posiciones de la pila para que el texto que se encuentra ahí se imprima en pantalla.

### Comparar tamaños
Primero se verifica si la pila está vacía. Si lo está, se notifica y se vuelve al menú principal. Si hay al menos un elemento en la pila (puede compararse un elemento con si mismo), se pedirá ingresar una de las posiciones de la pila y luego otra para que luego se imprima en pantalla cual de los textos seleccionados es más largo.

### Salir
Termina el programa

## Cómo contribuir
Cualquier contribución puede ser enviada al correo daniel.alvayay@usm.cl

## Licencia
Este programa no tiene una licencia asociada
