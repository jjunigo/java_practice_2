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

		System.out.println("주문 접수 번호: " + oderNumber);
		System.out.println("주문 핸드폰 번호: " + phonNumber);
		System.out.println("주문 집 주소: " + oderAdress);
		System.out.println("주문 날짜: " + oderDate);
		System.out.println("주문 시간: " + oderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNumber);
	}
	
}
