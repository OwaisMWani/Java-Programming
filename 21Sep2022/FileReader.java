import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class FileReader {
	public static void main(String[] args) throws IOException{
		Reader read=new Reader();
		Writer write=new Writer();
		read.readFile();
		write.writeFile();
	}	
}

class Reader{
	public void readFile() throws FileNotFoundException{
		File file=new File("E:/owais/Documents/JavaProgramming/21Sep2022/TestJava.txt");//Creating a file object,with the path of the file
		Scanner scan=new Scanner(file); //This Scanner scans the file
		while(scan.hasNextLine()) { //Scans whether the file has more lines or not
			System.out.println(scan.nextLine());//Prints the line and moves to the next line
		}
		scan.close();
	}
}

class Writer{
	public void writeFile() throws IOException {
		File file=new File("E:/owais/Documents/JavaProgramming/21Sep2022/TestJava.txt");
		Scanner scan=new Scanner(file);
		String fileContent = "This is a file made through java code! ";//Declaring fileContent
		while(scan.hasNextLine()) {
			fileContent=fileContent.concat(scan.nextLine()+"\n"); //Concatenating the fileContent String with the string scanned in our JavaTest.txt file
			}
		FileWriter writer=new FileWriter("E:/owais/Documents/JavaProgramming/21Sep2022/newfile.txt");//Creating a new file in the given path with an object of the FileWriter class
		writer.write(fileContent);//we write the string in fileContent string onto the text file with the writer object
		writer.close();
		scan.close();
	}
}