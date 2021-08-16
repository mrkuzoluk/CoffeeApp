package Entities;



import Abstract.IEntity;

         public class Customer implements IEntity {
	
         int id;
         String FirstName;
         String LastName;
         int DateOfBirth;
         String	 NationalityId;
		public int getDateOfBirth;
         
         public Customer() {
        	 
         }
         
         
		 public Customer(int id, String firstName, String lastName, int DateOfBirth, String NationalityId) {
			super();
			this.id = id;
			this.FirstName = firstName;
			this.LastName = lastName;
			this.DateOfBirth = DateOfBirth;
			this.NationalityId =NationalityId ;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return FirstName;
		}


		public void setFirstName(String firstName) {
			FirstName = firstName;
		}


		public String getLastName() {
			return LastName;
		}


		public void setLastName(String lastName) {
			LastName = lastName;
		}


		public int getDateOfBirth() {
			return DateOfBirth;
		}


		public void setDateOfBirth(int dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}


		public String getNationalityId() {
			return NationalityId;
		}


		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}
         
         
         
         
	

}
