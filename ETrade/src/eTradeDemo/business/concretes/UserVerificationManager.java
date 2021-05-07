package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.UserVerificationService;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.dataAccess.concretes.LoginUserDao;
import eTradeDemo.entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {

	UserDao userDao=new LoginUserDao();
	@Override
	public void emailValidation(User user) {
		System.out.println("Do�rulama e postas�n� "+user.getEmail() +" hesab�na g�nderdik.L�tfen do�rulay�n�z.");
		completionOfMembership(user);
	}

	@Override
	public void completionOfMembership(User user) {
		System.out.println("�yeli�iniz tamamlanm��t�r.");
		
	}

}
