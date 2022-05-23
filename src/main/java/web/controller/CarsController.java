package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiseImpl;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
    private final CarServiseImpl carServise;

    @Autowired
    public CarsController(CarServiseImpl carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer amount, Model model) {
        if (amount != null) {
            List<Car> requiredCarList = carServise.getCars(carServise.carList(), amount);
            model.addAttribute("requiredCarList", requiredCarList);
        } else {
            model.addAttribute("requiredCarList", carServise.carList());
        }

        return "cars";
    }


}
