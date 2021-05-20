package www.bmsit.loginatuh;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class covidModel {

    @SerializedName("provinceState")
    @Expose
    String provinceState;

    @SerializedName("countryRegion")
    @Expose
    String countryRegion;

    @SerializedName("confirmed")
    @Expose
    int confirmed;

    @SerializedName("active")
    @Expose
    int active;

    @SerializedName("deaths")
    @Expose
    int deaths;

    public String getProvinceState() {
        return provinceState;
    }

    public void setProvinceState(String provinceState) {
        this.provinceState = provinceState;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public covidModel(String provinceState, String countryRegion, int confirmed, int active, int deaths) {
        this.provinceState = provinceState;
        this.countryRegion = countryRegion;
        this.confirmed = confirmed;
        this.active = active;
        this.deaths = deaths;

    }
}
