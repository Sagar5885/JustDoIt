package ExtraTopics;

public class ByteHex {
    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes){
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            int tmp = v >>> 4;
            int tmp2 = v & 0x0F;
            hexChars[j * 2] = hexArray[tmp];
            hexChars[j * 2 + 1] = hexArray[tmp2];
        }
        return new String(hexChars);
    }

    public static void main(String[] args) {

        byte[] bytes = {26, 2, 15, 17};

        String s = bytesToHex(bytes);
        System.out.println(s);

    }
}
