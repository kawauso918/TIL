package javaWcp;

public class Hero {
	String name;
	int hp;
	
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name +"眠って回復");
		//フィールド
	}
}

