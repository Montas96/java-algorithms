package codingame;

public class JoinPoint {


    public static void main(String[] args) {
        int joinPoint = computeJoinPoint(471, 480);

        System.out.println("is correct " + (joinPoint == 519));
        System.out.println(joinPoint);
    }

    public static int computeJoinPoint(int s1, int s2) {

        int nexS1 = getNext(s1);
        int nexS2 = getNext(s2);
        while (nexS1 != nexS2) {
            nexS1 = getNext(nexS1);
            nexS2 = getNext(nexS2);
        }

        return nexS1;
    }

    private static int getNext(int s1) {
        char[] chars = String.valueOf(s1).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = Character.digit(chars[i], 10);
            s1 += j;
            System.out.println("digit: " + s1);
        }
        return s1;
    }

}
