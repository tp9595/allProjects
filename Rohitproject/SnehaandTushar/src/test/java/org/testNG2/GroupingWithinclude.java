package org.testNG2;

import org.testng.annotations.Test;

public class GroupingWithinclude {
  @Test (groups = {"Smoke","Regression","UAT"})
  public void login (){
	  System.out.println("Hum Login Krenge");
  }
  @Test(groups = {"Smoke"})
  public void logout() {
	  System.out.println("Hum Logout Krenge");
  }
  @Test(groups = {"Smoke","Regression"})
  public void dashBoard() {
	  System.out.println("Hum dashBoard verify krenge");
}
  @Test  (groups = {"UAT"})
  public void createCustome() {
	  System.out.println("Hum cusromer create krenge");
}
  @Test 
  public void createUser() {
	  System.out.println("Hum Users create krenge");
}
  @Test
  public void goodNight() {
	  System.out.println("Good night Tata Bye Bye");
  }  
}

