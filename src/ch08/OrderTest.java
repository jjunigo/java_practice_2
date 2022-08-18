package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order myOrder = new Order();
		myOrder.oderNumber = "202011020003";
		myOrder.phonNumber = "01023450001";
		myOrder.oderAdress = "서울시 강남구 역삼동 111-333";
		myOrder.oderDate = "20201102";
		myOrder.oderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuNumber = "0003";
		
		
		myOrder.showOrderDetail();
				
	}

}
