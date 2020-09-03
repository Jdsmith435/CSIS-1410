package docComments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gives user a menu in which they can handle data about phone products.
 * @author Mike Awada
 *
 */

public class PhoneApp {

	/**
	 * Main Method constructs ArrayList and adds four phones using the add method. A menu prompt is called
	 * 			followed by a switch that recieves the user's decisision. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int selection;
	    Scanner input1 = new Scanner(System.in); //Creating an object of class Scanner
	    ArrayList<Phone> phones = new ArrayList<Phone>();
	    phones.add(new Phone("iphone", "ios", 3.00));
	    phones.add(new Phone("Samsung", "android", 2.00));
	    phones.add(new Phone("LG", "android", 4.50));
	    phones.add(new Phone("Morotrola","android", 5.00));
	    
	    do {
	          menuPrompt(); //This will prompt the user to choose
	          selection = input1.nextInt();//the selection will be saved in the selection variable
      
	          switch (selection){
	          	case 1:
	        	   displayPhones(phones);
		           break;
	          	case 2:
	        	   Phone phone1 = addPhone();
	        	   phones.add(phone1);
	        	   break;
	            case 3:
        		   int phone2 = findPhone(phones); 
        		   if (phone2 >= 0)
	            	   System.out.println(phones.get(phone2));
	               else 
	            	   System.out.println("Wrong ID");
	               break;
	            case 4:
	               int phone3 = deletePhone(phones);
	               
	               if (phone3 >= 0) {
	            	   System.out.println(" Phone " + phones.get(phone3) + " has been deleted");
	            	   phones.remove(phone3);	               	   
	               }
	               else 
	            	   System.out.println("Wrong ID");
	               break;
	            case 5:
	            	System.out.printf("Number of phones: %d%n", phones.size());//count of phones
	            	break;
	            case 6:
	            	System.out.printf("Good Bye!!!");
	            	break;	            	
	            default:         
	               System.out.println("Invalid Input");
	               break; 
	           }   
	           
	       } while (selection != 6);

	    	input1.close();
	}
	
	/**
	 * Displays menu of 6 items to user
	 */
	private static void menuPrompt() {
		System.out.println("1 .. Show all phones");
		System.out.println("2 .. Add a phone");
		System.out.println("3 .. Find a phone");
		System.out.println("4 .. Delete a phone");
		System.out.println("5 .. Number of phones");
		System.out.println("6 .. exit");
		System.out.print("Your choice: ");
	}
	
	/**
	 * Displays all static fields of Phone class objects in the ArrayList phones
	 * 
	 * @param phones
	 */
	private static void displayPhones(ArrayList<Phone> phones) {
        System.out.println("List of phones: "); //List the phones
        for (Phone el:phones)
     	   System.out.println(el);
	}
	
	/**
	 * @return Phone object phone to switch 2 to be added to ArrayList phones
	 */
	private static Phone addPhone() {

		Scanner input2 = new Scanner(System.in);
        System.out.print("Make: "); //Add
        String makeOfPhone = input2.nextLine();	
        System.out.print("Operating System: "); //Add
        String osOfPhone = input2.nextLine();
        System.out.print("Battery Life: "); //Add
        int batteryOfPhone = input2.nextInt();     
        Phone phone = new Phone(makeOfPhone,osOfPhone, batteryOfPhone);
        return phone; 
	}
	
	/**
	 * Displays fields of this phone object when user enters ID
	 * 
	 * @param phones
	 * @return variable that returns the index of the phone in Arraylist phones selected by user
	 */
	private static int findPhone(ArrayList<Phone> phones) {
        Scanner input3 = new Scanner(System.in);
        System.out.println("What is the ID of the phone to find from the following list: "); //find
        for (Phone el:phones)
     	   System.out.println(el.getIdNumber());
        String idPhone1 = input3.nextLine();
        int fin = -2;
        for (Phone el:phones)
     	   if (el.getIdNumber().equals(idPhone1))
     		   fin = phones.indexOf(el);
		   return fin;
	}
	
	/**
	 * Removes a phone object from ArrayList phones
	 * 
	 * @param phones
	 * @return index of phone object to be removed 
	 */
	private static int deletePhone(ArrayList<Phone> phones) {
        Scanner input4 = new Scanner(System.in);
        System.out.printf("What is the ID of the phone to delete from the following list:%n"); //delete
        for (Phone el:phones)
      	   System.out.println(el.getIdNumber());
        String idPhone2 = input4.nextLine();
        int del = -2;
        for (Phone el:phones)
     	   if (el.getIdNumber().equals(idPhone2)){
     		  del = phones.indexOf(el);  
      	   }
        return del;
	}

}
