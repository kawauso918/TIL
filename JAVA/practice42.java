package javaWcp;

public class Practice87 {
	public static void main (String[]args) {
		Hero h1 = new Hero();
		h1.name = "ミナミ";
		h1.hp = 100;
		Hero h2 =new Hero();
		h2.name = "アサカ";
		Wizard w = new Wizard();
		w.name ="スガワラ";
		w.heal(h2);		
	
	}

}
