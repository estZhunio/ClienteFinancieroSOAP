
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InicioFinanciero", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/ServicioFinancieroSOAP/InicioFinanciero?WSDL")
public class InicioFinanciero_Service
    extends Service
{

    private final static URL INICIOFINANCIERO_WSDL_LOCATION;
    private final static WebServiceException INICIOFINANCIERO_EXCEPTION;
    private final static QName INICIOFINANCIERO_QNAME = new QName("http://ws/", "InicioFinanciero");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioFinancieroSOAP/InicioFinanciero?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INICIOFINANCIERO_WSDL_LOCATION = url;
        INICIOFINANCIERO_EXCEPTION = e;
    }

    public InicioFinanciero_Service() {
        super(__getWsdlLocation(), INICIOFINANCIERO_QNAME);
    }

    public InicioFinanciero_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), INICIOFINANCIERO_QNAME, features);
    }

    public InicioFinanciero_Service(URL wsdlLocation) {
        super(wsdlLocation, INICIOFINANCIERO_QNAME);
    }

    public InicioFinanciero_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INICIOFINANCIERO_QNAME, features);
    }

    public InicioFinanciero_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InicioFinanciero_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InicioFinanciero
     */
    @WebEndpoint(name = "InicioFinancieroPort")
    public InicioFinanciero getInicioFinancieroPort() {
        return super.getPort(new QName("http://ws/", "InicioFinancieroPort"), InicioFinanciero.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InicioFinanciero
     */
    @WebEndpoint(name = "InicioFinancieroPort")
    public InicioFinanciero getInicioFinancieroPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "InicioFinancieroPort"), InicioFinanciero.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INICIOFINANCIERO_EXCEPTION!= null) {
            throw INICIOFINANCIERO_EXCEPTION;
        }
        return INICIOFINANCIERO_WSDL_LOCATION;
    }

}
