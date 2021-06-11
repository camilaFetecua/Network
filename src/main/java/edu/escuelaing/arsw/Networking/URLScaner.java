package edu.escuelaing.arsw.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

/**
 * Desarrollado en clase en conjunto con le profesor
 * Escriba una aplicaci´on browser que pregunte una direcci´on URL al usuario
 * y que lea datos de esa direcci´on y que los almacene en un archivo con el nombre
 * resultado.html.
 */

public class URLScaner {

    public static void main(String[] args) throws Exception {
         URL google = new URL("http://www.google.com/");
         try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String filename="google";
            PrintWriter outputFile= new PrintWriter("C:\\Users\\Camis\\Desktop\\Network\\Network\\"+filename+".html");
             String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                outputFile.println(inputLine);
            }
            reader.close();
            outputFile.close();
         } catch (IOException x) {
            System.err.println(x);
         }
    }
}





