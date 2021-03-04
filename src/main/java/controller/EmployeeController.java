package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
//    private static List<Employee> employeeList;
//    static {
//        employeeList = new ArrayList<>();
//        employeeList.add(new Employee("1", "name1", "contact"));
//        employeeList.add(new Employee("2", "name2", "contact"));
//    }

    @GetMapping("/create")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("emp", new Employee());
        return modelAndView;
    }

    @PostMapping("/info")
    public ModelAndView submit(@ModelAttribute Employee employee){
        ModelAndView modelAndView = new ModelAndView("/info");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "name1", "contact"));
        employeeList.add(new Employee("2", "name2", "contact"));
        employeeList.add(employee);
        modelAndView.addObject("list", employeeList);
        return modelAndView;
    }

}
