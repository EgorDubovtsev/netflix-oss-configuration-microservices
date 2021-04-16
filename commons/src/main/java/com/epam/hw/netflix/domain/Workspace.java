package com.epam.hw.netflix.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Workspace {
    private String id;
    private int unit;
    private int seat;
    private String serialNumber;
    private OSFamily osFamily;

    public Workspace(String id, int unit, int seat, String serialNumber, OSFamily osFamily) {
        this.id = id;
        this.unit = unit;
        this.seat = seat;
        this.serialNumber = serialNumber;
        this.osFamily = osFamily;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public OSFamily getOsFamily() {
        return osFamily;
    }

    public void setOsFamily(OSFamily osFamily) {
        this.osFamily = osFamily;
    }
}
