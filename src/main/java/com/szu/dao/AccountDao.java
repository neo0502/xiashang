package com.szu.dao;

import com.szu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户DAO
 * @author 夏商
 * @create 2021--03--06 20:02
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     *保存账户信息
     * @return
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void save(Account account);
}
