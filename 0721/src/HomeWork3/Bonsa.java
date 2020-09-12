package HomeWork3;

public abstract class Bonsa {
  public int kimChiJjigae;
  public int buDaeJjigae;
  public int biBimBap;
  public int soonDaeKuk;
  public int gongKiBap;
  
  public String subTitle;
  
  public Bonsa() {}
  
  public abstract void price();
  
  public void menu() {
    System.out.println("** " + subTitle +" **");
    if(kimChiJjigae !=1)
      System.out.println("김치찌개 : " + kimChiJjigae);
    else
      msg("김치찌개");
    if(buDaeJjigae !=1)
      System.out.println("부대찌개 : " + buDaeJjigae);
    else
      msg("부대찌개");
    if(biBimBap !=1)
      System.out.println("비빔밥 : " + biBimBap);
    else
      msg("비빔밥");
    if(soonDaeKuk !=1)
      System.out.println("순대국 : " + soonDaeKuk);
    else
      msg("순대국");
    if(gongKiBap !=1)
      System.out.println("공기밥 : " + kimChiJjigae);
    else
      msg("공기밥");
  }
  private void msg(String food) {
    System.out.println(food + "는 판매하지 않습니다.");
  }
  
}
