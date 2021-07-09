package Null_Object_01;

public class NullObjectDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------***---------");
		System.out.println("DataBase");
		AbstractEmployee employee1 = EmployeeData.getEmployee("Pranta");
		System.out.println("[ Null Status:"+employee1.isNull()+", NameData: "+employee1.getName()+" ]");
		
		System.out.println();

	}

}
