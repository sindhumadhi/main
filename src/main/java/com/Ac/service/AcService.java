package com.Ac.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Ac.Ac;
import com.Ac.Dao.AcDao;
import com.Ac.Repositary.AcRepositary;

@Service
public class AcService {
	
@Autowired
AcDao ad;

public String postAll( List<Ac> a)
{
	return ad.postAll(a);
}

public List<Ac> getAll()
{
	return ad.getAll();
}

public List<Ac> getByBrand1(String b)
{
	return ad.getByBrand1(b);
}
public List<Integer> getPrice(int a,int b)
{
	return ad.getPrice(a, b);
}
public List<Object> getGroup()
{
	return ad.getGroup();
}
public List<String> getStart(char a)
{
	return ad.getStart(a);
}
public int getCount()
{
	return ad.getCount();
}
public Ac getMax()
{
	return ad.getMax();
}
public List<Ac> getLength()
{
	return ad.getLength();
}
public List<Ac> getByPrice(int p)
{
	return ad.getByPrice(p);
}
public Ac getById(int a)
{
	return ad.getById(a);
}
}
