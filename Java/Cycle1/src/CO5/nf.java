package CO5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class nf {
public static void main(String[] args) throws IOException{
	int d;
	FileInputStream w=new FileInputStream("C:\\Users\\kanna\\OneDrive\\Documents\\MCA\\Java\\Cycle1\\src\\x.txt");

	FileOutputStream r=new FileOutputStream("C:\\Users\\kanna\\OneDrive\\Documents\\MCA\\Java\\Cycle1\\src\\x - Copy.txt");

	while((d=w.read())!=-1){
		System.out.println(d);
		r.write(d);
	}
	r.close();
	w.close();
}
}
