/**
 * 
 */
package Assignment_8;																									// Package declared
import java.io.*;																										// import io classes objects 
/**
 * Write a program for file copy.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class Assignment_8_1 {																							// Class declared
	public static void main(String[] args) {																			// Main Method started
		FileInputStream ins = null;																						// FileInputStream by opening a connection to an actual file, the file named by the File object file in the file system.
	      FileOutputStream outs = null;																					// This creates a FileInputStream by using the file descriptor outs, which represents an existing connection to an actual file in the file system.
	      try {																											// try block
	         File infile =new File("C:\\Users\\khuranas\\eclipse-workspace\\Core_Java_Assignment_8_1\\input.txt");		// Input file
	         File outfile =new File("C:\\Users\\khuranas\\eclipse-workspace\\Core_Java_Assignment_8_1\\output.txt");	// output file
	         ins = new FileInputStream(infile);																			// new object created
	         outs = new FileOutputStream(outfile);																		// new object created
	         byte[] buffer = new byte[1024];																			// buffer size assigned 
	         int length;																								// integer variable declared
	         while ((length = ins.read(buffer)) > 0) {																	// Copying the contents from input stream to output stream using read and write methods
	            outs.write(buffer, 0, length); } 
	         ins.close();
	         outs.close();
	         System.out.println("File copied successfully!!");															// Print Statement
	      } catch(IOException ioe) {																					// catch Statement
	         ioe.printStackTrace();} 
	}																													// Main method closed 
}																														// class Assignment_8_1
