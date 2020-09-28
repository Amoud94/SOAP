import WS.BanqueService;
import WS.BanqueWS;
import WS.Compte;

import java.util.List;

public class ClientWS {
    public  static void main(String[] args){
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroDH((990)));
        Compte cp = stub.getCmpt(3);
        System.out.println("Code :" + cp.getCode());
        System.out.println("Solde :" + cp.getSolde());
        System.out.println("--------------------");
        List<Compte> listComptes = stub.listCompte();
        listComptes.forEach(c ->{
            System.out.println("code :" + c.getCode());
            System.out.println("solde :" + c.getSolde());
            System.out.println("--------------------");
        });

    }
}