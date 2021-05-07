package eTradeDemo;

import eTradeDemo.business.abstracts.UserManagerService;
import eTradeDemo.business.concretes.SignUpWithInformation;
import eTradeDemo.business.concretes.UserManager;
import eTradeDemo.core.GoogleManagerAdapter;
import eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User("Buse","Yýlmaz","busegly@outlook.com","123456");
		User user2=new User("B","Yýlmaz","buseglyoutlook.com","123");
		UserManagerService service1=new UserManager(new SignUpWithInformation(user1));
		service1.login();
		System.out.println("*****************************");
		UserManagerService service2=new UserManager(new SignUpWithInformation(user2));
		service2.login();
		
		System.out.println("*****************************");
		UserManagerService service3=new UserManager(new GoogleManagerAdapter());
		service3.login();

	}

}
