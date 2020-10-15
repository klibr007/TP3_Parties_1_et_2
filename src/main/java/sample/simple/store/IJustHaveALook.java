package sample.simple.store;

public interface IJustHaveALook extends IStore{

	public int getPrice(String article);
	public boolean isAvailable(String article);
}
