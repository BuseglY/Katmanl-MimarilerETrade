package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface UserVerificationService {

	void emailValidation(User user);//doðrulama e postasý
	void completionOfMembership(User user);//üyeliði tamamlama
}
