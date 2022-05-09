package javaWcp;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name+"攻撃");
		System.out.println("ダメージを与えた");
	}
	public Hero(String name) {
		this.hp =100;
		this.name = name;
	}
}

