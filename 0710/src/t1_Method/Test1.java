package t1_Method;

public class Test1 {
  
  int plus(int su1,int su2) {
    int res = su1+su2;
    return res;
  }
  
  double plus2(int su1, double su2) {
    double res = su1 + su2;
    return res;
  }
  
  double plus3(double su1, int su2) {
    double res = su1 + su2;
    return res;
  }
  
  //int plus(int mbc, int kbs) { // type이 같은게 있어서 에러남. 위에 'int plus(int su1,int su2)'. 
    //int res = mbc * kbs;
    //return res;
  //}
  
  double plus(double mbc, double kbs) { // type이 같은게 있어서 에러남. 위에 'int plus(int su1,int su2)'. 
    double res = mbc * kbs;
    return res;
  }
  
  //double plus(int su1, int su2) { 메소드 오버로딩이 될 수 없다. 메소드 오버로딩은 '매개변수'의 타입/개수/순서의 변화에 따라서 만들 수 있다.
    //double res = su1 + su2;
    //return res;
  //}
}
