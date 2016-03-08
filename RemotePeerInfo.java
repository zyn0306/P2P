/*
 *                     CEN5501C Project2
 * This is the program starting remote processes.
 * This program was only tested on CISE SunOS environment.
 * If you use another environment, for example, linux environment in CISE 
 * or other environments not in CISE, it is not guaranteed to work properly.
 * It is your responsibility to adapt this program to your running environment.
 */

public class RemotePeerInfo {
	public String peerId;
	public String peerAddress;
	public String peerPort;
	public boolean hasFile;
	
	public RemotePeerInfo(String pId, String pAddress, String pPort, int hFile) {
		peerId = pId;
		peerAddress = pAddress;
		peerPort = pPort;
		hasFile = hFile;
	}

	public int getPeerId() {
		return Integer.parseInt(peerId);
	}

	public String getPeerAddress() {
		return peerAddress;
	}

	public int getPeerPort() {
		return Integer.parseInt(peerPort);
	}

	public boolean getHasFile() {
		return hasFile;
	}
}
