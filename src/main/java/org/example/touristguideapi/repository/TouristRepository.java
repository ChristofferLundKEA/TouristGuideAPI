package org.example.touristguideapi.repository;

import org.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> touristAttractions = new ArrayList<>();

    public TouristRepository(){
        populateAttractions();
    }

    public boolean addAttraction(TouristAttraction touristAttraction){
        return touristAttractions.add(touristAttraction);
    }


    private void populateAttractions(){
        touristAttractions.add(new TouristAttraction("Tivoli", "Forlystelsespark"));
        touristAttractions.add(new TouristAttraction("Københavns ZOO", "Zoologisk have"));
    }

    public List<TouristAttraction> getTouristAttractions() {
        return touristAttractions;
    }


}
