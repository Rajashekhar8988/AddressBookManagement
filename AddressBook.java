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
			System.out.println("Hey... Welcome to AddressBook");
			Scanner sc=new Scanner(System.in);
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
				Iterator<ContactDetails> iterate=contact.iterator();
				while(iterate.hasNext()) {
					ContactDetails c=iterate.next();
					System.out.println("Contact details available in address book : ");
				}
		}
	}
