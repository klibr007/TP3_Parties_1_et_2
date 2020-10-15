package sample.simple.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;


@Component
public class Client implements IRun, IClient{
	
	@Autowired
	IFastLane ifast;
	@Autowired
	ILane ilane;
	@Autowired
	IJustHaveALook look;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		look.isAvailable("Dress");
		look.getPrice("Dress");
		ifast.oneShotOrder("Dress");
		ilane.addItemToCart("ps4");
		ilane.pay(200);
		
	}

}
