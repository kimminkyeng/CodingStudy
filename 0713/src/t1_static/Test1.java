package t1_static;

public class Test1 {
  int su1;
  int su2;
  
  Test1() {}
  
  Test1(int su1, int su2){
    this.su1 = su1; //this.su1은 필드의 su1 이다.
    this.su2 = su2;
  }// 7번줄이 생성자 오버로딩.(9번부터 12번줄까지 생성자)
  
  // 2x + 3y = ?
  int result() {
    int res = 2*su1 + 3*su2;
    return res; //res 결과 나옴
  }
  
  //2x + 3y = ?
  int result(int su1, int su2) {
   int res = 2*su1 + 3*su2;
   return res; // 21번줄부터 23번줄까지 메소드 오버로딩.(15번줄부터 17번줄까지 내용이 같아서)
 }
}
