package cn.exception.handling.myexception;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyException extends Exception  {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }


}
