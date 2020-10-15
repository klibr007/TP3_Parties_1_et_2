package sample.simple.store;

public interface ILane extends IStore{

	public void addItemToCart(String article);
	public void pay(int money);
}
