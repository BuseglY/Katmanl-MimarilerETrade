package eTradeDemo.business.concretes;

import eTradeDemo.business.abstracts.UserVerificationService;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.dataAccess.concretes.LoginUserDao;
import eTradeDemo.entities.concretes.User;

public class UserVerificationManager implements UserVerificationService {

	UserDao userDao=new LoginUserDao();
	@Override
	public void emailValidation(User user) {
		System.out.println("Doðrulama e postasýný "+user.getEmail() +" hesabýna gönderdik.Lütfen doðrulayýnýz.");
		completionOfMembership(user);
	}

	@Override
	public void completionOfMembership(User user) {
		System.out.println("Üyeliðiniz tamamlanmýþtýr.");
		
	}

}
