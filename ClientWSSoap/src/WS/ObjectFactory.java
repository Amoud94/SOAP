
package WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListCompteResponse_QNAME = new QName("http://ws/", "listCompteResponse");
    private final static QName _ConversionEuroDH_QNAME = new QName("http://ws/", "ConversionEuroDH");
    private final static QName _ListCompte_QNAME = new QName("http://ws/", "listCompte");
    private final static QName _GetCmpt_QNAME = new QName("http://ws/", "getCmpt");
    private final static QName _ConversionEuroDHResponse_QNAME = new QName("http://ws/", "ConversionEuroDHResponse");
    private final static QName _GetCmptResponse_QNAME = new QName("http://ws/", "getCmptResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListCompteResponse }
     * 
     */
    public ListCompteResponse createListCompteResponse() {
        return new ListCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroDH }
     * 
     */
    public ConversionEuroDH createConversionEuroDH() {
        return new ConversionEuroDH();
    }

    /**
     * Create an instance of {@link ListCompte }
     * 
     */
    public ListCompte createListCompte() {
        return new ListCompte();
    }

    /**
     * Create an instance of {@link GetCmpt }
     * 
     */
    public GetCmpt createGetCmpt() {
        return new GetCmpt();
    }

    /**
     * Create an instance of {@link ConversionEuroDHResponse }
     * 
     */
    public ConversionEuroDHResponse createConversionEuroDHResponse() {
        return new ConversionEuroDHResponse();
    }

    /**
     * Create an instance of {@link GetCmptResponse }
     * 
     */
    public GetCmptResponse createGetCmptResponse() {
        return new GetCmptResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCompteResponse")
    public JAXBElement<ListCompteResponse> createListCompteResponse(ListCompteResponse value) {
        return new JAXBElement<ListCompteResponse>(_ListCompteResponse_QNAME, ListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroDH")
    public JAXBElement<ConversionEuroDH> createConversionEuroDH(ConversionEuroDH value) {
        return new JAXBElement<ConversionEuroDH>(_ConversionEuroDH_QNAME, ConversionEuroDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCompte")
    public JAXBElement<ListCompte> createListCompte(ListCompte value) {
        return new JAXBElement<ListCompte>(_ListCompte_QNAME, ListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCmpt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCmpt")
    public JAXBElement<GetCmpt> createGetCmpt(GetCmpt value) {
        return new JAXBElement<GetCmpt>(_GetCmpt_QNAME, GetCmpt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroDHResponse")
    public JAXBElement<ConversionEuroDHResponse> createConversionEuroDHResponse(ConversionEuroDHResponse value) {
        return new JAXBElement<ConversionEuroDHResponse>(_ConversionEuroDHResponse_QNAME, ConversionEuroDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCmptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCmptResponse")
    public JAXBElement<GetCmptResponse> createGetCmptResponse(GetCmptResponse value) {
        return new JAXBElement<GetCmptResponse>(_GetCmptResponse_QNAME, GetCmptResponse.class, null, value);
    }

}
