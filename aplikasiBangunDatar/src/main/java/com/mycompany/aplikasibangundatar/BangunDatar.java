/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasibangundatar;

/**
 *
 * @author LENOVO
 */
abstract class BangunDatar {
    private String namaBangunDatar;
    abstract double luas();
    abstract double keliling();

    public BangunDatar() {
    }
    
    public BangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    abstract double luas();
    abstract double keliling();
}
