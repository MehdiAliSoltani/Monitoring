/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trywebservice1;

import java.util.List;

/**
 *
 * @author mehdi
 */
public class ServiceCatalog_1 {
    private String serviceType; // vps,virtual server. dedicated server, host
    private String serverName;
    private String CPUType; // Type of cpu
    private int numberOfCore; // 1,2,3,4, ...
    private double ram; // GB
    private List<String> diskType; // SATA, SSD,SAS
    private double diskCapacity; // GB
    private String virtualizationType; //kvm ,esxi, xen ,...
    private double bandWidth; // M bits
    private double mountlyTraffic; //GB
    private String datacenterProvider; 
    private List<String> panel;
    private List<String>  OS; //windows,linux
    private String support;
    private int routableIP;
    private String deliveryTime; // ondemand. 1 to 3 days , ... 
    private int installationFee; // Toman
    private int operationFee; // mountly1 Toman 
    private String providerLink; // www.example.com/vps
    private ExtraServiceCatalog extraServiceCatalog;

 /*   public ServiceCatalog(String serviceType, String serverName, String CPUType, int numberOfCore, 
            double ram, String diskType, double diskCapacity, String virtualizationType, 
            double bandWidth, double mountlyTraffic, String datacenterProvider, List<String> panel,
            List<String> OS, String support, int routableIP, String deliveryTime, 
            int installationFee, int operationFee, String providerLink, 
            ExtraServiceCatalog extraServiceCatalog) {
        this.serviceType = serviceType;
        this.serverName = serverName;
        this.CPUType = CPUType;
        this.numberOfCore = numberOfCore;
        this.ram = ram;
        this.diskType = diskType;
        this.diskCapacity = diskCapacity;
        this.virtualizationType = virtualizationType;
        this.bandWidth = bandWidth;
        this.mountlyTraffic = mountlyTraffic;
        this.datacenterProvider = datacenterProvider;
        this.panel = panel;
        this.OS = OS;
        this.support = support;
        this.routableIP = routableIP;
        this.deliveryTime = deliveryTime;
        this.installationFee = installationFee;
        this.operationFee = operationFee;
        this.providerLink = providerLink;
        this.extraServiceCatalog = extraServiceCatalog;
    }
*/

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getCPUType() {
        return CPUType;
    }

    public void setCPUType(String CPUType) {
        this.CPUType = CPUType;
    }

    public int getNumberOfCore() {
        return numberOfCore;
    }

    public void setNumberOfCore(int numberOfCore) {
        this.numberOfCore = numberOfCore;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public List<String> getDiskType() {
        return diskType;
    }

    public void setDiskType(List<String> diskType) {
        this.diskType = diskType;
    }

   

    public double getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(double diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public double getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(double bandWidth) {
        this.bandWidth = bandWidth;
    }

    public double getMountlyTraffic() {
        return mountlyTraffic;
    }

    public void setMountlyTraffic(double mountlyTraffic) {
        this.mountlyTraffic = mountlyTraffic;
    }

    public String getDatacenterProvider() {
        return datacenterProvider;
    }

    public void setDatacenterProvider(String datacenterProvider) {
        this.datacenterProvider = datacenterProvider;
    }

    public List<String> getPanel() {
        return panel;
    }

    public void setPanel(List<String> panel) {
        this.panel = panel;
    }

    public List<String> getOS() {
        return OS;
    }

    public void setOS(List<String> OS) {
        this.OS = OS;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public int getRoutableIP() {
        return routableIP;
    }

    public void setRoutableIP(int routableIP) {
        this.routableIP = routableIP;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getInstallationFee() {
        return installationFee;
    }

    public void setInstallationFee(int installationFee) {
        this.installationFee = installationFee;
    }

    public int getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(int operationFee) {
        this.operationFee = operationFee;
    }

    public String getProviderLink() {
        return providerLink;
    }

    public void setProviderLink(String providerLink) {
        this.providerLink = providerLink;
    }

    public ExtraServiceCatalog getExtraServiceCatalog() {
        return extraServiceCatalog;
    }

    public void setExtraServiceCatalog(ExtraServiceCatalog extraServiceCatalog) {
        this.extraServiceCatalog = extraServiceCatalog;
    }
    
    
    
    

   
}
