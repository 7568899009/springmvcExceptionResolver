package cn.exception.handling.myexception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyResolveException implements HandlerExceptionResolver {
    /**
     * 自定义异常
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof java.lang.ArithmeticException) {
            modelAndView.addObject("errorINFO", "算术异常");
            modelAndView.setViewName("/arith.jsp");
            return modelAndView;
        } else if (e instanceof MyException) {
            modelAndView.addObject("errorINFO", "请重试，网络稍微有点慢");
            modelAndView.setViewName("/500.jsp");
            return modelAndView;
        } else {
            modelAndView.addObject("defaultErrorInfo", "网络有问题，请尝试更黄网络");
            modelAndView.setViewName("/500.jsp");
            return modelAndView;
        }
    }
}
