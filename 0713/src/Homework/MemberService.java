package Homework;

public class MemberService {
//15번
  public static boolean login(String id,String password) {
    if(id.equals("hong")) return (true) ;
    else if(password.equals("12345")) { System.out.println("로그인 되었습니다.");
    return (true) ;}
    else { System.out.println("id 또는 password 가 올바르지 않습니다. ");
      return (false); }}
      
    
    public static void logout(String id){
      System.out.println("로그아웃 되었습니다.");}
 }