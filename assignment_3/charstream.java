import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class charstream {

	public static void main(String[] args) throws IOException{
		
		FileReader fi=null;
		try {
			fi=new FileReader("input.txt");
			FileWriter fo=new FileWriter("output.txt");
			
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