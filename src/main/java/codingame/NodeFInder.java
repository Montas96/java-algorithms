package codingame;

public class NodeFInder {

    public static void main(String[] args) {

        int[] fromIds = new int[]{1, 7, 3, 4, 2, 6, 9};
        int[] toIds = new int[]{3, 3, 4, 6, 6, 9, 5};


        int endpoint = findNetworkEndpoint(3, fromIds, toIds);
        System.out.println(endpoint);

    }

    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {

        int end = -1;
        for (int i = 0; i < fromIds.length; i++) {
            if (fromIds[i] == startNodeId) {
                end = findNetworkEndpoint(toIds[i], fromIds, toIds);
                if (end != -1) {
                    return end;
                }
            }
        }

        return startNodeId;
    }
}
