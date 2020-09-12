package t1;

public class Test11 {
   public static void main(String[] args) {
    
     int i=0, tot=0, hap=0;
     
     while(i<100) {
       i++;
       hap+=i;
       tot+=hap;
     }
     System.out.println("tot =" + tot);
  }
}
