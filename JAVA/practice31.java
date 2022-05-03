package javaWcp;

public class Hero {
	String name;
	int hp;
	 public final void slip() {
		 this.hp -= 5;
		 System.out.println(this.name + "転んだ");
		 System.out.println("5のダメージ");
	 }
	 public void run() {
		 System.out.println(this.name + "逃げ出した");
	 }
}

