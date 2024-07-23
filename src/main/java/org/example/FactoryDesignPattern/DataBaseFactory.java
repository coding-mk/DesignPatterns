package org.example.FactoryDesignPattern;

public class DataBaseFactory {
    public static DatabaseContext getDataBaseContestInstance(DataBaseType dataBaseType){
        if(dataBaseType.equals(DataBaseType.MYSQL)){
            return new MySQLDataBase();
        }else if(dataBaseType.equals(DataBaseType.POSTGRES)){
            return new PostgresDataBase();
        }else if(dataBaseType.equals(DataBaseType.MONGODB)){
            return new MongoDBDataBase();
        }
        return null;
    }
}
