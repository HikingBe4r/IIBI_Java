/*	Obj: 
	
*/

//import, Package

public class CarTest1{

	public static void main(String[] args) {
		
		Car obj = new Car();

		obj.name = "K5";
		obj.company = "KIA";
		obj.kind = "����";
		obj.color = "black";

		Car obj2 = new Car();

		obj2.name = "SM5";
		obj2.company = "Samsung";
		obj2.kind = "����";
		obj2.color = "white";


		System.out.printf("obj.name: %s\n", obj.name);
		System.out.printf("obj.company: %s\n", obj.company);
		System.out.printf("obj.kind: %s\n", obj.kind);
		System.out.printf("obj.color: %s\n", obj.color);
		
		System.out.println();

		System.out.printf("obj2.name: %s\n", obj2.name);
		System.out.printf("obj2.company: %s\n", obj2.company);
		System.out.printf("obj2.kind: %s\n", obj2.kind);
		System.out.printf("obj2.color: %s\n", obj2.color);


	}
}
