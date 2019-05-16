package files.autos;

public class Pkw extends Auto {

	@Override
	public String toString() {
		return String.format(
				"------------------------------------\n"
				+ "\t\tPKW            \n"
				+ "------------------------------------\n"
				+ "id:\t\t%,06d\n"
				+ "brand:\t\t%s\n"
				+ "model:\t\t%s\n"
				+ "color:\t\t%s\n"
				+ "gear:\t\t%s\n"
				+ "engine:\t\t%s\n"
				+ "year:\t\t%4d\n"
				+ "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n",
				getId(), getBrand(), getModel(), getColor(), getGear(), getEngine(), getYear());
	}
	
}
