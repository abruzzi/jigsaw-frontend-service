package com.thoughtworks.frontend.model;

public class Assignment {
    private NamedEntity account;
    private NamedEntity project;
    private Duration duration;

    public NamedEntity getAccount() {
        return account;
    }

    public void setAccount(NamedEntity account) {
        this.account = account;
    }

    public NamedEntity getProject() {
        return project;
    }

    public void setProject(NamedEntity project) {
        this.project = project;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
