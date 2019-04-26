public class FixDebugPlay
{
   private String title;
   private String author;

   public FixDebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }

   public String getTitle(){
      return title;
   }

   public String getAuthor(){
      return author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}