/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzisunarya.latihanmvc.model;

import com.fauzisunarya.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 * Nama : Fauzi Sunarya
 * NIM : 10117110
 * Kelas : IF-3
 * 
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String notelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganlistener) {
        this.pelangganListener = pelangganlistener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener!=null) {
            pelangganListener.onChange(this);
            
        }
           
           
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNotelp("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
        
    }
    
    
    
}
