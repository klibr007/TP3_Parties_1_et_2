package sample.simple.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.bank.IBank;
import sample.simple.provider.IProvider;


@Component
public class Store implements IJustHaveALook, ILane, IFastLane{
	
	@Autowired
	IBank bank;
	@Autowired
	IProvider provider;
	
	
	@Override
	public void oneShotOrder(String article) {
		System.out.println("A one shot order of "+ article );
		
	}
	@Override
	public void addItemToCart(String article) {
		System.out.println("Adding this " + article + " to our cart");
		
	}
	@Override
	public void pay(int money) {
		System.out.println("Paying " + money);
		bank.transfert(money);
		
	}
	@Override
	public int getPrice(String article) {
		System.out.println("this is expensive the price is 50 euros!");
		return 50;
	}
	@Override
	public boolean isAvailable(String article) {
		System.out.println("Ther is still some " + article +" available");
		return true;
	}

}
