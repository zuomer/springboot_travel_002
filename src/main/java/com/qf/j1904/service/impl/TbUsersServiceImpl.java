package com.qf.j1904.service.impl;

import com.qf.j1904.mapper.TbUsersMapper;
import com.qf.j1904.pojo.TbUsers;
import com.qf.j1904.service.TbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TbUsersServiceImpl implements TbUsersService {
    @Autowired
    private TbUsersMapper tbUsersMapper;


    @Override
    public TbUsers loadTbUsers(TbUsers tbUsers) {
        return null;
    }

    @Override
    public String checkType(TbUsers tbUsers) {
        return null;
    }

    @Override
    public boolean saveTbUsers(TbUsers tbUsers) {
        return false;
    }

    @Override
    public boolean checkName(TbUsers tbUsers) {
        return false;
    }

    @Override
    public boolean checkNickName(TbUsers tbUsers) {
        return false;
    }

    @Override
    public boolean apply(TbUsers tbUsers) {
        return false;
    }

    @Override
    public int calcMaxPage(int rows) {
        return 0;
    }

    @Override
    public int calcMaxPageFuzzy(int rows, String keyWords) {
        return 0;
    }

    @Override
    public List<TbUsers> loadAll(int rows, int page) {
        return tbUsersMapper.selectByExample(null);
    }

    @Override
    public boolean addTbUsers(TbUsers tbUsers) {
        return false;
    }

    @Override
    public TbUsers loadById(int userId) {
        return tbUsersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean updateTbUsers(TbUsers tbUsers) {
        return false;
    }

    @Override
    public boolean deleteTbUsers(TbUsers tbUsers) {
        return false;
    }

    @Override
    public boolean addRole(int uid, int rid) {
        return false;
    }

    @Override
    public boolean removeRole(int uid, int rid) {
        return false;
    }

    @Override
    public List<TbUsers> fuzzyQuery(String keyWords, int page, int rows) {
        return null;
    }

    @Override
    public List<TbUsers> loadNotActivatedTbUsers() {
        return null;
    }

    @Override
    public boolean activated(int userId) {
        return false;
    }

    @Override
    public boolean rejectActivated(int userId) {
        return false;
    }

    @Override
    public boolean activate(String nickName) {
        return false;
    }

    @Override
    public String loadEmailByNickName(String nickName) {
        return null;
    }
}
