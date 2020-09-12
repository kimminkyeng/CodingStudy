package Homework;

public class Test1 {
  public static void main(String[] args) {
    int temp=0;
    int[] rannum = new int[6];
    
      for(int i=0;i<rannum.length;i++) {
        rannum[i] = (int)(Math.random()*45)+1; // '(Math.random()*45)+1' 45까지 무작위 수를 뽑기 위해 선언
        for(int j=0; j<i; j++) {
          if(rannum[i] == rannum[j]) i--; // i-- 는 중북숫자 제거
        
          if(rannum[i]<rannum[j]) {
            temp = rannum[i];
            rannum[i]=rannum[j];
            rannum[j]=temp;
          }
        }
      }
      System.out.print("당첨번호 : ");
      
      for(int i=0;i<rannum.length;i++) {
        System.out.print(rannum[i]+" ");
        }
    }
  }
        
    
