package com.company;

public class User {
     private static int id;
    private String name;
    private String email;
    private String username;
    private String password;

    public  User(String name, String email, String username, String password)
    {
        this.id += 1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public String getemail()
    {
        return email;
    }
    public void setemail(String email)
    {
        this.email = email;
    }
    public String getusername()
    {
        return username;
    }
    public void setusername(String username)
    {
        this.username = username;
    }
    public String getpassword()
    {
        return password;
    }
    public void setpassword(String password)
    {
        this.password = password;
    }
    public void passwordLengthChecker(String password)
    {
        if(password.length() < 8 || password.length() > 16)
        {
            System.out.println("Your password is incorrect");
        }
        else
        {
            System.out.println(password);
        }
    }
    public void showinfo()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(username);
        System.out.println(password);

    }
}
