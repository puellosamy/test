/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author usuario
 */
public class Vaso {
    float altura;
   String material;
   String color;

    public Vaso(float altura, String material, String color) {
        this.altura = altura;
        this.material = material;
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
   
}
