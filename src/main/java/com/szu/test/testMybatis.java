package com.szu.test;

import com.szu.dao.AccountDao;
import com.szu.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 夏商
 * @create 2021--03--06 21:48
 */
public class testMybatis {

    private InputStream in;
    private SqlSession sessions;

    @Before
    public void before() throws IOException {
        in = Resources.getResourceAsStream("SqlMapping.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(in);
        sessions = sessionFactory.openSession();
    }


    @Test
    public void test1(){

        try {
            //获取代理对象
            AccountDao accountDao = sessions.getMapper(AccountDao.class);
            //查询所有信息
            List<Account> list = accountDao.findAll();
            for (Account account:list){
                System.out.println(account);
            }
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (sessions!=null)
                    sessions.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {

        try {
            //获取代理对象
            AccountDao accountDao = sessions.getMapper(AccountDao.class);

            Account account = new Account();
            account.setMoney(500.0);
            account.setName("张三");

            //保存用户
            accountDao.save(account);

            //提交事务
            sessions.commit();

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (sessions != null)
                    sessions.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
