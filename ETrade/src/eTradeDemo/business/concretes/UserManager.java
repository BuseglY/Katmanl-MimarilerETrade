package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.UserManagerService;
import eTradeDemo.core.SignUpToSystem;

public class UserManager implements UserManagerService {
	private SignUpToSystem signUpToSystem;
	public UserManager(SignUpToSystem signUpToSystem) {
		this.signUpToSystem=signUpToSystem;
		signUpToSystem.signUp();
	}

	@Override
	public void login() {
		this.signUpToSystem.logIn();
		
	}

}