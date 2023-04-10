public class Calculate {

 public void print(int n) {
     for (int i = 6; i >= 1; i--) {
         String text = "";
         for (int j = 1; j <= i; j++) {
             text = text + "#";
         }
         System.out.println(i + " " + text);
     }
 }
     public void factorial ( int m){
             int f = 1;
             
             for (int i = 1; i <= m; i++) {
                 f *= i;
             }
             System.out.println("Factorial of " + m + " is " + f);
     }

}
