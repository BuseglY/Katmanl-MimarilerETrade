package eTradeDemo.business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeDemo.business.abstracts.UserCheckService;
import eTradeDemo.business.abstracts.UserVerificationService;
import eTradeDemo.core.SignUpToSystem;
import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class SignUpWithInformation implements UserCheckService,SignUpToSystem {
	ArrayList<String> emails=new ArrayList<String>();
	UserVerificationService userVerificationService=new UserVerificationManager();
	private UserDao userDao;
	private User user;
	int check=0;
	public SignUpWithInformation(User user) {
		this.user=user;
		checkToPassword(user);
		emailCreationControl(user);
		checkToEmail(user);
		checkToFirstName(user);
		checkToLastName(user);
		
	}
	@Override
	public void signUp() {
		if(check==0) {
			userVerificationService.emailValidation(this.user);
		}else
			System.out.println("�yeli�iniz ge�erli de�ildir.");
	}
	@Override
	public void checkToPassword(User user) {
		if(user.getPassword().length()<6)
		{
			System.out.println("Parolan�z en az 6 karakterden olu�mal�d�r.");
			check++;
		}
	}

	@Override
	public void emailCreationControl(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(!matcher.matches()) {
			System.out.println("E-posta istenilen formatta de�ildir.");
			check++;
		}
	}

	@Override
	public void checkToEmail(User user) {
		if(emails.contains(user.getEmail())) {
			System.out.println("Bu e mail daha �nce kullan�lm��t�r.");
			check++;
		}
		emails.add(user.getEmail());
	}

	@Override
	public void checkToFirstName(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("Ad�n�z en az iki karakterden olu�mal�d�r.");
			check++;
		}
	}

	@Override
	public void checkToLastName(User user) {
		if(user.getLastName().length()<2) {
			System.out.println("Soyad�n�z en az iki karakterden olu�mal�d�r.");
			check++;
		}
	}

	@Override
	public void logIn() {
		if(check==0) {
			this.userDao.login(user.getEmail(), user.getPassword());
		}else
			System.out.println("��lem ba�ar�s�z.Giri� yapamazs�n�z.");
		
	}
	

}
