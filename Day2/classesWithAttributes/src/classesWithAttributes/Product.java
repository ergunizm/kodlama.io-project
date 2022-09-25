package classesWithAttributes;

public class Product {
	// Product ile ilgili bilgileri burda yazarız
	// Her class bir iş yapmalı, o yüzden Add metodunu burda yazamayız
	// Hem attribute tutup hem de metod olmaz, sadece biri

	public Product(int id, String name, String decription, double price, int stockAmount, String renk) {
		System.out.println("Yapici blok calisti!");
		_id = id;
		_name = name;
		_description = decription;
		_price = price;
		_stockAmount = stockAmount;
		_renk = renk;
	}

	// parametresiz ctor
	public Product() {
	}

	// Attribute | Field

	// karışıklıklarda this kullanmak yerine _ kullanabiliriz.
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	// Encapsulation private ve getter setter ile olur
	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		_renk = renk;
	}

	public String getKod() {
		return this._name.substring(0, 1) + _id;
	}

}
