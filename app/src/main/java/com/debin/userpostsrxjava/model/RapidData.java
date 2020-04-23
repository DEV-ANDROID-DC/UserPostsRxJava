
package com.debin.userpostsrxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RapidData {

    @SerializedName("pt")
    @Expose
    private String pt;
    @SerializedName("pct")
    @Expose
    private String pct;

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getPct() {
        return pct;
    }

    public void setPct(String pct) {
        this.pct = pct;
    }

}
