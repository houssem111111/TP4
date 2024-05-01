/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp4ex2;

import java.util.List;

public class Course {
    
    private String name;
    private List<String> contents;
    private Float coef;
    
    public Course(String name, List<String> contents,Float coef)
    {
        this.name = name;
        this.coef = coef;
        this.contents = contents;
    }
    
    
    
}