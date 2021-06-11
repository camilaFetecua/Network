# Introduccion a esquemas de nombres, redes,clientes y servicios con Java.

# Prerequisitos 
  + Git version 2.25.1
  + Apavhe Maven version 4.0.0
  + Java version 11.0.11
  
  Para verificar que esten instalados los programas puede usar los suguientes comandos
    + mvn --version
    + git version
    +java --version
       
# Ejecucion del proyecto

  Para empezar debemos clonar el repositorio con el siguiente comando:

      git clone https://github.com/camilaFetecua/Network.git
  
  Debemos ir al directorio raiz y se debe ejecutar el comando:
 
       mvn package

  ## Ejercicio 1
  
   Escriba un programa en el cual usted cree un objeto URL e imprima en
   pantalla cada uno de los datos que retornan los 8 metodos de la seccion anterior.
    
       java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Networking.URLReader
  
  ## Ejercicio 2
  
   Escriba una aplicacion browser que pregunte una direccion URL al usuario
   y que lea datos de esa direcci´on y que los almacene en un archivo con el nombre
   resultado.html.Luego intente ver este archivo en el navegador.
    
        java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Networking.URLScaner
    
  ## Ejercicio 3
  
   Escriba un servidor que reciba un numero y responda el cuadrado de este numero.
   
   Para este ejercicio se debe ejecutar  en diferentes terminales primero el cliente y luego el servidor 
   
       java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Sockets.EchoServerCuadrado
       java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Sockets.EchoClienCuadrado
  
  ## Ejercicio 4
  
   Escriba un servidor que pueda recibir un n´umero y responda con un operaci´on sobre este n´umero. Este servidor puede recibir un mensaje que empiece por
   “fun:”, si recibe este mensaje cambia la operaci´on a las especificada. El servidor
   debe responder las funciones seno, coseno y tangente. Por defecto debe empezar
   calculando el coseno. Por ejemplo, si el primer n´umero que recibe es 0, debe
   responder 1, si despu´es recibe π/2 debe responder 0, si luego recibe “fun:sin”
   debe cambiar la operaci´on actual a seno, es decir a a partir de ese momento
   debe calcular senos. Si enseguida recibe 0 debe responder 0.
    
   Para este ejercicio se debe ejecutar  en diferentes terminales primero el cliente y luego el servidor 
    
      java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Sockets.EchoClienOperaciones
      java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Sockets.EchoServerOperaciones

  ## Ejercicio 5
   Escriba un servidor web que soporte multiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo
   paginas html e imagenes.
    
    
    java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.HttpServer.HttpServer
    
    
   ## Ejercicio 6

   Utilizando Datagramas escriba un programa que se conecte a un servidor
  que responde la hora actual en el servidor. El programa debe actualizar la hora
  cada 5 segundos seg´un los datos del servidor. Si una hora no es recibida debe
  mantener la hora que ten´ıa. Para la prueba se apagar´a el servidor y despu´es de
  unos segundos se reactivar´a. El cliente debe seguir funcionando y actualizarse
  cuando el servidor este nuevamente funcionando.
  
  Para este ejercicio se debe ejecutar  en diferentes terminales primero el cliente y luego el servidor 

      java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Datagram.DatagramTimeServer
      java -cp Network-1.0-SNAPSHOT.jar edu.escuelaing.arsw.Datagram.DatagramTimeClient



# Diagrama de clase 
# Licencia

  Para consultar la Licencia del proyecto haga [click aqui](https://github.com/camilaFetecua/Network/blob/main/LICENSE.md)
  
  
# Autor 
  **Maria Camila Fetecua Garcia** 

