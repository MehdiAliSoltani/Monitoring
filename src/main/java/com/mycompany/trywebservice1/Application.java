/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trywebservice1;

/**
 *
 * @author mehdi
 */
import Google.LoadDataGoogleSheet;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
public  static List<ServiceCatalog> SERVICE_LIST;
    public static void main(String[] args) {
                LoadDataGoogleSheet l = new LoadDataGoogleSheet();
        SERVICE_LIST = l.loadSheetInMemory();
        SpringApplication.run(Application.class, args);
    }
}