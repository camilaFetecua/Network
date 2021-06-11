package edu.escuelaing.arsw.Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/** Echo Client para ejercicio 4.3.2
 * Escriba un servidor que pueda recibir un n´umero y responda con un operaci´on sobre este n´umero. Este servidor puede recibir un mensaje que empiece por
 * “fun:”, si recibe este mensaje cambia la operaci´on a las especificada. El servidor
 * debe responder las funciones seno, coseno y tangente. Por defecto debe empezar
 * calculando el coseno. Por ejemplo, si el primer n´umero que recibe es 0, debe
 * responder 1, si despu´es recibe π/2 debe responder 0, si luego recibe “fun:sin”
 * debe cambiar la operaci´on actual a seno, es decir a a partir de ese momento
 * debe calcular senos. Si enseguida recibe 0 debe responder 0.
 */
public class EchoClienOperaciones {
    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            echoSocket = new Socket("127.0.0.1", 35002);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don’t know about host!.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn’t get I/O for "
                    + "the connection to: localhost.");
            System.exit(1);
        }
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println("echo: " + in.readLine());
            if (userInput.equals("Bye.")) break;
        }
        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}
