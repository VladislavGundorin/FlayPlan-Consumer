package org.example.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public class AuditLogDTO {
    private UUID id;
    private String action;
    private LocalDateTime timestamp;
    private String performedBy;
    private String details;

    public AuditLogDTO(UUID id, String action, LocalDateTime timestamp, String performedBy, String details) {
        this.id = id;
        this.action = action;
        this.timestamp = timestamp;
        this.performedBy = performedBy;
        this.details = details;
    }

    public AuditLogDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
