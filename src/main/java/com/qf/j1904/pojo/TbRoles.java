package com.qf.j1904.pojo;

public class TbRoles {
    private Integer roleid;

    private String rolename;

    private String roletype;

    private Integer ifvalid;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }

    public Integer getIfvalid() {
        return ifvalid;
    }

    public void setIfvalid(Integer ifvalid) {
        this.ifvalid = ifvalid;
    }
}