/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class Person {
    
    private int code;
    String name, phone, email;
    private Person left, right;

    public Person(int code, String name, String phone, String email) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getLeft() {
        return left;
    }

    public void setLeft(Person left) {
        this.left = left;
    }

    public Person getRight() {
        return right;
    }

    public void setRight(Person right) {
        this.right = right;
    }

    
    
}
