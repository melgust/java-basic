/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class Tree {

    private NodeTree root;

    public void insert(NodeTree father, int code, String name, String phone, String email) {
        if (code != father.getCode()) {
            if (code > father.getCode()) {
                if (father.getRight() == null) {
                    father.setRight(new NodeTree(code, name, phone, email));
                } else {
                    insert(father.getRight(), code, name, phone, email);
                }
            } else {
                if (father.getLeft() == null) {
                    father.setLeft(new NodeTree(code, name, phone, email));
                } else {
                    insert(father.getLeft(), code, name, phone, email);
                }
            }
        }
    }

    public void insert(int code, String name, String phone, String email) {
        NodeTree nodeTree = new NodeTree(code, name, phone, email);
        if (root == null) {
            root = nodeTree;
        } else {
            insert(root, code, name, phone, email);
        }
    }
    
    public void preorder(NodeTree tmp) {
        if (tmp != null) {
            System.out.println(tmp.getCode());
            preorder(tmp.getLeft());
            preorder(tmp.getRight());
        }
    }
    
    public void preorder() {
        if (root == null) {
            System.out.println("Empty");
        } else {
            System.out.println(root.getCode());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    
    public void inorder(NodeTree tmp) {
        if (tmp != null) {
            inorder(tmp.getLeft());
            System.out.println(tmp.getCode());
            inorder(tmp.getRight());
        }
    }
    
    public void inorder() {
        if (root == null) {
            System.out.println("Empty");
        } else {
            inorder(root.getLeft());
            System.out.println(root.getCode());
            inorder(root.getRight());
        }
    }
    
    public void postorder(NodeTree tmp) {
        if (tmp != null) {
            postorder(tmp.getLeft());
            postorder(tmp.getRight());
            System.out.println(tmp.getCode());
        }
    }
    
    public void postorder() {
        if (root == null) {
            System.out.println("Empty");
        } else {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getCode());
        }
    }

}
