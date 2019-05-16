package files.autos;

public class Lkw extends Auto {
	
	private int loadArea;

	public int getLoadArea() {
		return loadArea;
	}

	public void setLoadArea(int loadArea) {
		this.loadArea = loadArea;
	}

	
	@Override
	public String toString() {
		return String.format(
				"------------------------------------\n"
				+ "\t\tLKW            \n"
				+ "------------------------------------\n"
				+ "id:\t\t%,06d\n"
				+ "brand:\t\t%s\n"
				+ "model:\t\t%s\n"
				+ "color:\t\t%s\n"
				+ "gear:\t\t%s\n"
				+ "engine:\t\t%s\n"
				+ "year:\t\t%4d\n"
				+ "load area:\t%d\n"
				+ "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n",
				getId(), getBrand(), getModel(), getColor(), getGear(), getEngine(), getYear(), getLoadArea());
	}
}
