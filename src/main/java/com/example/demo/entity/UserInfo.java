package com.example.demo.entity;

/**
 * @author :tisen
 * @date :2020/5/3 11:46 下午
 */
public class UserInfo {
    private Integer id;

    private  String name;

    private  Integer age;

    private String acount;

    private String passwd;

    private Integer isDelet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public void setPasswd(String passwd) {this.passwd = passwd; }

    public String getPasswd() {return this.passwd;}

    public String getAcount() {return this.acount; }

    public Integer getIsDelet() {return this.isDelet; }

    @Override
    /**
     * @Description
     * @Author  tisen
     * @Date   2020/5/4 12:03 上午
     * @Param  []
     * @Return      {@link String}
     * @Exception
     *
     */
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "acount='" + acount + '\'' +
                "passwd='" + passwd + '\'' +
                "age='" + age + '\'' +
                "isDelet'" + isDelet + '\'' +
                '}';
    }
}
