package com.thoughtworks.frontend.model;

public class Staff {
    private String gender;
    private String preferredName;
    private String loginName;
    private String employeeId;

    private String projectPreferences;

    public String getLongTermGoal() {
        return longTermGoal;
    }

    public void setLongTermGoal(String longTermGoal) {
        this.longTermGoal = longTermGoal;
    }

    public String getProjectPreferences() {
        return projectPreferences;
    }

    public void setProjectPreferences(String projectPreferences) {
        this.projectPreferences = projectPreferences;
    }

    private String longTermGoal;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
