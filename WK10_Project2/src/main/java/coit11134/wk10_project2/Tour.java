/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coit11134.wk10_project2;

/**
 *
 * @author Blake Cox (12282557)
 */
public class Tour<T> {
    private String name;
    private T price;

    public Tour(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public T getPrice() {
        return this.price;
    }

    public void setPrice(T newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", price = $" + price + "\n";
    }
}
