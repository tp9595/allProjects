package org.testNG1;

import org.testng.annotations.Test;
//It gives priority to execute the method and not to print result
public class TestNgWithPriority {
  @Test (priority=2)
  public void login() {
	  System.out.println("After  priority//2");
	  System.out.println("small login//2");
  }
  @Test(priority=1)
  public void Login() {
	  System.out.println("Capital LOGIN//1");
  }
  
  @Test(priority=3)
  public void delete() {
	  System.out.println("small delete//3");
  }
  @Test(priority=4)
  public void Delete() {
	  System.out.println("Capital DELETE//4");
  }
  
  @Test(priority=5)
  public void Update() {
	  System.out.println("Capital UPDATE//5");
  }
  @Test(priority=6)
  public void update() {
	  System.out.println("small update//6");
  }
  @Test(priority=7)
  public void cpanti() {
	  System.out.println("small update//7");
  }
  
 
}

