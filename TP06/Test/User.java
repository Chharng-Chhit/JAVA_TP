package TP06.Test;

public class User {
      static int user_count = 0;
      String username;
      public User(String username){
            this.username = username;
            user_count++;
      }
}

