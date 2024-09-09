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

    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        if(touristAttractions.add(touristAttraction)) return touristAttraction;
        else return null;
    }


    private void populateAttractions(){
        touristAttractions.add(new TouristAttraction(1, "Tivoli", "Forlystelsespark"));
        touristAttractions.add(new TouristAttraction(2, "Københavns ZOO", "Zoologisk have"));
        touristAttractions.add(new TouristAttraction(3, "Nationalmuseet", "Danmarks statslige, kulturhistoriske hovedmuseum"));
    }

    public List<TouristAttraction> getTouristAttractions() {
        return touristAttractions;
    }


}
