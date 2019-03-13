package example.java.algorithms.searching.depth.first;

public class MinimalPath {
    static class Node {

        int cost;
        Node[] children;
        Node parent;

        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }
    }

    static class SalesPath {

        int getCheapestCost(Node rootNode) {
            // your code goes here
            return getCheapestInPath(rootNode);

        }

        int getCheapestInPath(Node rootNode) {

            if(rootNode.children == null || rootNode.children.length==0) {
                return rootNode.cost;
            }
            int cheapest = Integer.MAX_VALUE;
            for(Node childNode : rootNode.children) {
                int chp = getCheapestInPath(childNode);
                if(chp< cheapest) {
                    cheapest = chp;
                }
            }
            return cheapest+rootNode.cost;
        }
    }

    /*********************************************
     * Driver program to test above method     *
     *********************************************/

    public static void main(String[] args) {
        Node root = new Node(0);
        Node ch1 = new Node(5);
        Node ch2 = new Node(3);
        Node ch3 = new Node(6);
        root.children = new Node[3];
        root.children[0] = ch1;
        root.children[1] = ch2;
        root.children[2] = ch3;
        Node ch4 = new Node(4);
        ch1.children = new Node[1];
        ch1.children[0] = ch4;
        Node ch5 = new Node(2);
        Node ch6 = new Node(0);
        ch2.children = new Node[2];
        ch2.children[0] = ch5;
        ch2.children[1] = ch6;
        Node ch7 = new Node(1);
        Node ch8 = new Node(5);
        ch3.children = new Node[2];
        ch3.children[0] = ch7;
        ch3.children[1] = ch8;
        Node ch9 = new Node(1);
        ch5.children = new Node[1];
        ch5.children[0] = ch9;
        Node ch10 = new Node(10);
        ch6.children = new Node[1];
        ch6.children[0] = ch10;
        Node ch11 = new Node(1);
        ch9.children = new Node[1];
        ch9.children[0] = ch11;

        SalesPath sales = new SalesPath();
        System.out.println(sales.getCheapestInPath(root));
    }
}
