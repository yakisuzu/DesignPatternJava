package ex.framework;

public interface IProduct extends Cloneable{
	public String use(String s);
	public IProduct createClone();
}