package javaWcp;

public class Hero {
	String name;
	int hp;
	public void sleep() {
		this.hp = 100;
	System.out.println(this.name +"眠って回復");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name +"は、"+ "秒座った");
		System.out.println("HP"+ sec+ "ポイント回復");
		
	}
}
