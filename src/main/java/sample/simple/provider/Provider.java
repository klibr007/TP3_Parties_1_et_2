package sample.simple.provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider{

	@Override
	public int getPrice(String article) {
		System.out.println("this "+article +" is over your wallet 200 euros !");
		return 200;
	}

	@Override
	public void order(String article) {
		System.out.println("Ordering what your "+ article+" article");
		
	}

}
