package org.example.touristguideapi.service;

import org.example.touristguideapi.model.TouristAttraction;
import org.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> get() {
        return touristRepository.getTouristAttractions();
    }

    public boolean post(TouristAttraction touristAttraction) {
        return touristRepository.addAttraction(touristAttraction);
    }
}
