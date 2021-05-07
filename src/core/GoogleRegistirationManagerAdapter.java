package core;

import GoogleRegistiration.GoogleRegistirationManager;

public class GoogleRegistirationManagerAdapter implements AuthService {

	@Override
	public void registerToSystem(String message) {
		GoogleRegistirationManager manager = new GoogleRegistirationManager();
		manager.register(message);
		
	}

}
