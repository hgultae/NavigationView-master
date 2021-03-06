package com.android4dev.navigationview.model;

/**
 * Created by Tae-3 on 07/01/2016.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpeningHours implements Serializable {

    private Boolean openNow;
    private List<Object> weekdayText = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The openNow
     */
    public Boolean getOpenNow() {
        return openNow;
    }

    /**
     *
     * @param openNow
     * The open_now
     */
    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }

    /**
     *
     * @return
     * The weekdayText
     */
    public List<Object> getWeekdayText() {
        return weekdayText;
    }

    /**
     *
     * @param weekdayText
     * The weekday_text
     */
    public void setWeekdayText(List<Object> weekdayText) {
        this.weekdayText = weekdayText;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
