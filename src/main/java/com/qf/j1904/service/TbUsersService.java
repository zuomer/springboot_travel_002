package com.qf.j1904.service;

import com.qf.j1904.pojo.TbUsers;

import java.util.List;

public interface TbUsersService {
    public TbUsers loadTbUsers(TbUsers tbUsers);
    public String checkType(TbUsers tbUsers);
    public boolean saveTbUsers(TbUsers tbUsers);
    public boolean checkName(TbUsers tbUsers);
    public boolean checkNickName(TbUsers tbUsers);
    public boolean apply(TbUsers tbUsers);
    public int calcMaxPage(int rows);
    public int calcMaxPageFuzzy(int rows,String keyWords);
    public List<TbUsers> loadAll(int rows,int page);
    public boolean addTbUsers(TbUsers tbUsers);
    public TbUsers loadById(int userId);
    public boolean updateTbUsers(TbUsers tbUsers);
    public boolean deleteTbUsers(TbUsers tbUsers);
    public boolean addRole(int uid,int rid);
    public boolean removeRole(int uid,int rid);
    public List<TbUsers> fuzzyQuery(String keyWords,int page,int rows);
    public List<TbUsers> loadNotActivatedTbUsers();
    public boolean activated(int userId);
    public boolean rejectActivated(int userId);
    public boolean activate(String nickName);
    public String loadEmailByNickName(String nickName);
}
