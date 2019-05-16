package files.autos.repository;

import java.io.FileInputStream;
import java.io.IOException;

import com.Ostermiller.util.CSVParser;
import com.Ostermiller.util.LabeledCSVParser;

import files.autos.Auto;
import files.autos.factory.AutoFactory;

public class FileAutoRepository implements AutoRepository {
	
	private final String storeFilePath;

	/**
	 * Constructor of the file based auto repository
	 * @param storeFilePath path to data file
	 */
	public FileAutoRepository(String storeFilePath) {
		this.storeFilePath = storeFilePath;
	}

	@Override
	public Auto[] findAll() {
		
		String[][] allCsvLines = readLinesFromCsvFile();
		Auto[] autos = new Auto[allCsvLines.length];
		
		int i = 0;
		for (String[] line : allCsvLines) {
			autos[i] = AutoFactory.createFromColumns(line);
			i++;
		}
		
		return autos;
	}
	
	private String[][] readLinesFromCsvFile() {
		try { 
			LabeledCSVParser parser = new LabeledCSVParser(new CSVParser(new FileInputStream(storeFilePath)));	
			return parser.getAllValues();
		} catch (IOException e) {
			String msg = "Can not read the input file '"  + storeFilePath + "': " + e.getMessage();
			System.out.println(msg);
			throw new RuntimeException(msg);
		}
	}
}
