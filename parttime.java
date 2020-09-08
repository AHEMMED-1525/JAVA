class parttime{
   public static void main(String args[]){
      int ispresent=1;
		int isparttime=2;
      double empCheck=Math.floor(Math.random()*3);
      int wageperhour=20;

   if(ispresent==empCheck){
      int fulltime=16;
      double dailywage=wageperhour*fulltime;
      System.out.println(dailywage);
   }
	else if(isparttime==empCheck){
	   int parttime=8;
      double dailywage=wageperhour*parttime;
      System.out.println(dailywage);
	}
   else

      System.out.println("Employee is Absent");
   }
}

