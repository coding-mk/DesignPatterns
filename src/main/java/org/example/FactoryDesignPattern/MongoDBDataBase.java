package org.example.FactoryDesignPattern;

public class MongoDBDataBase implements DatabaseContext{
    @Override
    public void connectToDataBase() {
        System.out.println("Connect to MongoDB Database");
    }

    @Override
    public void saveQuery() {
        System.out.println("Save query for MongoDB Database");
    }

    @Override
    public void setQuery() {
        System.out.println("Set query for MongoDB Database");
    }
}
