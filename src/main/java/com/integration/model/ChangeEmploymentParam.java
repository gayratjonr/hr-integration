package com.integration.model;

public class ChangeEmploymentParam {

    private Long changeEmploymentId;
    private Long currentEmploymentId;
    private Long prosecutorEmployeeId;

    public Long getChangeEmploymentId() {
        return changeEmploymentId;
    }

    public void setChangeEmploymentId(Long changeEmploymentId) {
        this.changeEmploymentId = changeEmploymentId;
    }

    public Long getCurrentEmploymentId() {
        return currentEmploymentId;
    }

    public void setCurrentEmploymentId(Long currentEmploymentId) {
        this.currentEmploymentId = currentEmploymentId;
    }

    public Long getProsecutorEmployeeId() {
        return prosecutorEmployeeId;
    }

    public void setProsecutorEmployeeId(Long prosecutorEmployeeId) {
        this.prosecutorEmployeeId = prosecutorEmployeeId;
    }
}
