package javaWcp;

public class Practice92 {
	public static void main(String[]args) {
		Monster[] monster =new Monster[3];
		monster[0] = new Slim();
		monster[1] = new Giblin();
		monster[2] = new DeathBat();
		for (Monster m : monster) {
			m.run();
		}
	}

}
