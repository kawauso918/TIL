package javaWcp;


public class Hero extends Character{
	
	public void attack(Monster m) {
		System.out.println(this.name+"攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}
}
