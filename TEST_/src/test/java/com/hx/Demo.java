package com.hx;

public class Demo {
     private String username;
     private String password;
     
     public static void main(String[] args) {
      System.out.println("这只是个为了测试git仓库的demo");
    }
    
    public String getUsername() {
      return username;
    }
    public void setUsername(String username) {
      this.username = username;
    }
    public String getPassword() {
      return password;
    }
    public void setPassword(String password) {
      this.password = password;
    }
    public Demo(String username, String password) {
      super();
      this.username = username;
      this.password = password;
    }
     
     
}
