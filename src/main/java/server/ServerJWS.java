package server;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {
        BanqueService bq = new BanqueService();
        // Définit l'URL à laquelle le service web sera publié.
        String url = "http://localhost:8085/";

        // Publie le service web à l'URL spécifiée en utilisant l'API Endpoint.
        // Cela permet au service web d'être accessible via des requêtes HTTP à cette URL.
        Endpoint.publish(url,bq);

        // Affiche l'URL du service web publié.
        System.out.println("Server url: " + url);
    }
}
