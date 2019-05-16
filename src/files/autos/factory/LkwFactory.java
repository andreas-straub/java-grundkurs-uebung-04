package files.autos.factory;

import files.autos.Auto;
import files.autos.Lkw;

/**
 * Lkw factory
 */
public class LkwFactory extends AutoFactory {

	@Override
	public Auto create(String[] dataColumns) {
		Lkw lkw = new Lkw();

		setUpAuto(dataColumns, lkw);

		lkw.setLoadArea(readIntValueFrom(dataColumns, 8));
		
		return lkw;
	}

}
