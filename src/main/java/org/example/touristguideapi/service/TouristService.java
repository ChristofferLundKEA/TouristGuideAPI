package org.example.touristguideapi.service;

import org.example.touristguideapi.model.TouristAttraction;
import org.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public TouristAttraction getAttractionByName(String name) {
        for (TouristAttraction attractions : touristRepository.getTouristAttractions()){
            if (attractions.getName().equals(name)){
                return attractions;
            }
        }return null;
    }

    public List<TouristAttraction> get() {
        return touristRepository.getTouristAttractions();
    }

    public TouristAttraction post(TouristAttraction touristAttraction) {
        return touristRepository.addAttraction(touristAttraction);
    }


    public TouristAttraction updateAttraction(TouristAttraction touristAttraction) {
        for (TouristAttraction touristAttractionFromRepository : touristRepository.getTouristAttractions()) {
            if (touristAttractionFromRepository.getTouristAttractionId() == (touristAttraction.getTouristAttractionId())) {
                touristAttractionFromRepository.setName(touristAttraction.getName());
                touristAttractionFromRepository.setDescription(touristAttraction.getDescription());
                return touristAttractionFromRepository;
            }
        }
        return null;
    }

    public void deleteAttraction(String name) { // Bruger Iterator da jeg ikke måtte modify List i loop
        Iterator<TouristAttraction> iterator = touristRepository.getTouristAttractions().iterator();
        while (iterator.hasNext()) {
            TouristAttraction touristAttraction = iterator.next();
            if (touristAttraction.getName().equals(name)) {
                iterator.remove();
                return;
            }
        }
    }

//    public int GenerateUniqueAttractionID(){
//        return touristRepository.getTouristAttractions().size() + 1;
//    }
}
