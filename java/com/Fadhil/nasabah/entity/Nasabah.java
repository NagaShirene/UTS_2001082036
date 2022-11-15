/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Fadhil.nasabah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author VOLTURI
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nasabah {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long nasabahid;
    private String nama;
}
