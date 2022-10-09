package dataAccess;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void Add() {
        //DB erişim kodları
        System.out.println("Hibernate ile kategori eklendi");
    }
}
