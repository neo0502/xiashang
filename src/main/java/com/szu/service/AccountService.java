package com.szu.service;

import com.szu.domain.Account;

import java.util.List;

/**
 * @author 夏商
 * @create 2021--03--06 20:04
 */
public interface AccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     *保存账户信息
     * @return
     */
    public void save(Account account);
}
