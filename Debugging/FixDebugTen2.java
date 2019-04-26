// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class FixDebugTen2
{
   public static void main(String args[]) 
   {
      FixDebugVacation vacation= new FixDebugVacation();
      FixDebugExtendedVacation extendedVacation =
         new FixDebugExtendedVacation();

      System.out.println("My vacation is for " +
         vacation.getDays() + " days");

      System.out.println("Your vacation is for " +
         extendedVacation.getDays() + " days");
   }
}
