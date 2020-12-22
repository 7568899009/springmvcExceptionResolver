package cn.exception.handling.service;

import cn.exception.handling.dao.MyDao;
import cn.exception.handling.myexception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myService")
public class MyService {
@Autowired
    private MyDao myDao;

    public void test1()throws ArithmeticException {
        myDao.exception1();
    }

    public void test2() throws MyException {
        myDao.exception2();













    }
}
