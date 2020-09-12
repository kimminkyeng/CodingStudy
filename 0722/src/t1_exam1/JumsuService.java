package t1_exam1;

public class JumsuService {
  //JumsuVo vo = new JumsuVo(); //기본생성자를 이용
  public void onTotal(JumsuVo vo) {
   vo.setTotal(vo.getKor() + vo.getEng());
  }
  
  public void onAvg(JumsuVo vo) {
    vo.setAvg(vo.getTotal()/2);
  }
  
  public void display(JumsuVo vo) {
    System.out.println(vo.getName()+"님의 총점은 "+vo.getTotal()+"평균은"+vo.getAvg());
  }
}
