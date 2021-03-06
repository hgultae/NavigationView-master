package com.android4dev.navigationview.model;

/**
 * Created by Tae-3 on 07/01/2016.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiData implements Serializable{

    private List<Object> htmlAttributions = new ArrayList<Object>();
    private List<Result> results = new ArrayList<Result>();
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The htmlAttributions
     */
    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    /**
     *
     * @param htmlAttributions
     * The html_attributions
     */
    public void setHtmlAttributions(List<Object> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
