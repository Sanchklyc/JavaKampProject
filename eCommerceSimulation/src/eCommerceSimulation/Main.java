package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.AuthManager;
import eCommerceSimulation.business.concretes.EmailManager;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.business.concretes.UserValidationManager;
import eCommerceSimulation.core.AuthService;
import eCommerceSimulation.core.GoogleAuthManagerAdapter;
import eCommerceSimulation.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new InMemoryUserDao());
		AuthService authService = new AuthManager(userService, new UserValidationManager(), new EmailManager());
		authService.register(1, "halitenes.kalayci@gmail.com", "123halit1234", "Halit Enes", "Kalaycý"); // Başarılı
		authService.register(2, "bubirepostadeðil..", "þifrevalid", "Halit Enes", "Kalaycý"); // Başarısız eposta invalid
		authService.register(3, "bubireposta@gmail.com", "s", "Halit Enes", "Kalaycý"); // Başarısız şifre invalid
		authService.register(4, "bubireposta@gmail.com", "s", "H", "K"); // Başarısız ad-soyad invalid
		authService.register(5, "halitenes.kalayci@gmail.com", "123halit1234", "Halit Enes", "Kalaycý"); // Başarısız e-posta mevcut

<<<<<<< HEAD
		authService.login("halitenes.kalayci@gmail.com", "123halit1234"); // Ba�ar�s�z �ye do�rulama yapmam��.
		userService.verifyUser(1); // Kullan�c�y� do�rulayal�m.
		authService.login("halitenes.kalayci@gmail.com", "123halit123"); // Ba�ar�s�z �ifre yanl��.
		authService.login("halitenes.kalayci@gmail.com", "123halit1234"); // Ba�ar�l�.
		authService.login("", ""); // Ba�ar�s�z e-posta parola zorunlu
=======
		authService.login("halitenes.kalayci@gmail.com", "123halit1234"); // Başarısız üye doğrulama yapmamış.
		userService.verifyUser(userService.getByEmail("halitenes.kalayci@gmail.com")); // Kullanıcıyı doğrulayalım.
		authService.login("halitenes.kalayci@gmail.com", "123halit123"); // Başarısız şifre yanlış.
		authService.login("halitenes.kalayci@gmail.com", "123halit1234"); // Başarılı.
		authService.login("", ""); // Başarısız e-posta parola zorunlu
>>>>>>> edba22a9adbd4adaca29d87340aacf41a977443b
		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "klyyc7@gmail.com", "123halit1234", "Halit Enes", "Kalaycý");
		googleAuthService.login("klyyc7@gmail.com", "123halit1234");
		
		
	}

}
