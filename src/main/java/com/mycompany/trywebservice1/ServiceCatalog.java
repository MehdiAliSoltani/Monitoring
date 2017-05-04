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
public class ServiceCatalog {
    private String serviceType; // vps,virtual server. dedicated server, host
    private String serverName;
    private int numberOfCore; // 1,2,3,4, ...
    private double ram; // GB
    private List<String> diskType; // SATA, SSD,SAS
    private double diskCapacity; // GB
    private String virtualizationType; //kvm ,esxi, xen ,...
    private double bandWidth; // M bits
    private double mountlyTraffic; //GB
    private String datacenterProvider; 
    private List<String>  OS; //windows,linux

    private int installationFee; // Toman
    private int operationFee; // mountly1 Toman 
    private String providerLink; // www.example.com/vps
    private String cpuType;
    private int providerId;

 

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

 
    public List<String> getOS() {
        return OS;
    }

    public void setOS(List<String> OS) {
        this.OS = OS;
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

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

}