package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarServis;

@Controller
public class CarController {

    private final CarServis carServis;

    @Autowired
    public CarController(CarServis carServis) {
        this.carServis = carServis;
    }

    @GetMapping(value = "/cars")
    public String GetCar(@RequestParam (defaultValue = "6") String count, ModelMap model) {

        int count2 = Integer.parseInt(count);


        if (count2 < 6) {
            model.addAttribute("cars", carServis.getCar(count2));
        }else {
            model.addAttribute("cars", carServis.getCar());
        }


        return "cars/cars";
    }


}
