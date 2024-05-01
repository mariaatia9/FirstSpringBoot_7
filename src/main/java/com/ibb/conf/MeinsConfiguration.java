/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.conf;

import com.ibb.model.Person;
import jakarta.annotation.PostConstruct;
import java.time.Year;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author trainer
 */
//@Profile(value = "meins")
@Configuration
public class MeinsConfiguration {

    @Value(value = "${myValue}")
    private String text;
    
    
    public MeinsConfiguration() {
        System.out.println("Meins Configuration aufgerufen mit dem meinValue:"+text);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Meins Configuration aufgerufen mit dem meinValue: " + text);
    }
    
    
}
