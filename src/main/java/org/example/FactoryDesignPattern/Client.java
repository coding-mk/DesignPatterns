package org.example.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseContext DbContext = DataBaseFactory.getDataBaseContestInstance(DataBaseType.MYSQL);
        DbContext.connectToDataBase();
        DbContext.saveQuery();
        DbContext.setQuery();

        DatabaseContext DbContext1 = DataBaseFactory.getDataBaseContestInstance(DataBaseType.MONGODB);
        DbContext1.connectToDataBase();
        DbContext1.saveQuery();
        DbContext1.setQuery();

    }
}
