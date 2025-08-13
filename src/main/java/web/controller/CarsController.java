package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servis.CarsServis;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    private final CarsServis carsServis;

    @Autowired
    public CarsController(CarsServis carsServis) {
        this.carsServis = carsServis;
    }

    @GetMapping(value = "/cars")
    public String GetCars(HttpServletRequest request, ModelMap model) {

        int count;

        if (request.getParameter("count") != null) {
            count = Integer.parseInt(request.getParameter("count"));
            if (count < 6) {
                model.addAttribute("cars", carsServis.getCars(count));
            } else  {
                model.addAttribute("cars", carsServis.getCars());
            }
        }else {
            model.addAttribute("cars", carsServis.getCars());
        }

        return "cars/cars";
    }


}
