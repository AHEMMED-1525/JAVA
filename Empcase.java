
public class Empcase{
	public static void main(String[] args){
		int wageperhour=20;
		int empCheck=(int)(Math.floor(Math.random()*3));

		switch(empCheck) {
		case 1:
		int fulltime=16;
      int dailywag=wageperhour*fulltime;
		System.out.println(dailywag);
		break;

		case 2:
      int parttime=8;
      int dalywage=wageperhour*parttime;
      System.out.println(dalywage);
      break;

		default:
	   int dilywage=wageperhour*0;
      System.out.println(dilywage);
     }
  }
}
