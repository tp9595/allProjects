package org.testNG1;

import org.testng.annotations.Test;


public class TestNGWithoutPriority {

	
	  @Test
	  public void login() {
		  System.out.println("Before priority//5");
		  System.out.println("small login//5");
	  }
	  @Test
	  public void Login() {
		  System.out.println("Capital LOGIN//2");
	  }
	  
	  @Test
	  public void delete() {
		  System.out.println("small delete//4");
	  }
	  @Test
	  public void Delete() {
		  System.out.println("Capital DELETE//1");
	  }
	  
	  @Test
	  public void Update() {
		  System.out.println("Capital UPDATE//3");
	  }
	  @Test
	  public void update() {
		  System.out.println("small update//6");
	  }
}
