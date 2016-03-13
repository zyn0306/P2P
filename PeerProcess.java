import java.io.*;
import java.util.*;

public class PeerProcess{

	
	public Vector<RemotePeerInfo> peerInfoVector;
	
	public void getConfiguration()
	{
		String st;
		int i1;
		peerInfoVector = new Vector<RemotePeerInfo>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("PeerInfo.cfg"));
			while((st = in.readLine()) != null) {
				
				 String[] tokens = st.split("\\s+");
		    	 //System.out.println("tokens begin ----");
			     //for (int x=0; x<tokens.length; x++) 
			     //    System.out.println(tokens[x]);
			     //}
		         //System.out.println("tokens end ----");
			    
			     peerInfoVector.addElement(new RemotePeerInfo(tokens[0], tokens[1], tokens[2], tokens[3]));
			
			}
			
			in.close();
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PeerProcess myStart = new PeerP();
			myStart.getConfiguration();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}

}