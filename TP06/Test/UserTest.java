package TP06.Test;

public class UserTest {
      public static void main(String[] args) {
            System.out.println("user_count = "+User.user_count);
            User u1 = new User("Dara");
            System.out.println("user_count = "+User.user_count);
            User u2 = new User("Dara");
            System.out.println("user_count = "+User.user_count);
            User u3 = new User("Dara");
      }
}
