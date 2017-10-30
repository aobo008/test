package com.test.design_pattern.creative.builder;

/**
 * Created by wanggy on 2017/10/27.
 */
public class Product {
    private long id;
    private String name;
    private int level;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("\rid="+id+"\n"
                            +"name="+name+"\n"
                            +"level="+level+"\n"
                            +"description="+description+"\n");

    }
}
