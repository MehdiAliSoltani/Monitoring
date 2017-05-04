/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trywebservice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mortbay.util.ajax.JSON;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mehdi
 */
@RestController
public class MonitoringController {

    ControllerUtils conUtils = new ControllerUtils();

    /**
     *
     * @return Return a list of available ram, cpu ,disk, service types,
     * virtualization ,operating systems ,Datacenter
     */
    @RequestMapping(Constants.INITIALS)
    public List<List<String>> loadInitials() {
        List<List<String>> initList = conUtils.getInitValue();
        return initList;
    }
    /**
     * 
     * @return 
     */
    @RequestMapping(Constants.DEFAULTS_ON_LOAD)
    public List<ServiceCatalog> getService() {
        List<ServiceCatalog> l = new ArrayList<ServiceCatalog>();
        l.add( Application.SERVICE_LIST.get(2));
//        l.add( Application.SERVICE_LIST.get(3));
        return l;
        
        
    }
    @RequestMapping("/map")
    public Map<String,String> getMap() {
        Map<String, String> m = new HashMap<String, String>();
        m.put("Virt", "KVM");
        m.put("OS", "Windows");
        m.put("OS", "Linux");
        
        return m;
    }
    
//    @RequestMapping(Constants.LOADDEAFAULT)
//    public 

}
