package files;

import files.autos.Auto;
import files.autos.repository.AutoRepository;
import files.autos.repository.FileAutoRepository;

public class DateienVerarbeiten {

    private static final String AUTOS_FILE_NAME = "/Users/astraub/dev/tmp/autos.csv";

    public static void main(String[] args) {

        AutoRepository autoRepository = new FileAutoRepository(AUTOS_FILE_NAME);

        Auto[] autos = autoRepository.findAll();

        for (Auto auto : autos) {
            System.out.println(auto.toString());
        }

    }

}