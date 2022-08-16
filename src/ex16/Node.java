package ex16;

/*
A tree is an abstract data structure consisting of nodes.
Each node has only one parent node and zero or more child nodes.
Each tree has on special node, called a root, which has no parent node.
A node is called a leaf if it has no child nodes.
The height of a tree is the largest distance (number of parent-child connections) from the root to a leaf

Write a function that calculates the height of a given tree. 
For example, the tree below has a height of 2 since the longest distance(number of parent-child connections) 
from the root to a leaf is 2 (the connections are the root to a node and then the node to leaf 1) 

트리는 노드로 구성된 추상 데이터 구조입니다.
각 노드에는 상위 노드가 하나만 있고 하위 노드가 0개 이상 있습니다.
각 트리는 상위 노드가 없는 루트라는 특수 노드를 가집니다.
하위 노드가 없는 노드를 리프라고 합니다.
트리의 높이는 루트에서 리프까지의 가장 큰 거리(부모-자녀 연결 수)입니다.

주어진 트리의 높이를 계산하는 함수를 작성하세요. 예를 들어, 루트에서 리프까지의 가장 긴 거리(부모-자녀 연결 수)가 2이므로 아래 트리의 높이는 2입니다.
 */

class Node {
    private Node leftChild, rightChild;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        int leftHeight = 0;
        int rightHeight = 0;
        int answer;
        
        if(getLeftChild()!=null) {
        	leftHeight = 1 + getLeftChild().height();
        }
        if(getRightChild()!=null) {
        	rightHeight = 1+ getRightChild().height();
        }
        // 퀵정렬에서 했던것 처럼, 왼쪽을 반복시킬 재귀문과 오른쪽을 반복시킬 재귀문을 만들고 깊이를 구한다.
        
        if(leftHeight>=rightHeight) {
        	answer = leftHeight;
        }else {
        	answer = rightHeight;
        }
        
        return answer;
        
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        // 자식이 없다
        Node leaf2 = new Node(null, null);
        // 자식이없다.
        Node node = new Node(leaf1, null);
        // leaf1을 자식으로 두고있다
        Node root = new Node(node, leaf2);
        // node와 leaf2를 자식으로 두고있다
        /*
         * 			root
         *         /    \
         *      node    leaf2			
         *     /
         *  leaf1
         *  
         *  해당 트리의 형태는 이렇게 된다.
         */

        System.out.println(root.height());
    }
}
