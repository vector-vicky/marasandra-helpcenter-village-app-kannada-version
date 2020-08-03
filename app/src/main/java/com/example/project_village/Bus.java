package com.example.project_village;

public class Bus {
    String busname;

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusname() {
        return busname;
    }

    String bustime;

    public Bus(String busname,String bustime) {
        this.busname = busname;
        this.bustime=bustime;
    }


    public String getBustime() {
        return bustime;
    }

    public void setBustime(String bustime) {
        this.bustime = bustime;
    }
}

