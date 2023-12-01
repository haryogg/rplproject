/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate;

import com.labti.springHibernate.service.MahasiswaService;
import com.labti.springHibernate.view.ViewMahasiswa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Haryo
 */
public class app {
    private static ApplicationContext applicationContext;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
            new ViewMahasiswa().setVisible(true);
        } catch (Exception e) {
            System.err.println("Error creating Spring application context: " + e.getMessage());
        }
    }
    
    /**
     *
     * @return
     */
    public static MahasiswaService getMahasiswaService(){
        return(MahasiswaService)applicationContext.getBean("MahasiswaService");
    }
}
