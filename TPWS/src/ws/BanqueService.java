package ws;

import entity.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroDH")
    public double conversion(@WebParam(name="montant") double mnt){
        return mnt*11;
    }
    @WebMethod
    public Compte getCmpt(int code){
        return new Compte(code,Math.random()*9000,new Date());
    }
    @WebMethod
    public List<Compte> listCompte(){
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,Math.random()*9000,new Date()));
        comptes.add(new Compte(2,Math.random()*9000,new Date()));
        comptes.add(new Compte(3,Math.random()*9000,new Date()));
        return comptes;
    }
}
