package edu.escuelaing.arsw.Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** Echo Server para ejercicio 4.3.2
 * Escriba un servidor que pueda recibir un numero y responda con un operacion sobre este numero.
 * Este servidor puede recibir un mensaje que empiece por
 * fun:,si recibe este mensaje cambia la operacion a las especificada. El servidor
 * debe responder las funciones seno, coseno y tangente. Por defecto debe empezar
 * calculando el coseno. Por ejemplo, si el primer numero que recibe es 0, debe
 * responder 1, si despues recibe π/2 debe responder 0, si luego recibe fun:sin
 * debe cambiar la operacion actual a seno, es decir a a partir de ese momento
 * debe calcular senos. Si enseguida recibe 0 debe responder 0.
 */
public class EchoServerOperaciones {
    private static String operacionActual = "coseno";
    private static String numero = "1";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35002);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35002.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.equals("fun:sin")) {
                operacionActual = "Seno";
            } else if (inputLine.equals("fun:cos")) {
                operacionActual = "Coseno";
            } else if (inputLine.equals("fun:tan")) {
                operacionActual = "Tangente";
            } else numero = inputLine;

            operacion(operacionActual, numero);

            System.out.println("Mensaje:" + inputLine);
            outputLine = "Respuesta:" + inputLine;
            out.println(outputLine);

            if (outputLine.equals("Respuestas: Bye."))
                break;
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
    /*public static Double validacion(String inputLine) throws FunctionServerException{
        String[] nuevo = inputLine.split("");
        String fuction ="fun:cos";

    }*/
    public static void operacion(String operacionActual, String numero) {
        if (operacionActual.equals("Coseno")) {
            Math.cos(Double.parseDouble(numero));
        } else if ((operacionActual.equals("Seno"))) {
            Math.sin(Double.parseDouble(numero));
        } else if ((operacionActual.equals("Tangente"))) {
            Math.tan(Double.parseDouble(numero));
        }

    }
}


