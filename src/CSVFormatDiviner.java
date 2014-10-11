/**
 * 
 */
import org.apache.commons.csv.*;
import java.util.Vector;

/**
 * @author syeates@gmail.com
 *
 */
public class CSVFormatDiviner {


    static CSVFormat[] defaults = { 
        CSVFormat.DEFAULT,
        CSVFormat.EXCEL,
        CSVFormat.MYSQL,
        CSVFormat.RFC4180,        
    };
	
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
    	
    
    	return formats.toArray(new CSVFormat[0]);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CSVFormatDiviner().getAllFormats("|,.;:'!");
	}

}
