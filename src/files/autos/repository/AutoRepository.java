package files.autos.repository;

import files.autos.Auto;

public interface AutoRepository {

	/**
	 * Loads all Auto instances from storage
	 * @return all Auto instances
	 */
	Auto[] findAll();

}