package org.example.dtos;

import java.util.UUID;

public class PilotDTO {
    private UUID id;
    private String name;
    private String licenseNumber;
    private String contactInfo;

    public PilotDTO(UUID id, String name, String licenseNumber, String contactInfo) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.contactInfo = contactInfo;
    }

    public PilotDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
