/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fadhil.peminjaman.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author user
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nasabahId;
    private Long peminjamanId;
    private String kodeNasabah;
    private Double jumlahPinjaman;
    private Double lamaPinjamanBulan;
    private Double bungaPerTahun;
    private Double bungaPerBulan;
    private Double angsuranPokok;
    private Double angsuranPerBulan;
    private Double totalHutang;
    
    public void setAngsuranPokok(double angsuranPokok){
        this.angsuranPokok = angsuranPokok;
    }
    
    public double getAngsuranPokok(){
        angsuranPokok = jumlahPinjaman / lamaPinjamanBulan;
        return angsuranPokok;
    }
    
    public void setAngsuranPerBulan(double angsuranPerBulan){
        this.angsuranPerBulan = angsuranPerBulan;
    }
    
    public double getAngsuranPerBulan(){
        angsuranPerBulan = bungaPerTahun + angsuranPokok;
        return angsuranPerBulan;
    }
    
    public void setTotalHutang(double totalHutang){
        this.totalHutang = totalHutang;
    }
    
    public double getTotalHutang(){
        totalHutang = angsuranPokok + bungaPerTahun;
        return totalHutang;
    }
}

