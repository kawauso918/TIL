package javaWcp;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "情熱的に踊る");
	}
	public void attack (Matango m) {
		System.out.println(this.name + "攻撃");
		System.out.println("敵に３ポイントダメージ");
		m.hp -= 3;
	}

}
