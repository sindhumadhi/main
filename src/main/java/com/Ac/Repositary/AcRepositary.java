package com.Ac.Repositary;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Ac.Ac;

public interface AcRepositary extends JpaRepository<Ac, Integer>
{
	@Query(value = "select *from ac_db where brand = ?",nativeQuery = true)
	public List<Ac> getByBrand1(String b);
	
	@Query(value = "select price from ac_db where price between ? and ? order by price",nativeQuery = true)
	public List<Integer> getPrice(int a,int b);
	
	@Query( value = "select brand,count(brand) from ac_db group by brand",nativeQuery = true)
	public List<Object> getGroup();
	
	@Query(value = "select brand from ac_db where brand like ?% ",nativeQuery = true)
	public List<String> getStart(char a);
	
	@Query(value = " select count(brand) from ac_db ",nativeQuery = true)
	public int getCount();
	
	@Query( value = " select * from ac_db where price=(select max(price) from ac_db where price<(select max(price) from ac_db))  ",nativeQuery = true )
	public Ac getMax();
	
	@Query( value = "select * from ac_db where length(brand)<=2",nativeQuery = true)
	public List<Ac> getLength();
	
	@Query( value = "select * from ac_db where id=?",nativeQuery = true)
	public Ac getById(int a);
	
	//jQuery
	
	@Query( value = "select a from Ac a where a.price > :p")
	public List<Ac> getByPrice(@Param("p")int p);
	

}
