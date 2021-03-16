package com.szu.service.impl;


import com.szu.dao.AccountDao;
import com.szu.domain.Account;
import com.szu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 夏商
 * @create 2021--03--06 20:04
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao  accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.save(account);
    }
}
