/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trywebservice1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehdi
 */
public class ControllerUtils {
    
    public List<List<String>> getInitValue(){
                List<List<String>> initValue = new ArrayList<List<String>>();
                
        List<String> serviceType = new ArrayList<String>();
        serviceType.add("ServiceType");
        List<String> virtualization = new ArrayList<String>();
        virtualization.add("Virtualization");
        List<String> os = new ArrayList<String>();
        os.add("OS");
        List<String> dc = new ArrayList<String>();
        dc.add("DC");
        for (ServiceCatalog row : Application.SERVICE_LIST) {
            //add Service Type
            if (!serviceType.contains(row.getServiceType())) {
                serviceType.add(row.getServiceType());
            }
            //add virtualization
            if (!virtualization.contains(row.getVirtualizationType())) {
                virtualization.add(row.getVirtualizationType());
            }
            for (String osName : row.getOS()) {
                if (!os.contains(osName)) {
                    os.add(osName);
                }
            }
            if (!dc.contains(row.getDatacenterProvider())) {
                dc.add(row.getDatacenterProvider());
            }
        }
        initValue.add(serviceType);
        initValue.add(virtualization);
        initValue.add(os);
        initValue.add(dc);
        List<String> a = new ArrayList<String>();
        return initValue;
    }
}
