package com.vitalykuleshov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }


    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

//        Employee emp = new Employee();
//        emp.setName("Wtire your name");
//        emp.setSurname("Wtire your surname");
//        emp.setSalary(0);

        model.addAttribute("employee",  new Employee());
        return "ask-emp-details-view";
    }



    @GetMapping("/showDetails")
    public String showEmpDetais(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){


        if (bindingResult.hasErrors())
        {
            return "ask-emp-details-view";
        } else
        {
            return "show-emp-details-view";
        }
    }
}
