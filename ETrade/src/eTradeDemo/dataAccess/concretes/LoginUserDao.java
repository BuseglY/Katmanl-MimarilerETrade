package eTradeDemo.dataAccess.concretes;

import eTradeDemo.dataAccess.abstracts.UserDao;

public class LoginUserDao implements UserDao{
	@Override
	public void login(String email, String password) {
			System.out.println("Sisteme giriþ yaptýnýz.");		
	}

	

}
