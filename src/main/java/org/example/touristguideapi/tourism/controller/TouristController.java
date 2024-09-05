package org.example.touristguideapi.tourism.controller;

import ch.qos.logback.core.model.Model;
import org.example.touristguideapi.model.TouristAttraction;
import org.example.touristguideapi.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public List<TouristAttraction> getAttractions() {
        return touristService.get();
    }

    @PostMapping("/add")
    public boolean createAttraction(@RequestBody TouristAttraction touristAttraction) {
        return touristService.post(touristAttraction);
    }


}
