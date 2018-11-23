package entities;

public class RacasPeq {

	public String[] racas = new String[9];
	{

		racas[0] = "Beagle";
		racas[1] = "Buldogue Francês";
		racas[2] = "Chihuahua";
		racas[3] = "Cocker Spaniel";
		racas[4] = "Lhasa Apso";
		racas[5] = "Pug";
		racas[6] = "Shih Tzu";
		racas[7] = "Schnauzer";
		racas[8] = "Yorkshire";

	}

	public double idadeCao(double idade, int raca) {

		double result = 0;

		if (raca - 1 == 0) {
			result = 25 + ((idade - 2) * 5.20);
		} else if (raca - 1 == 1) {
			result = 25 + ((idade - 2) * 7.65);
		} else if (raca - 1 == 2) {
			result = 25 + ((idade - 2) * 4.87);
		} else if (raca - 1 == 3) {
			result = 25 + ((idade - 2) * 5.55);
		} else if (raca - 1 == 4) {
			result = 25 + ((idade - 2) * 4.49);
		} else if (raca - 1 == 5) {
			result = 25 + ((idade - 2) * 5.95);
		} else if (raca - 1 == 6) {
			result = 25 + ((idade - 2) * 4.78);
		} else if (raca - 1 == 7) {
			result = 25 + ((idade - 2) * 5.46);
		} else if (raca - 1 == 8) {
			result = 25 + ((idade - 2) * 5.33);
		}
		return result;
	}

	@Override
	public String toString() {
		return  "1) Beagle\n" + 
				"2) Buldogue Francês\n" + 
				"3) Chihuahua\n" + 
				"4) Cocker Spaniel\n" + 
				"5) Lhasa Apso\n" + 
				"6) Pug\n" + 
				"7) Shih Tzu\n" + 
				"8) Schnauzer\n" + 
				"9) Yorkshire";
	}
	

}
