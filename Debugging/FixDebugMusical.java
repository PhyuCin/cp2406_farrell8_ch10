public class FixDebugMusical extends FixDebugPlay
{
   private String composer;
   
   FixDebugMusical(String title, String author, String comp)
   {
      super(title, author);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is"  + this.getTitle() +
        " by " + this.getAuthor() + "\nThe music for " + this.getTitle() +
        " is by " + composer);
   }
}