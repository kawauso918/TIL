package javaWcp;
public class Fool extends Character implements Human{
	public void attack (Matango m) {
		System.out.println(this.name+ "戦わず遊んでいる");
	}
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {}
}
