package cn.exception.handling.controller;

import cn.exception.handling.myexception.MyException;
import cn.exception.handling.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @Autowired
    private MyService myService;
    @RequestMapping(value = "/shows1", produces = {"text/html;charset=UTF-8", "application/json;charset=UTF-8"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView show1(ModelAndView modelAndView)throws ArithmeticException {
        myService.test1();
        modelAndView.addObject("errorINFO", "这个是运算异常❎");
        modelAndView.setViewName("index");
        return modelAndView;




    }

    @RequestMapping(value = "/shows2", produces = {"text/html;charset=UTF-8", "application/json;charset=UTF-8"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView show2(ModelAndView modelAndView) throws MyException {
         myService.test2();
        modelAndView.addObject("errorINFO", "这个是自定义异常❌");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
