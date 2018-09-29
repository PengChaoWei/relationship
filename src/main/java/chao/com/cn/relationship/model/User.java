package chao.com.cn.relationship.model;

import java.util.Date;

public class User extends UserKey {
    private String account;

    private String password;

    private String username;

    private Integer employeeid;

    private String employeename;

    private Integer inputmainid;

    private String inputmainname;

    private Date inputmaindate;

    private Date logintime;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public Integer getInputmainid() {
        return inputmainid;
    }

    public void setInputmainid(Integer inputmainid) {
        this.inputmainid = inputmainid;
    }

    public String getInputmainname() {
        return inputmainname;
    }

    public void setInputmainname(String inputmainname) {
        this.inputmainname = inputmainname == null ? null : inputmainname.trim();
    }

    public Date getInputmaindate() {
        return inputmaindate;
    }

    public void setInputmaindate(Date inputmaindate) {
        this.inputmaindate = inputmaindate;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}