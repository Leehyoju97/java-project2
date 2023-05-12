package com.example.javaproject3.week4.day4;

public class Hospital {
    private String name;
    private String websiteAddr;
    private Address address;

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public void setWebsiteAddr(String websiteAddr) {
        this.websiteAddr = websiteAddr;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
