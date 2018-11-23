package entities;

public class RacasMed {
	
	public String[] racas = new String[3];
	{

		racas[0] = "Golden Retriever";
		racas[1] = "Labrador Retriever";
		racas[2] = "Pit Bull";
		
	}

	public double idadeCao(double idade, int raca) {

		double result = 0;

		if (raca - 1 == 0) {
			result = 21 + ((idade - 2) * 5.74);
		} else if (raca - 1 == 1) {
			result = 21 + ((idade - 2) * 5.74);
		} else if (raca - 1 == 2) {
			result = 21 + ((idade - 2) * 5.33);
		}
		return result;
	}

	@Override
	public String toString() {
		return  "1) Golden Retriever\n" + 
				"2) Labrador Retriever\n" + 
				"3) Pit Bull";
				
	}

}
