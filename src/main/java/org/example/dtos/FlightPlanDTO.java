package org.example.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.example.enums.FlightStatus;

import java.util.List;
import java.util.UUID;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightPlanDTO {
    private UUID id;
    private String flightNumber;
    private String airline;
    private UUID pilotId;
    private List<WaypointDTO> route;
    private int altitude;
    private String  departureTime;
    private String  arrivalTime;
    private FlightStatus status;
    private List<UUID> airspaceAuthorityIds;
    private UUID approvalId;

    public FlightPlanDTO(UUID id, String flightNumber, String airline, UUID pilotId, List<WaypointDTO> route, int altitude, String  departureTime, String  arrivalTime, FlightStatus status, List<UUID> airspaceAuthorityIds, UUID approvalId) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.pilotId = pilotId;
        this.route = route;
        this.altitude = altitude;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
        this.airspaceAuthorityIds = airspaceAuthorityIds;
        this.approvalId = approvalId;
    }

    public FlightPlanDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public UUID getPilotId() {
        return pilotId;
    }

    public void setPilotId(UUID pilotId) {
        this.pilotId = pilotId;
    }

    public List<WaypointDTO> getRoute() {
        return route;
    }

    public void setRoute(List<WaypointDTO> route) {
        this.route = route;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String  getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String  departureTime) {
        this.departureTime = departureTime;
    }

    public String  getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String  arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public List<UUID> getAirspaceAuthorityIds() {
        return airspaceAuthorityIds;
    }

    public void setAirspaceAuthorityIds(List<UUID> airspaceAuthorityIds) {
        this.airspaceAuthorityIds = airspaceAuthorityIds;
    }

    public UUID getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(UUID approvalId) {
        this.approvalId = approvalId;
    }
}
