import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
public static void main(String[] args) throws IOException{
		
		FileInputStream fi=null;
		FileOutputStream fo=null;
		try {
			fi=new FileInputStream("input.txt");
			fo=new FileOutputStream("output_byte.txt");
			
			int ch;
			while((ch=fi.read())!=-1) {
				fo.write(ch);
			}
			
			fo.close();
			fi.close();
		}
		catch(Exception e){
			System.out.println("Action could not be performed");
		}
		
	}

}
