package javaWcp;


public class Hero {
	int hp;
	String name;
	Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	public void die() {
		System.out.println(this.name+"死んでしまった");
		System.out.println("GAME OVER");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name+"攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}
}

