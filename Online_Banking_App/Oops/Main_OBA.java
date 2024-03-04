package Oops;

public class Main_OBA {
   public static void main(String args[])
   {
	   Online_Banking_App oba=new Online_Banking_App("Yogasri",1234556,"vyoga@gmail.com",0.00,1234567893);
	   oba.depositedMoney(1000);
	   oba.withdrew_Money(200);
	   oba.depositedMoney(299902);
	   oba.withdrew_Money(55);
   }
}
