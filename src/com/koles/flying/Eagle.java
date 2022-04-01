/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koles.flying;

import com.koles.interfaces.Flyable;

/**
 *
 * @author User
 */
public class Eagle implements Flyable {
    @Override
    public int getMaxSpeed(){
        return 180;
    }
}
