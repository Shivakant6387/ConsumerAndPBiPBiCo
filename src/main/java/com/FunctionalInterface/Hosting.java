package com.FunctionalInterface;

public class Hosting {
    private int Id;
    private String Name;
    private String url;

    public Hosting(int id, String name, String url) {

        Id = id;
        Name = name;
        this.url = url;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Hosting{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
