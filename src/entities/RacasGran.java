package entities;

public class RacasGran {
	
	public String[] racas = new String[9];
	{

		racas[0] = "Boxer";
		racas[1] = "Pastor Alemão";
		
	}

	public double idadeCao(double idade, int raca) {

		double result = 0;

		if (raca - 1 == 0) {
			result = 18 + ((idade - 2) * 8.90);
		} else if (raca - 1 == 1) {
			result = 18 + ((idade - 2) * 7.84);
		} 
		return result;
	}

	@Override
	public String toString() {
		return  "1) Boxer\n" + 
				"2) Pastor Alemão"; 
				
	}

}
