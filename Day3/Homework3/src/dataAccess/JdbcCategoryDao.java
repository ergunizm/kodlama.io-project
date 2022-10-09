package dataAccess;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void Add() {
        //DB erişim kodları
        System.out.println("JDBC ile kategori eklendi");
    }
}
