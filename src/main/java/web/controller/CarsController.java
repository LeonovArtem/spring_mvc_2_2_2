package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsProvider;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carsList(@RequestParam(value = "count", required = false, defaultValue = "5") String limit, ModelMap model, CarsProvider carsProvider) {
        model.addAttribute("cars", carsProvider.getCars(Integer.parseInt(limit)));

        return "cars";
    }
}
