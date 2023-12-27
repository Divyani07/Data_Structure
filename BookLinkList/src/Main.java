import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("select one 1.insert 2.display 3.delete 4.insertAtFirst "
					+ "5.deleteFromFirst 6.insertByPos 7.deleteByPos 0.exit");
			switch(choice=sc.nextInt()) {
			case 1:l1.insert(1, "athj", "vhj", 563, "2023-12-20");
					System.out.println("no. of count:"+l1.getCount());
					break;
			case 2:l1.display();
					break;
			case 3:l1.delete();
					System.out.println("no. of count:"+l1.getCount());
					break;
			case 4:l1.insertAtFirst(5, "uol", "dt", 553, "2020-12-20");
					System.out.println("no. of count:"+l1.getCount());
					break;
			case 5:l1.deleteFromFirst();
					System.out.println("no. of count:"+l1.getCount());
					break;
			case 6:l1.insertByPos(5, "hyu", "dto", 892, "2020-12-23", 2);
					System.out.println("no. of count:"+l1.getCount());
					break;
			case 7:l1.deleteByPos(2);
					System.out.println("no. of count:"+l1.getCount());
					break;
			 default:
					System.out.println("Invalid choice");
					break;
			}
			
		}while(choice!=0);
		
//		l1.insert(1, "athj", "vhj", 563, "2023-12-20");
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		l1.insert(2,"atc" ,"ddey", 865, "2023-02-20");
//		l1.insert(3,"agud" ,"ddii", 564, "2023-12-20");
//		l1.insert(4,"rtyd" ,"bkg", 256, "2022-02-20");
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		l1.delete();
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		l1.insertAtFirst(5, "uol", "dt", 553, "2020-12-20");
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		l1.deleteFromFirst();
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		l1.insertByPos(5, "hyu", "dto", 892, "2020-12-23", 2);
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		l1.deleteByPos(2);
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		l1.deleteByPos(3);
//		l1.display();
//		System.out.println("no. of count:"+l1.getCount());
//		System.out.println();
//		
//		
//
	}
	
	
}
