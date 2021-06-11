package edu.escuelaing.arsw.Networking;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Desarrollado en clase en conjunto con le profesor
 * Escriba un programa en el cual usted cree un objeto URL e imprima en
 * pantalla cada uno de los datos que retornan los 8 m´etodos de la secci´on anterior.
 */
public class URLReader {

    public static void main(String[] args)throws MalformedURLException {
        URL personalSite = new URL("https://campusvirtual.escuelaing.edu.co/moodle/");
        System.out.println("Protocolo"+personalSite.getProtocol());

        System.out.println("Authority"+personalSite.getAuthority());
        System.out.println("Host"+personalSite.getHost());
        System.out.println("Port"+personalSite.getPort());
        System.out.println("Path"+personalSite.getPath());
        System.out.println("Query"+personalSite.getQuery());
        System.out.println("File"+personalSite.getFile());
        System.out.println("Ref"+personalSite.getRef());
    }

}
