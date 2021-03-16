package com.szu.test;

import com.szu.domain.Account;
import com.szu.service.AccountService;
import com.szu.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 夏商
 * @create 2021--03--06 20:13
 */
public class testSpring {

    @Test
    public void testDemo1(){
        //加载配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountServiceImpl accountService = (AccountServiceImpl) app.getBean("accountService");
        accountService.findAll();
    }

}
