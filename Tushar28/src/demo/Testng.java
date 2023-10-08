package demo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng {
    @Ignore
   @Test (priority =1)
   void cmethod()
   {
	 System.out.println("cest method");
   }
  @Test  ()
   void alphamethod()
   {
	 System.out.println("alpha method");
	 Assert.assertEquals("alpha method", "alpha method");
	 Assert.assertTrue(true);
   }
  @Test (priority =1)
   void Betamethod()
   {
	 System.out.println("Beta method");
   }
  @Test(priority =1)
   void gamamethod()
   {
	 System.out.println("gama method");
   }

  @BeforeTest
  void tusharmethod()
  {
	  System.out.println(" one method");
  }

  @AfterTest
  void akshaymethod()
  {
	  System.out.println(" two method");
  }

}

