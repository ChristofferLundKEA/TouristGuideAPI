package org.example.touristguideapi.model;

public class TouristAttraction {
    private int touristAttractionId;
    private String name;
    private String description;

    public TouristAttraction(int touristAttractionId,String name, String description) {
        this.touristAttractionId = touristAttractionId;
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTouristAttractionId() {
        return touristAttractionId;
    }

//    public void setTouristAttractionId(int touristAttractionId) {
//        this.touristAttractionId = touristAttractionId;
//    }
}
