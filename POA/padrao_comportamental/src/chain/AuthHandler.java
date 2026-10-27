package chain;

public class AuthHandler extends Handler {
	
	public void handle(String request) {
		if (request.equals("auth"))
			System.out.println("Autenticado");
		else if (next != null)
			next.handle(request);
	}

}
