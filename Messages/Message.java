import java.nio.*;

public abstract class Message {
	public int Byte4ToInt(byte[] bytes, int offset) {
		ByteBuffer bb = ByteBuffer.wrap(bytes, offset, 4);
		return bb.getInt();
	}

	public static byte[] IntToByte4(int i) {
		return ByteBuffer.allocate(4).putInt(i).array();
	}
	
	public byte IntToByte(int i) {
		Integer I = i;
		return I.byteValue();
	}

	public int ByteToInt(byte b) {
		Byte B = b;
		return B.intValue();
	}
}