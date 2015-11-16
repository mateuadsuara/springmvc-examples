package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
    @RequestMapping(value = "/*")
    public ModelAndView hello() {
        System.out.println("HelloController: Passing through...");

        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("msg", "Running hello() method");
        return mav;
    }
}
