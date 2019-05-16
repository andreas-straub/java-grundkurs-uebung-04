package files.autos.factory;

import files.autos.Auto;
import files.autos.Pkw;

/**
 * Pkw factory
 */
public class PkwFactory extends AutoFactory {

	@Override
	public Auto create(String[] dataColumns) {
		
		Pkw pkw = new Pkw();

		setUpAuto(dataColumns, pkw);

		return pkw;
	}

}
