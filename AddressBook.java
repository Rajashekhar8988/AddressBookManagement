package bridgeLabz.AddressBookManagement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class ContactDetails {
		  
		//Creating properties of personDetails class
		
		private String firstName;
		private String lastName;
		private String address;
		private String emailId;
		private String state;
		private String phoneNumber;
		private String zipCode;
		
		ContactDetails(String firstName, String lastName, String address, String emailId, String state,
				String phoneNumber, String zipCode) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.emailId = emailId;
			this.state = state;
			this.phoneNumber = phoneNumber;
			this.zipCode = zipCode;
		}
		//getter and setter method to access the private properties
			public void setFirstName(String firstName){
		        this.firstName = firstName;
		    }
		    public String getFirstName(){
		        return firstName;
		    }

		    public void setLastName(String lastName){
		        this.lastName = lastName;
		    }
		    public String getLastName(){
		        return lastName;
		    }

		    public void setAddress(String address){
		        this.address = address;
		    }
		    public String getAddress(){
		        return address;
		        
		    }public void setemailId(String emailId){
		        this.emailId = emailId;
		    }
		    public String getemailId(){
		        return emailId;
		    }
		    
		    public void setstate(String state){
		        this.state = state;
		    }
		    public String getstate(){
		        return state;
		    }
		    
		    public void setPhoneNumber(String phoneNumber){
		        this.phoneNumber = phoneNumber;
		    }
		    public String getPhoneNumber(){
		        return phoneNumber;
		    }

		    public void setzipCode(String zipCode){
		        this.zipCode = zipCode;
		    }
		    public String getzipCode(){
		        return zipCode;
		    }
		    
		    public String toString() {
		    	return firstName+" "+lastName+" "+address+" "+emailId+" "+state+" "+phoneNumber+" "+zipCode;
		    }
}
class AddressBook {
	public static void main(String[] args) {
		LinkedList<ContactDetails> contact=new LinkedList<ContactDetails>();
		Scanner sc=new Scanner(System.in);
		int option;
		do {
			System.out.println("1.AddContact");
			System.out.println("2.Display");
			System.out.println("3.EditContact");
			System.out.println("4.DelectContact");
			System.out.println("Enter your choice");
			option=sc.nextInt();
			switch(option) {
			//add new contact details into the Address book
			case 1:
				System.out.println("Enter first name : ");
				String firstName=sc.next();
				System.out.println("Enter second name : ");
				String secondName=sc.next();
				System.out.println("Enter address name : ");
				String address=sc.next();
				System.out.println("Enter emailId name : ");
				String emailId=sc.next();
				System.out.println("Enter state name : ");
				String state=sc.next();
				System.out.println("Enter phoneNumber name : ");
				String phoneNumber=sc.next();
				System.out.println("Enter zipCode name : ");
				String zipCode=sc.next();
				
			contact.add(new ContactDetails(firstName,secondName,address,emailId,state,phoneNumber,zipCode));
			break;
			//display the contact details present in address book
			case 2:
				System.out.println("-------------------------------------------");
				Iterator<ContactDetails> iterate=contact.iterator();
				if(iterate.hasNext()) {
					ContactDetails c=iterate.next();
					System.out.println(c);
				}
				else {
					System.out.println("There is no details, please add data contact details");
				}
				System.out.println("-------------------------------------------");
			break;
			//edit the contact details in the address book
			case 3:
				System.out.println("Enter the name to edit contact details");
				String firstName1=sc.next();
				System.out.println("-------------------------------------------");
				iterate=contact.iterator();
				if(iterate.hasNext()) {
					ContactDetails c1=iterate.next();
					if(c1.getFirstName().equals(firstName1)){
					c1.setPhoneNumber("987654321");
					System.out.println(c1);
				    }
					else {
						System.out.println("OOPS!.. your details are not matching");
					}
				}
				System.out.println("-------------------------------------------");
			break;	
			// delete the contact details from the address book
			case 4:
				System.out.println("Enter the name to delete contact details");
				firstName1=sc.next();
				System.out.println("-------------------------------------------");
				iterate=contact.iterator();
				if(iterate.hasNext()) {
					ContactDetails c2=iterate.next();
					if(c2.getFirstName().equals(firstName1)) {
						iterate.remove();	
					System.out.println("contact deleted successfully");
					}
					else {
						System.out.println("OOPS!.. please enter valid details");
					}
				}
				System.out.println("-------------------------------------------");
			break;
			}
		}while(option!=0);
	}
}