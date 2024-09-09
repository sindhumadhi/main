package com.Ac.Dao;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.Ac.Ac;
import com.Ac.Repositary.AcRepositary;


@Repository
public class AcDao {

	@Autowired
	AcRepositary ar;
	
	public String postAll( List<Ac> a)
	{
		ar.saveAll(a);
		return "posted";
	}
	
	public List<Ac> getAll()
	{
		return ar.findAll();
		
	}
	public List<Ac> getByBrand1(String b)
	{
		return ar.getByBrand1(b);
	}
	public List<Integer> getPrice(int a,int b)
	{
		return ar.getPrice(a, b);
	}
	public List<Object> getGroup()
	{
		return ar.getGroup();
	}
	public List<String> getStart(char a)
	{
		return ar.getStart(a);
	}
	public int getCount()
	{
		return ar.getCount();
	}
	public Ac getMax()
	{
		return ar.getMax();
	}
	public List<Ac> getLength()
	{
		return ar.getLength();
	}
	public List<Ac> getByPrice(int p)
	{
		return ar.getByPrice(p);
	}
	
	public Ac getById(int a)
	{
		return ar.getById(a);
	}
	
}
