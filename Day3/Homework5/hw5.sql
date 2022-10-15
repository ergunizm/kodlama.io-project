-- ANSII standardında
SELECT * FROM Customers;

select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers;

Select * from Products where categoryId = 1 or categoryId = 3;

Select * from Products where categoryId = 1 and unitPrice>=10;

select * from Products order by CategoryId, ProductName
select * from Products order by UnitPrice desc	--defaultu asc

select count(*) from Products	--Products 'taki satırları say demek

select categoryId,count(*) from Products where UnitPrice>20
group by CategoryID having count(*)<10	--group by yapılan her biri için ayrı bir tablo oluşturmuş gibi olur
-- having ... kümülatif data için filtreler

select Products.ProductID, Products.ProductName, products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

Select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null