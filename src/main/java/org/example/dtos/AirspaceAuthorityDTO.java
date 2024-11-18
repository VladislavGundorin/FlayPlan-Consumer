package org.example.dtos;

import java.util.UUID;

public class AirspaceAuthorityDTO {
    private UUID id;
    private String name;
    private String region;
    private String contactInfo;

    public AirspaceAuthorityDTO(UUID id, String name, String region, String contactInfo) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.contactInfo = contactInfo;
    }

    public AirspaceAuthorityDTO() {
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
