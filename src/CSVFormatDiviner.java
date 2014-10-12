/**
 * 
 */
import org.apache.commons.csv.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @author syeates@gmail.com
 *
 */
public class CSVFormatDiviner {


    CSVFormat[] getAllFormats(String delimiters)
    {
       	Vector<CSVFormat>formats = new Vector<CSVFormat>();
    	for (int i=0;i<delimiters.length();i++){
    		formats.add(CSVFormat.DEFAULT.withDelimiter(delimiters.charAt(i)));
    	}
       	Vector<CSVFormat>formats2 = new Vector<CSVFormat>();
    	for (int i=0;i<formats.size();i++){
    		formats2.add(formats.elementAt(i).withAllowMissingColumnNames(true));
    		formats2.add(formats.elementAt(i).withAllowMissingColumnNames(false));
    	}
    	return formats2.toArray(new CSVFormat[0]);
    }
    
    /**
     * The default formats we try
     */
    static CSVFormat[] defaults = { 
        CSVFormat.DEFAULT,
        CSVFormat.EXCEL,
        CSVFormat.MYSQL,
        CSVFormat.RFC4180,        
    };
    
    CSVFormat bestStandardFormat(File file) throws IOException {
    	for (int i=0;i<defaults.length;i++){	
    		CSVParser parser = CSVParser.parse(file,Charset.forName("UTF-8"),defaults[i]);
    		Iterator<CSVRecord> iterator = parser.iterator();
    		Vector<>
    		while(iterator.hasNext()){
    			
    		}
    	}
    	
    	return null;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVFormat[] f = new CSVFormatDiviner().getAllFormats("|,.;:'!");
		System.out.println(f.length);
	}

}
