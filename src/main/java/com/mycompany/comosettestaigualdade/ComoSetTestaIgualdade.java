/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.comosettestaigualdade;

/**
 *
 * @author crist
 */
import java.util.HashSet;
import java.util.Set;
import entities.Product;

public class ComoSetTestaIgualdade {

    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        
        Product prod = new Product("Notebook", 1200.0);
        
        System.out.println(set.contains(prod));
    }
}
