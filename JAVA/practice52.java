package javaWcp;

public class Hero {
	String name ="ミナト";
	int hp;
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "転んだ");
		System.out.println("5のダメージ");
	}
	public void attack(Matango m) {
		System.out.println(this.name+"攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	public void run() {
		System.out.println(this.name + "逃げ出した");
	}
}

