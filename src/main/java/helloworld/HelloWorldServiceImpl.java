package helloworld;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String print(String printValue) {
		System.out.println("This is a sample print message - " + printValue);
		return "Hello " + printValue;
	}

	@Override
	public AccountInfo getAccount() {
		return new AccountInfo();
	}

}
