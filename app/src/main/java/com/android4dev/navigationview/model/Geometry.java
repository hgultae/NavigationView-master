package com.android4dev.navigationview.model;

/**
 * Created by Tae-3 on 07/01/2016.
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Geometry implements Serializable {

    private Location location;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
