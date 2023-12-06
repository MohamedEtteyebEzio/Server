package serveur;


import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;



public class ServeurJWS {

    public static void main(String[] args) {
        CalculatriceWS calculatriceWS =new CalculatriceWS();

       String  url="http://localhost:8089/";
        Endpoint.publish(url,calculatriceWS);
        System.out.println(url);
    }
}
