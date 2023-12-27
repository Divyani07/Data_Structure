import java.time.LocalDate;

public class Node {
	//private int data;
	private int id;
	private String bName;
	private String aName;
	private double price;
	private LocalDate rdate;
	private Node next;
	
	/*
	 * public Node(int data){
	 * this.data = data;
	 * this.next=null;
	 * } 
	 */
	public Node(int id, String bName, String aName, double price, String rdate) {
		super();
		this.id = id;
		this.bName = bName;
		this.aName = aName;
		this.price = price;
		this.rdate = LocalDate.parse(rdate);
		this.next=null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getRdate() {
		return rdate;
	}

	public void setRdate(LocalDate rdate) {
		this.rdate = rdate;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
