package wsdlfirstcode;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-02-07T15:12:06.518+05:30
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "HelloWorldServiceImplService", 
                  wsdlLocation = "http://localhost:8678/Sandeep1?wsdl",
                  targetNamespace = "http://helloworld/") 
public class HelloWorldServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://helloworld/", "HelloWorldServiceImplService");
    public final static QName HelloWorldServiceImplPort = new QName("http://helloworld/", "HelloWorldServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8678/Sandeep1?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8678/Sandeep1?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public HelloWorldService getHelloWorldServiceImplPort() {
        return super.getPort(HelloWorldServiceImplPort, HelloWorldService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "HelloWorldServiceImplPort")
    public HelloWorldService getHelloWorldServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldServiceImplPort, HelloWorldService.class, features);
    }

}
