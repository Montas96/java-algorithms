package codingame;

public class StringEncoder {

    public static void main(String[] args) {
        String MESSAGE = "Chuck Norris' keyboard has 2 keys: 0 and white space.";
        char[] message = MESSAGE.toCharArray();
        String answer = "";
        for (char character : message) {
            answer +=String.format("%7s",  Integer.toBinaryString(character)).replaceAll(" ", "0");
        }
        answer = encode(answer);
        System.out.println(answer);
        System.out.println("0 0 00 0000 0 0000 00 0 0 0 00 000 0 000 00 0 0 0 00 0 0 000 00 000 0 0000 00 0 0 0 00 0 0 00 00 0 0 0 00 00000 0 0 00 00 0 000 00 0 0 00 00 0 0 0000000 00 00 0 0 00 0 0 000 00 00 0 0 00 0 0 00 00 0 0 0 00 00 0 0000 00 00 0 00 00 0 0 0 00 00 0 000 00 0 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 000 00 000 0 0 00 0 0 00 00 0 0 000000 00 0000 0 0000 00 00 0 0 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 00 00 0 0 0 00 000 0 00 00 0000 0 0000 00 00 0 00 00 0 0 0 00 000000 0 00 00 00 0 0 00 00 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 0000 00 00 0 00 00 0 0 000 00 0 0 0 00 00 0 0 00 000000 0 00 00 00000 0 0 00 00000 0 00 00 0000 0 000 00 0 0 000 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 000 00 0 0 00000 00 0 0 0 00 000 0 00 00 0 0 0 00 00 0 0000 00 0 0 0 00 00 0 00 00 00 0 0 00 0 0 0 00 0 0 0 00 00000 0 000 00 00 0 00000 00 0000 0 00 00 0000 0 000 00 000 0 0000 00 00 0 0 00 0 0 0 00 0 0 0 00 0 0 000 00 0");
    }

    private static String encode(String binaryCode) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        char c = binaryCode.charAt(0);
        sb.append(c == '1' ? "0 0" : "00 0");
        while (i < binaryCode.length()) {
            if (c == binaryCode.charAt(i)) {
                sb.append("0");
            } else {
                sb.append(binaryCode.charAt(i) == '1' ? " 0 0" : " 00 0");
            }
            c = binaryCode.charAt(i);
            i++;
        }
        return sb.toString();
    }
}
