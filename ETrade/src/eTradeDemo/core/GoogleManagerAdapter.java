package eTradeDemo.core;

import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.dataAccess.concretes.LoginUserDao;
import eTradeDemo.google.GoogleManager;

public class GoogleManagerAdapter implements SignUpToSystem{

	UserDao userDao=new LoginUserDao();
	@Override
	public void signUp() {
		GoogleManager googleManager=new GoogleManager();
		googleManager.signUp("busegly@outlook.com");
	}

	@Override
	public void logIn() {
		this.userDao.login("busegly@outlook.com", "123456");
		
	}

}
