package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class Hello {
    @RequestMapping(value = "/*")
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("countries", getCountries());

        return mav;
    }

    private Map<String, String> getCountries() {
        Map<String,String> countries = new LinkedHashMap<String,String>();
        countries.put("US", "United Stated");
        countries.put("CHINA", "China");
        countries.put("SG", "Singapore");
        countries.put("MY", "Malaysia");
        return countries;
    }
}
