package sample.simple.bank;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank{

	@Override
	public void transfert(int money) {
		System.out.println("Transfering "+ money +" euros");
		
	}

}
