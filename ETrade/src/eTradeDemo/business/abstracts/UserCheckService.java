package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface UserCheckService {
	void checkToPassword(User user);
	void emailCreationControl(User user);
	void checkToEmail(User user);
	void checkToFirstName(User user);
	void checkToLastName(User user);
}
