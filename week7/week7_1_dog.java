package week7;

public class week7_1_dog {
   private int height, weight;
   private String color; 

   public week7_1_dog()
   {
      height=20;
      weight=30;
      color="black";
   } 
   
   
   public void bark()
   {
      System.out.println("wang wang");
   }



   public static void main(String[] args) {
      week7_1_dog dog = new week7_1_dog();
      dog.bark();
   }
}

