package odev2;

public class UserManager {
  public void Add(User user) {
	  System.out.println("Kullan�c� eklendi : " + user.getName());
  }
  public void Remove(User user) {
	  System.out.println("Kullan�c� silindi : " + user.getName());
  }
}
