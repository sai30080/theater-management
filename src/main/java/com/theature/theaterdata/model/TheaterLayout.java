package com.theature.theaterdata.model;

import java.util.List;
public class TheaterLayout {

    private int totalSeats;
    private int availableSeats;
    private List<TheaterSection> sections;

    public int getTotalCapacity() {
        return totalSeats;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalSeats = totalCapacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public List<TheaterSection> getSections() {
        return sections;
    }

    public void setSections(List<TheaterSection> sections) {
        this.sections = sections;
    }
    
}
