import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args){
        String url ="http://localhost:8686/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("service deploye sur :"+ url);
    }
}
