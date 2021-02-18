package ru.sapteh.model;

import javax.persistence.*;


@Entity
@Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private String ram;
    @Column
    private String hdd;
    @Column
    private String powerSupply;
    @Column
    private String videoCard;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getRam(){
        return ram;
    }
    public void setRam(String ram){
        this.ram= ram;
    }
    public String getHdd(){
        return hdd;
    }
    public void setHdd(String hdd){
        this.hdd= hdd;
    }
    public String getPowerSupply(){
        return powerSupply;
    }
    public void setPowerSupply(String powerSupply){
        this.powerSupply=powerSupply;
    }
    public String getVideoCard(){
        return videoCard;
    }
    public void setVideoCard(String videoCard){
        this.videoCard=videoCard;
    }
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ",ram='" + ram + '\'' +
                ",hdd='" + hdd + '\'' +
                ",powerSupply='" + powerSupply + '\'' +
                ",videoCard='" + videoCard + '\'' +
                '}';
    }
}
