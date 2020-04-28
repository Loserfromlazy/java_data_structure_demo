package ch4;

public class TestLinkList {
	public static void main(String[] args) {
		/*LinkList linkList =new LinkList();
		linkList.insertFirst(34);
		linkList.insertFirst(23);
		linkList.insertFirst(46);
		linkList.display();
		Node node = linkList.find(23);
		node.display();
		boolean delete = linkList.delete(76);
		System.out.println(delete);
		linkList.display();*/
		/*FirstLastLinkList list =new FirstLastLinkList();
		list.insertFirst(12);
		list.insertFirst(15);
		list.insertFirst(38);
		list.display();
		list.deleteFirst();
		list.deleteFirst();
		list.display();
		
		list.insertLast(12);
		list.insertLast(15);
		list.insertLast(38);
		list.display();*/
		
		DoubleLinkList list=new DoubleLinkList();
		list.insertLast(15);
		list.insertLast(23);
		list.insertLast(34);
		list.display();

		
		while(!list.isEmpty()) {
			list.deleteFirst();
			list.display();
		}
		
		
	}
}
