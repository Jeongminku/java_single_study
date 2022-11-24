package ch08.Interface.Q;

public class SoundableEX{

	public static void printSound(Soundable6 soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat6());
		printSound(new Dog6());
	}

	


}
