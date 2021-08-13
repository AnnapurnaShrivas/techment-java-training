package com.techment.encapsulation;


	class Employee3
	{
		private int id;
		private String name;
		
		public int getId()
		{
			return id;
		}
		public void setId(int id)
		{
			this.id= id;
		}
		

		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name= name;
		}
		
		
	}

	public class SetterMethod
	{
			
          public static void main(String[] args) {
        	  
        	  Employee3 emp= new Employee3();
        	  emp.setId(1);
        	  emp.setName("Annapurna");
        	  
        	  System.out.println(emp.getId());
        	  System.out.println(emp.getName());
	}

}
