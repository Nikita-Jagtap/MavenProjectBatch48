package TESTNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFile {
	@Test
	public void Readfile() throws IOException
	{
		String path="C:\\Users\\Admin\\eclipse-workspace\\MavenProjectBatch48\\TestData\\abc.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Address"));
		System.out.println(prop.getProperty("State"));
		
	}

}
