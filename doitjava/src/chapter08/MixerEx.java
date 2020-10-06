package chapter08;

public class MixerEx {

	public static void main(String[] args) {
		Mixer n = new Mixer();
		Fruit f = new Fruit();
		n.mixing(f);

		n.mixing(new Apple());
		n.mixing(new Melon());
//		n.mixing(new Meat());

		Mixer2 n2 = new Mixer2();
		n2.mixing(new Apple());
//		n2.mixing(new Melon());

	}

}
