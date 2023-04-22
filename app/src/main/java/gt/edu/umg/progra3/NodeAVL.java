/*
 * https://www.javatpoint.com/avl-tree-program-in-java
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class NodeAVL {

    int element;
    int height;
    NodeAVL leftChild;
    NodeAVL rightChild;

    public NodeAVL() {
        leftChild = null;
        rightChild = null;
        element = 0;
        height = 0;
    }

    // parameterized constructor  
    public NodeAVL(int element) {
        leftChild = null;
        rightChild = null;
        this.element = element;
        height = 0;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public NodeAVL getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodeAVL leftChild) {
        this.leftChild = leftChild;
    }

    public NodeAVL getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeAVL rightChild) {
        this.rightChild = rightChild;
    }

}
