package com.demo;

public class Payload {
    private String eventName;
    private String hostOrganization;
    private String eventPlanningCompany;
    private String streetAddress;
    private String mailingAddress;
    private Boolean emailPreferred;
    private EventContact primaryEventContact;
    private EventContact alternateContact;
    private String organizationWebSite;
    private Boolean linkToWebSite;
    private String eventLocation;
    private DatesTimes setupDatesTimes;
    private DatesTimes eventDatesTimes;
    private DatesTimes peakDatesTimes;
    private DatesTimes takedownDatesTimes;
    private Boolean alcohol;
    private Boolean fireworks;
    private Boolean roadways;
    private Boolean tentsStages;
    private Boolean children;
    private Boolean food;
    private Boolean heldLastYear;
    private String anticipatedTotalAttendance;
    private String anticipatedPeakAttendance;

    private ActivityTypes obj_ActivityTypes;
    private String eventDescription;

    private Boolean registeredNonProfit;
    private Boolean onBehalfNonProfit;
    private String nonProfitID;
    private Boolean cannabis;

    private String legalEntityName;
    private String operatingName;

    private Boolean charitableOrganization;
    private Boolean businessImprovementArea;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getHostOrganization() {
        return hostOrganization;
    }

    public void setHostOrganization(String hostOrganization) {
        this.hostOrganization = hostOrganization;
    }

    public String getEventPlanningCompany() {
        return eventPlanningCompany;
    }

    public void setEventPlanningCompany(String eventPlanningCompany) {
        this.eventPlanningCompany = eventPlanningCompany;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Boolean getEmailPreferred() {
        return emailPreferred;
    }

    public void setEmailPreferred(Boolean emailPreferred) {
        this.emailPreferred = emailPreferred;
    }

    public EventContact getPrimaryEventContact() {
        return primaryEventContact;
    }

    public void setPrimaryEventContact(EventContact primaryEventContact) {
        this.primaryEventContact = primaryEventContact;
    }

    public EventContact getAlternateContact() {
        return alternateContact;
    }

    public void setAlternateContact(EventContact alternateContact) {
        this.alternateContact = alternateContact;
    }

    public String getOrganizationWebSite() {
        return organizationWebSite;
    }

    public void setOrganizationWebSite(String organizationWebSite) {
        this.organizationWebSite = organizationWebSite;
    }

    public Boolean getLinkToWebSite() {
        return linkToWebSite;
    }

    public void setLinkToWebSite(Boolean linkToWebSite) {
        this.linkToWebSite = linkToWebSite;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public DatesTimes getSetupDatesTimes() {
        return setupDatesTimes;
    }

    public void setSetupDatesTimes(DatesTimes setupDatesTimes) {
        this.setupDatesTimes = setupDatesTimes;
    }

    public DatesTimes getEventDatesTimes() {
        return eventDatesTimes;
    }

    public void setEventDatesTimes(DatesTimes eventDatesTimes) {
        this.eventDatesTimes = eventDatesTimes;
    }

    public DatesTimes getPeakDatesTimes() {
        return peakDatesTimes;
    }

    public void setPeakDatesTimes(DatesTimes peakDatesTimes) {
        this.peakDatesTimes = peakDatesTimes;
    }

    public DatesTimes getTakedownDatesTimes() {
        return takedownDatesTimes;
    }

    public void setTakedownDatesTimes(DatesTimes takedownDatesTimes) {
        this.takedownDatesTimes = takedownDatesTimes;
    }

    public Boolean getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    public Boolean getFireworks() {
        return fireworks;
    }

    public void setFireworks(Boolean fireworks) {
        this.fireworks = fireworks;
    }

    public Boolean getRoadways() {
        return roadways;
    }

    public void setRoadways(Boolean roadways) {
        this.roadways = roadways;
    }

    public Boolean getTentsStages() {
        return tentsStages;
    }

    public void setTentsStages(Boolean tentsStages) {
        this.tentsStages = tentsStages;
    }

    public Boolean getChildren() {
        return children;
    }

    public void setChildren(Boolean children) {
        this.children = children;
    }

    public Boolean getFood() {
        return food;
    }

    public void setFood(Boolean food) {
        this.food = food;
    }

    public Boolean getHeldLastYear() {
        return heldLastYear;
    }

    public void setHeldLastYear(Boolean heldLastYear) {
        this.heldLastYear = heldLastYear;
    }

    public String getAnticipatedTotalAttendance() {
        return anticipatedTotalAttendance;
    }

    public void setAnticipatedTotalAttendance(String anticipatedTotalAttendance) {
        this.anticipatedTotalAttendance = anticipatedTotalAttendance;
    }

    public String getAnticipatedPeakAttendance() {
        return anticipatedPeakAttendance;
    }

    public void setAnticipatedPeakAttendance(String anticipatedPeakAttendance) {
        this.anticipatedPeakAttendance = anticipatedPeakAttendance;
    }

    public ActivityTypes getObj_ActivityTypes() {
        return obj_ActivityTypes;
    }

    public void setObj_ActivityTypes(ActivityTypes obj_ActivityTypes) {
        this.obj_ActivityTypes = obj_ActivityTypes;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Boolean getRegisteredNonProfit() {
        return registeredNonProfit;
    }

    public void setRegisteredNonProfit(Boolean registeredNonProfit) {
        this.registeredNonProfit = registeredNonProfit;
    }

    public Boolean getOnBehalfNonProfit() {
        return onBehalfNonProfit;
    }

    public void setOnBehalfNonProfit(Boolean onBehalfNonProfit) {
        this.onBehalfNonProfit = onBehalfNonProfit;
    }

    public String getNonProfitID() {
        return nonProfitID;
    }

    public void setNonProfitID(String nonProfitID) {
        this.nonProfitID = nonProfitID;
    }

    public Boolean getCannabis() {
        return cannabis;
    }

    public void setCannabis(Boolean cannabis) {
        this.cannabis = cannabis;
    }

    public String getLegalEntityName() {
        return legalEntityName;
    }

    public void setLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }

    public String getOperatingName() {
        return operatingName;
    }

    public void setOperatingName(String operatingName) {
        this.operatingName = operatingName;
    }

    public Boolean getCharitableOrganization() {
        return charitableOrganization;
    }

    public void setCharitableOrganization(Boolean charitableOrganization) {
        this.charitableOrganization = charitableOrganization;
    }

    public Boolean getBusinessImprovementArea() {
        return businessImprovementArea;
    }

    public void setBusinessImprovementArea(Boolean businessImprovementArea) {
        this.businessImprovementArea = businessImprovementArea;
    }

}
