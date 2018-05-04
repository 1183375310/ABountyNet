package com.example.abounty.domain;
/**
 *
 * @author 刘铖
 * @since 2018-04-08
 **/
public class SysUser {
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 密码
     */
    private String password;
    /**
     * 账号类型
     *
     * 注册用户 、系统用户
     */
    private String accountType;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 身份证号
     */
    private String certNo;
    /**
     * 手机号
     */
    private String phoneNo;
    /**
     * 常用地址
     */
    private String usedAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUsedAddress() {
        return usedAddress;
    }

    public void setUsedAddress(String usedAddress) {
        this.usedAddress = usedAddress;
    }
}
