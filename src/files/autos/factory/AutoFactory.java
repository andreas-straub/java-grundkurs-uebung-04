package files.autos.factory;

import files.autos.Auto;

/**
 * Base Class of Auto factory.
 * 
 * @author astraub
 *
 */
public abstract class AutoFactory {

	/**
	 * Creates an Auto instance from array of data columns
	 * 
	 * @param dataColumns data columns with properties of an auto
	 * @return new instance of Auto
	 */
	public abstract Auto create(String[] dataColumns);

	/**
	 * Creates an Auto instance from array of data columns
	 * 
	 * @param dataColumns data columns with properties of an auto
	 * @return new instance of either Pkw or Lkw, depending on the category column
	 */
	public static Auto createFromColumns(String[] dataColumns) {

		String category = dataColumns[1];

		if (category == null) {
			throw new RuntimeException("Could not read from column with the index: 1. (category missing)");
		}

		switch (category.toLowerCase()) {
		case "pkw":
			AutoFactory pkwFactory = new PkwFactory();
			return pkwFactory.create(dataColumns);
		case "lkw":
			return new LkwFactory().create(dataColumns);
		default:
			throw new RuntimeException(
					"Wrong category type! Expected either 'pkw' or 'lkw' but got: '" + category + "'");
		}
	}

	/**
	 * Reads the value of column with provided index as integer
	 * 
	 * @param dataColumns data columns with properties of an auto
	 * @param index   index of column to read the value from
	 * @return value as integer
	 */
	protected int readIntValueFrom(String[] dataColumns, int index) {
		if (dataColumns[index] == null) {
			throw new RuntimeException("Could not read from column with the index: " + index);
		}
		return Integer.parseInt(dataColumns[index]);
	}

	/**
	 * Sets the values from provided colums array to an Auto instance
	 * @param dataColumns Data columns of Auto
	 * @param auto new Auto instance to be initialized from data columns
	 */
	protected void setUpAuto(String[] dataColumns, Auto auto) {
		auto.setId(readIntValueFrom(dataColumns, 0));
		auto.setBrand(dataColumns[2]);
		auto.setModel(dataColumns[3]);

		auto.setColor(dataColumns[4]);
		auto.setGear(dataColumns[5]);
		auto.setEngine(dataColumns[6]);
		auto.setYear(readIntValueFrom(dataColumns, 7));
	}
}
