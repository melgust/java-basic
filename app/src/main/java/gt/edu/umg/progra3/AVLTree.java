/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class AVLTree {

    private NodeAVL rootNode;

    public AVLTree() {
        rootNode = null;
    }

    public void removeAll() {
        rootNode = null;
    }

    public boolean isEmpty() {
        return rootNode == null;
    }

    private NodeAVL insertElementRecursive(int element, NodeAVL node) {
        //check whether the node is null or not  
        if (node == null) {
            node = new NodeAVL(element);
        } //insert a node in case when the given element is lesser than the element of the root node  
        else if (element < node.getElement()) {
            node.setLeftChild(insertElementRecursive(element, node.getLeftChild()));
            if (getHeight(node.getLeftChild()) - getHeight(node.getRightChild()) == 2) {
                if (element < node.getLeftChild().getElement()) {
                    node = rotateWithLeftChild(node);
                } else {
                    node = doubleWithLeftChild(node);
                }
            }
        } else if (element > node.getElement()) {
            node.setRightChild(insertElementRecursive(element, node.getRightChild()));
            if (getHeight(node.getRightChild()) - getHeight(node.getLeftChild()) == 2) {
                if (element > node.getRightChild().getElement()) {
                    node = rotateWithRightChild(node);
                } else {
                    node = doubleWithRightChild(node);
                }
            }
        } else  
            ;  // if the element is already present in the tree, we will do nothing   
        node.setHeight(getMaxHeight(getHeight(node.getLeftChild()), getHeight(node.rightChild)) + 1);
        return node;
    }

    public void insertElement(int element) {
        rootNode = insertElementRecursive(element, rootNode);
    }

    private int getHeight(NodeAVL node) {
        return node == null ? -1 : node.height;
    }

    private int getMaxHeight(int leftNodeHeight, int rightNodeHeight) {
        return leftNodeHeight > rightNodeHeight ? leftNodeHeight : rightNodeHeight;
    }

    // creating rotateWithLeftChild() method to perform rotation of binary tree node with left child        
    private NodeAVL rotateWithLeftChild(NodeAVL node2) {
        NodeAVL node1 = node2.leftChild;
        node2.leftChild = node1.rightChild;
        node1.rightChild = node2;
        node2.height = getMaxHeight(getHeight(node2.leftChild), getHeight(node2.rightChild)) + 1;
        node1.height = getMaxHeight(getHeight(node1.leftChild), node2.height) + 1;
        return node1;
    }

    // creating rotateWithRightChild() method to perform rotation of binary tree node with right child        
    private NodeAVL rotateWithRightChild(NodeAVL node1) {
        NodeAVL node2 = node1.rightChild;
        node1.rightChild = node2.leftChild;
        node2.leftChild = node1;
        node1.height = getMaxHeight(getHeight(node1.leftChild), getHeight(node1.rightChild)) + 1;
        node2.height = getMaxHeight(getHeight(node2.rightChild), node1.height) + 1;
        return node2;
    }

    //create doubleWithLeftChild() method to perform double rotation of binary tree node. This method first rotate the left child with its right child, and after that, node3 with the new left child  
    private NodeAVL doubleWithLeftChild(NodeAVL node3) {
        node3.leftChild = rotateWithRightChild(node3.leftChild);
        return rotateWithLeftChild(node3);
    }

    //create doubleWithRightChild() method to perform double rotation of binary tree node. This method first rotate the right child with its left child and after that node1 with the new right child  
    private NodeAVL doubleWithRightChild(NodeAVL node1) {
        node1.rightChild = rotateWithLeftChild(node1.rightChild);
        return rotateWithRightChild(node1);
    }

    //create getTotalNumberOfNodes() method to get total number of nodes in the AVL Tree  
    public int getTotalNumberOfNodes() {
        return getTotalNumberOfNodes(rootNode);
    }

    private int getTotalNumberOfNodes(NodeAVL head) {
        if (head == null) {
            return 0;
        } else {
            int length = 1;
            length = length + getTotalNumberOfNodes(head.leftChild);
            length = length + getTotalNumberOfNodes(head.rightChild);
            return length;
        }
    }

    //create searchElement() method to find an element in the AVL Tree  
    public boolean searchElement(int element) {
        return searchElement(rootNode, element);
    }

    private boolean searchElement(NodeAVL head, int element) {
        boolean check = false;
        while ((head != null) && !check) {
            int headElement = head.element;
            if (element < headElement) {
                head = head.leftChild;
            } else if (element > headElement) {
                head = head.rightChild;
            } else {
                check = true;
                break;
            }
            check = searchElement(head, element);
        }
        return check;
    }
}
