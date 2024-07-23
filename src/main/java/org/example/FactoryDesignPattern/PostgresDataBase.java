package org.example.FactoryDesignPattern;

public class PostgresDataBase implements DatabaseContext{
    @Override
    public void connectToDataBase() {
        System.out.println("Connect to Postgres Database");
    }

    @Override
    public void saveQuery() {
        System.out.println("Save query for Postgres Database");
    }

    @Override
    public void setQuery() {
        System.out.println("Set query for Postgres Database");
    }
}
