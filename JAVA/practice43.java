package javaWcp;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name+"攻撃");
		System.out.println("ダメージを与えた");
	}
	public Hero() {
		this.hp =100;
	}
}

