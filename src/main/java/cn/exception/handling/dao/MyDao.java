package cn.exception.handling.dao;

import cn.exception.handling.myexception.MyException;
import org.springframework.stereotype.Repository;

@Repository("myDao")
public class MyDao {
    public void exception1()throws ArithmeticException {
        int i = 1 / 0;
    }

    public void exception2() throws MyException {
        throw new MyException();
    }
}
