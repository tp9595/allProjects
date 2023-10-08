package variables;
//switch case expression based means choice based
//after choice is done we dont want to excute the other case
//it user put wrong choice we need tell the user the same
//for all above things we used switch case
public class switchcase {  
public static void main(String[] args) {  
int choice = 2;  
switch (choice){  
case 0:  
System.out.println("number is 0");  
break;  //after executing the code,it will stop the switch case excution
case 2: 
System.out.println("number is 1");  
break;  
default:  
	
System.out.println("you have enter wrong choice");  
}  
}  
}  