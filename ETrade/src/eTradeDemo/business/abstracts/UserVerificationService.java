package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface UserVerificationService {

	void emailValidation(User user);//do�rulama e postas�
	void completionOfMembership(User user);//�yeli�i tamamlama
}
