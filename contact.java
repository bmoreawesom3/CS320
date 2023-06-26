public class contact {

		private String ID;
		private String firstName;
		private String lastName;
		private String phone;
		private String address;
		
		public contact(String ID, String firstName, String lastName, String phone, String address) {
			if(ID == null || ID.length()>10) {
				throw new IllegalArgumentException("Invald ID");
			}
			if(firstName == null || firstName.length()>10) {
				throw new IllegalArgumentException("Invald First Name");
			}
			if(lastName == null || lastName.length()>10) {
				throw new IllegalArgumentException("Invald Last Name");
			}
			if(phone == null || phone.length()>10) {
				throw new IllegalArgumentException("Invald Phone Number");
			}
			if(address == null || address.length()>30) {
				throw new IllegalArgumentException("Invald Address");
			}
			
			this.ID = ID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
		}
		
		public String getID() {
			return ID;
		}
		
		public String getfirstName() {
			return firstName;
		}
		
		public String getlastName() {
			return lastName;
		}
		
		public String getphone() {
			return phone;
		}
		
		public String getaddress() {
			return address;
		}
}
