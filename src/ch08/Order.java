package ch08;

public class Order {

	public String oderNumber;
	public String phonNumber;
	public String oderAdress;
	public String oderDate;
	public String oderTime;
	public int price;
	public String menuNumber;
	
	public void showOrderDetail() {

		System.out.println("�ֹ� ���� ��ȣ: " + oderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + phonNumber);
		System.out.println("�ֹ� �� �ּ�: " + oderAdress);
		System.out.println("�ֹ� ��¥: " + oderDate);
		System.out.println("�ֹ� �ð�: " + oderTime);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuNumber);
	}
	
}
