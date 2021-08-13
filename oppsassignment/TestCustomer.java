package com.techment.oppsassignment;


//Aggregation And Encapsulation....QUESTION NO-1

	 class Address {
		
		private String addressLine;
		private String city;
	
		
	 
	 public String getAddressLine() {
			return addressLine;
		}

		public Address(String addressLine, String city) {
			super();
			this.addressLine = addressLine;
			this.city = city;
		}

		public void setAddressLine(String addressLine) {
			this.addressLine = addressLine;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	 }
	 



	class Customer
	 {
		
		
		Customer()
		{
			
		}
		 private String customerName;
		 Address residentialAddress;
		public Customer(String customerName, Address residentialAddress) {
			super();
			this.customerName = customerName;
			this.residentialAddress = residentialAddress;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Address getResidentialAddress() {
			return residentialAddress;
		}
		public void setResidentialAddress(Address residentialAddress) {
			this.residentialAddress = residentialAddress;
		}
		
		
		void getCustomerDetails()
		{
			System.out.println("Customer name = "+customerName);
			System.out.println("Resident Address = "+residentialAddress.getAddressLine());
		}
		 
	 }
	
	
	class TestCustomer
	
	
	{
		
		public static void main(String[] args) {
		Address address = new Address("1st main HSR layout","Bangolore");
			
		
		
		
		
		Customer customer=new Customer("Annapurna", address);
		Customer customer2 =new Customer();
		customer.setCustomerName("john");
		customer.getCustomerDetails();
	}
	}



