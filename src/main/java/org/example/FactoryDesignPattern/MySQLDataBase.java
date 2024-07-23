package org.example.FactoryDesignPattern;

public class MySQLDataBase implements  DatabaseContext{
    @Override
    public void connectToDataBase() {
        System.out.println("Connect to My SQL Database");
    }

    @Override
    public void saveQuery() {
        System.out.println("Save query for My SQL Database");
    }

    @Override
    public void setQuery() {
        System.out.println("Set query for My SQL Database");
    }
}
