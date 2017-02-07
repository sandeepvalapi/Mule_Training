package helloworld;

import javax.jws.WebService;

/**'
 * Sample Webservice method which we would like to expose as a webservice
 * @author svalapi
 *
 */
@WebService
public interface HelloWorldService {
	public String print(String printValue);
	
	public AccountInfo getAccount();
}
