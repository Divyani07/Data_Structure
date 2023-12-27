import java.time.LocalDate;

public class LinkedList {
	private Node head;
	private static int count;
	static {
		count=0;
	}
	public static int getCount() {
		return count;
	}

	public boolean insert(int id, String bName, String aName, double price, String rdate) {
		Node newNode=new Node(id,  bName,  aName,  price,  rdate);
		if(newNode==null)
			return false;
		
		if(head==null) {
			head=newNode;
			count++;
			return true;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(newNode);
		count++;
		return true;			
	}
	
	public boolean display() {
		if(head==null)
			return false;
		
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getId()+" "+temp.getbName()+" "+
					temp.getaName()+temp.getPrice()+" "+temp.getRdate());
			temp=temp.getNext();
		}
		return true;
	}
	
	public boolean delete() {
		if(head==null)
			return false;
		
		Node temp=head;
		Node deletable = temp.getNext();
		while(deletable.getNext()!=null) {
			temp=deletable;
			deletable=temp.getNext();
		}
		temp.setNext(null);
		count--;
		return true;
			
	}
	
	public boolean insertAtFirst(int id, String bName, String aName, double price, String rdate) {
		Node newNode=new Node(id,  bName,  aName,  price,  rdate);
		if(newNode==null)
			return false;
		
		if(head==null) {
			head=newNode;
			count++;
			return true;
		}
		newNode.setNext(head);
		head=newNode;
		return true;			
	
	}
	
	public boolean deleteFromFirst() {
		if(head==null)
			return false;
		
		Node deletable=head;
		head=deletable.getNext();
		count--;
		return true;
	}
	
	public boolean insertByPos(int id, String bName, String aName, double price, String rdate,int pos) {
		Node newNode=new Node(id,  bName,  aName,  price,  rdate);
		if(newNode==null)
			return false;
		
		if(head==null) {
			head=newNode;
			count++;
			return true;
		}
		
		Node temp=head;
		for(int i=1; i<pos-1; i++) {
			temp=temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		count++;
		return true;			
	}
	
	public boolean deleteByPos(int pos) {
		if(head==null)
			return false;
		
		Node temp=head;
		Node deletable = temp.getNext();
		for(int i=1;i<pos-1;i++) {
			temp=deletable;
			deletable=temp.getNext();
		}
		temp.setNext(deletable.getNext());
		count--;
		return true;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private Node head;
//	private static int count;
//	
//	static {
//		count=0;
//	}
//
//	public Node getHead() {
//		return head;
//	}
//
//	public void setHead(Node head) {
//		this.head = head;
//	}
//	
//	public LinkedList() {
//		this.head=null;
//	}
//
//	public boolean insert(int id, String bName, String aName, double price, String rdate) {
//		Node newNode = new Node( id, bName, aName, price, rdate);
//		if(newNode == null) {
//			return false;
//		}
//		if(head == null) {
//			head=newNode;
//			count++;
//			return true;
//		}
//		
//		Node temp = head;
//		while(temp.getNext()!=null) {
//			temp=temp.getNext();
//		}
//		temp.setNext(newNode);
//		count++;
//		return true;
//		
//	}
//	
//	public boolean display() {
//		if(head==null) {
//			return false;
//		}
//		
//		Node last=head;
//		while(last!=null){
//		System.out.println(last.getId()+" "+last.getbName()+" "+last.getaName()+" "
//		+last.getPrice()+" "+last.getRdate()+"\n");
//		last=last.getNext();
//		}
//		return true;
//	}
//	
//	
	
}

	

