package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiseImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
    List<Car> carList = Arrays.asList(new Car("color1", "manufacturer1", 1)
            , new Car("color2", "manufacturer2", 2)
            , new Car("color3", "manufacturer3", 3)
            , new Car("color4", "manufacturer4", 4)
            , new Car("color5", "manufacturer5", 5));

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer amount, Model model) {
        if (amount != null) {
            CarServiseImpl carServise = new CarServiseImpl();
            List<Car> requiredCarList = carServise.getCars(carList, amount);
            model.addAttribute("requiredCarList", requiredCarList);
        } else {
            model.addAttribute("requiredCarList", carList);
        }

        return "cars";
    }


}
