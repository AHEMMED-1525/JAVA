public class EmpWge{
   public static void main(String args[]){
      int ispresent=1;
      double empCheck=Math.floor(Math.random()*2);
		int wageperhour=20;

   if(ispresent==empCheck){
		int fullday=8;
		double dailywage=wageperhour*fullday;
      System.out.println(dailywage);
   }
   else

      System.out.println("Employee is Absent");
   }
}


