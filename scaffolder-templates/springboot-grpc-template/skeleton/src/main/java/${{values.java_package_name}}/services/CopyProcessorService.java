package ${{values.java_package_name}}.services;

import ${{values.java_package_name}}.domain.CsvFile;
import ${{values.java_package_name}}.domain.File;

public interface CopyProcessorService {

    boolean copyFile(File inputFile);
}
