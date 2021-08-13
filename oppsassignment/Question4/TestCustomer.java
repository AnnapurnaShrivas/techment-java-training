package com.techment.oppsassignment.Question4;

import com.techment.oppsassignment.Question4.Address;
import com.techment.oppsassignment.Question4.Customer;

//Aggregation And Encapsulation....QUESTION NO-4

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
	 



		class Customer {

			private String customerName;
			private Address residentialAddress;
			Address oficialAddress;

			public Customer(Address oficialAddress, String customerName, Address residentialAddress) {
				super();
				this.oficialAddress = oficialAddress;
				this.customerName = customerName;
				this.residentialAddress = residentialAddress;
			}

			public Address getOficialAddress() {
				return oficialAddress;
			}

			public void setOficialAddress(Address oficialAddress) {
				this.oficialAddress = oficialAddress;
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

			public String getCustomerDetails() {
				String CustomerDetails = "Customer : " + getCustomerName() + "\nResidencial Address : "
						+ residentialAddress
								.getAddressLine()+","+residentialAddress.getCity()
				+"\nOfficial Address : "+oficialAddress.getAddressLine()+","+oficialAddress.getCity();
						return(CustomerDetails);

			}

		}
	
	
	class TestCustomer
	
	
	{
		
		public static void main(String[] args) {
		Address address = new Address("1st main HSR layout","Bangolore");
			
		Address officialAddress = new Address("1st main Electronics layout", "pune");
		
		
		
		Customer customer=new Customer(officialAddress, "John", address);
		customer.setCustomerName("john");
		System.out.println(customer.getCustomerDetails());
	}
	}