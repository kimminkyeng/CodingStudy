package Homework;
// 14번
public class MemberRun {
  public static void main(String[] args) {
    Member user1 = new Member("홍길동", "hong");
    Member user2 = new Member("강자바", "java");
    
    System.out.println("user1의 name은? "+ user1.name);
    System.out.println("user1의 id는? "+ user1.id);
    System.out.println("user2의 name은? "+ user2.name);
    System.out.println("user2의 id는? "+ user2.id);
    
  }
}
