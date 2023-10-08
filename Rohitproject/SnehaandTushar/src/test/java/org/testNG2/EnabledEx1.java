package org.testNG2;

import org.testng.annotations.Test;

public class EnabledEx1 {
  @Test (priority=1,enabled=true)
  public void login (){
	  System.out.println("Hum Login Krenge");
  }
  @Test(priority=2,enabled=false)
  public void logout() {
	  System.out.println("Hum Logout Krenge");
  }
  @Test(priority=3,enabled=true)
  public void dashBoard() {
	  System.out.println("Hum dashBoard verify krenge");
}
  @Test  (groups = {"UAT"})
  public void createCustome() {
	  System.out.println("Hum cusromer create krenge");
}
  @Test ()
  public void createUser() {
	  System.out.println("Hum Users create krenge");
}
  @Test(priority=0,invocationCount=5,enabled=true)
  public void goodNight() {
	  System.out.println("Good night Tata Bye Bye");
  }  
}

