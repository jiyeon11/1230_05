package vendingmachine;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
	ArrayList<ProductVO> productList;
	
	public void displayProduct(ArrayList produstList) {
		this.productList = produstList;
		System.out.println("==================자판기====================");
		for(ProductVO pvo : productList) {
			System.out.println((pvo.getNum()+1)+". "+pvo.getTrade_name()+" "+ pvo.getPrice() + "원");
		}
	}
	public void console() {
		Scanner scan = new Scanner(System.in);
		ProductVO pvo = new ProductVO();
		int select;
		int money;
		do {
			System.out.print("번호 입력 >>");
			select = scan.nextInt();
			pvo = productList.get(select-1);
			if(pvo.getTotal_stock() == 0){
				System.out.println("\n선택하신 제품은 현재 재고가 없습니다.");
			}else {
				pvo.setTotal_stock(pvo.getTotal_stock()-1);//재고 차감
				break;
			}
		}while(true);
		
		do {
			System.out.print("돈을 넣어주세요 >>");
			money = scan.nextInt();
			if(money < pvo.getPrice()) {
				System.out.println("\n돈이 부족합니다. 다시 넣어주세요\n");
			}else if(money == pvo.getPrice()) {
				System.out.println("\n" + pvo.getTrade_name() + "가 나옵니다. 덜커덩"); break;
			}else if(money> pvo.getPrice()){//반환금액 출력
				System.out.println("\n" + pvo.getTrade_name()+ "가 나옵니다. 덜커덩");
				System.out.println("반환금액 : " + (money-pvo.getPrice()));
				break;
			}
		}while(true);
	}//console()
	
	public void setProductList(ArrayList<ProductVO> productList) {
		this.productList = productList;
	}
}
