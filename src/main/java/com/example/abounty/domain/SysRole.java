package com.example.abounty.domain;

/**
 * @author 刘铖
 * @since 2018/5/7
 */


public class SysRole {
    private int id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色等级
     */
    private String roleLevel;
    /**
     * 是否可以被删除
     */
    private boolean isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
