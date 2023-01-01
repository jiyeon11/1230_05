package vendingmachine;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		ProductVO productVO = null;
		ArrayList<ProductVO> pvoList = dao.select();
		String[] name = {"코카콜라","펩시콜라","밀키스","레쓰비","비락식혜","스프라이트"};
		int[] price = {1000,1000,1100,800,1500,1000};
		//셋팅
		for(int i = 0; i<name.length; i++) {
			productVO = new ProductVO();
			productVO.setTrade_name(name[i]);
			productVO.setPrice(price[i]);
			productVO.setTotal_stock(10);
			productVO.setNum(i);
			pvoList.add(productVO);
		}
		
		//화면 출력
		ProductView prodcutView = new ProductView();
		prodcutView.displayProduct(pvoList);
		prodcutView.setProductList(pvoList);
		prodcutView.console();
		
		int select;
		do {
			System.out.print("\n더 구입하시겠습니까?(1번 네 | 2번 아니오) >>");
			select = scan.nextInt();
			if(select ==1) {
				prodcutView.displayProduct(pvoList);
				prodcutView.setProductList(pvoList);
				prodcutView.console();
			}else {
				System.out.println("안녕히가세요");
				break;
			}
		}while(select == 1);
	}
}
