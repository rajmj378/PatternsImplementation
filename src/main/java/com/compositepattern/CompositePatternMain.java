package com.compositepattern;

public class CompositePatternMain {

	public static void main(String[] args) {
		Employee CEO=new Employee("ABINASH", "CEO", 100000.00);
		
		Employee headSales=new Employee("asdsdaf", "Head Sales", 50000.00);
		Employee headManager=new Employee("asdsdfasd", "Head Manager", 55000.00);
		
		Employee sales1=new Employee("asdasd", "Sales", 20000.00);
		Employee sales2=new Employee("nghjghj", "Sales", 21000.00);
		
		Employee marketting1=new Employee("lpsdfo", "Marketting", 25000.00);
		Employee marketting2=new Employee("iuoyiuty", "Marketting", 25000.00);
		
		headSales.add(sales1);
		headSales.add(sales2);
		
		headManager.add(marketting1);
		headManager.add(marketting2);
		
		CEO.add(headSales);
		CEO.add(headManager);
		System.out.println(CEO.toString());
		System.out.println("-------------------------------------------------------");
		
		for(Employee head: CEO.getSubOrdinates())
		{
			System.out.println(head.toString());
			for(Employee e:head.getSubOrdinates())
			{
				System.out.println(e.toString());
			}			
			System.out.println("-------------------------------------------------------");
			
		}

	}

}
