package comperatordemo;
import java.util.*;


public class ComperatorDemo {

		public static void main(String[] args) {
			Employee e1 = new Employee(22000, "john");
			Employee e2 = new Employee(12000, "robert");
			Employee e3 = new Employee(21000, "marry");
			Employee e4 = new Employee(15000, "bob");
			ArrayList<Employee> list = new ArrayList<>();
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
	/*
			// sort by salary
			Collections.sort(list, new IdComparator());
			Iterator it1= list.iterator();
			while (it1.hasNext())
			System.out.println(it1.next());
			System.out.println("-----------sort by name---------");
			// sort by NAME
			Collections.sort(list, new NameComparator());
			it1 = list.iterator();
			while (it1.hasNext())
			System.out.println(it1.next());
		*/
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		num=sc.nextInt();
		
		switch(num) {
	
		case 1:
			Collections.sort(list, new IdComparator());
			Iterator it2 = list.iterator();
			while (it2.hasNext())
			System.out.println(it2.next());
			break;
		case 2:
			Collections.sort(list, new NameComparator());
			Iterator it3= list.iterator();
			while (it3.hasNext())
			System.out.println(it3.next());
			break;
		default:
			System.out.println("Invalid");
			
			
		}

		}

	}

