
package com.debin.userpostsrxjava.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("outcome")
    @Expose
    private String outcome;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("crunchbase_tag")
    @Expose
    private Integer crunchbaseTag;
    @SerializedName("amp_status")
    @Expose
    private String ampStatus;
    @SerializedName("relegenceEntities")
    @Expose
    private List<Object> relegenceEntities = null;
    @SerializedName("relegenceSubjects")
    @Expose
    private List<Object> relegenceSubjects = null;
    @SerializedName("jetpack_publicize_message")
    @Expose
    private String jetpackPublicizeMessage;

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCrunchbaseTag() {
        return crunchbaseTag;
    }

    public void setCrunchbaseTag(Integer crunchbaseTag) {
        this.crunchbaseTag = crunchbaseTag;
    }

    public String getAmpStatus() {
        return ampStatus;
    }

    public void setAmpStatus(String ampStatus) {
        this.ampStatus = ampStatus;
    }

    public List<Object> getRelegenceEntities() {
        return relegenceEntities;
    }

    public void setRelegenceEntities(List<Object> relegenceEntities) {
        this.relegenceEntities = relegenceEntities;
    }

    public List<Object> getRelegenceSubjects() {
        return relegenceSubjects;
    }

    public void setRelegenceSubjects(List<Object> relegenceSubjects) {
        this.relegenceSubjects = relegenceSubjects;
    }

    public String getJetpackPublicizeMessage() {
        return jetpackPublicizeMessage;
    }

    public void setJetpackPublicizeMessage(String jetpackPublicizeMessage) {
        this.jetpackPublicizeMessage = jetpackPublicizeMessage;
    }

}
