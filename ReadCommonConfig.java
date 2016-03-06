/*
 *  Enable a peer to read the file Common.cfg and set up the
 *  corresponding variables.
 */
import java.io.*;
import java.util.Scanner;


public class ReadCommonConfig {
	private static int numberOfPreferredNeighbors;
	private static int unchokingInterval;
	private static int optimisticUnchokingInterval;
	private static String fileName;
	private static long fileSize;
	private static int pieceSize;
	private static final String CONFIG_FILE = "Common.cfg";
	
	//public static void main(String[] args) throws IOException {
	public ReadCommonConfig() throws IOException{
		Scanner reader = new Scanner(new FileInputStream(CONFIG_FILE));
		String s = new String();
		while (reader.hasNext()) {
			switch(s = reader.next()) {
				case "NumberOfPreferredNeighbors" : {
					numberOfPreferredNeighbors = reader.nextInt();
					break;
				}
				case "UnchokingInterval" : {
					unchokingInterval = reader.nextInt();
					break;
				}
				case "OptimisticUnchokingInterval" : {
					optimisticUnchokingInterval = reader.nextInt();
					break;
				}
				case "FileName" : {
					fileName = reader.next();
					break;
				}
				case "FileSize" : {
					fileSize = reader.nextLong();
					break;
				}
				case "PieceSize" : {
					pieceSize = reader.nextInt();
					break;
				}
				default : 
					break;
			}
		}
		/*System.out.println(numberOfPreferredNeighbors + " " + unchokingInterval + " " + optimisticUnchokingInterval + 
		 *	" " + fileName + " " + fileSize + " " + pieceSize);
		 */
	}
}