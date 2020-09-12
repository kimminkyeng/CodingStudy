package Homework;
//18번
public class ShopService {

  private static ShopService t1 = new ShopService();
  
  private ShopService() {}
  
  static ShopService getInstance() {
    return t1;
  }
}
