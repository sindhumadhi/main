package com.Ac.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ac.Ac;
import com.Ac.service.AcService;

@RestController
@RequestMapping("/Ac")
public class AcController {
	
	@Autowired
	AcService as;
	
	@PostMapping(value = "/post")
	public String postAll(@RequestBody List<Ac> a)
	{
		return as.postAll(a);
	}
	
	@GetMapping(value = "/getAll")
	public List<Ac> getAll()
	{
		return as.getAll();
	}
	
	
	@GetMapping(value = "/getQuery/{b}")
	public List<Ac> getByBrand1(@PathVariable String b)
	{
		return as.getByBrand1(b);
	}
	
	@GetMapping(value = "/getPrice/{a}/{b}")
	public List<Integer> getPrice(@PathVariable int a,@PathVariable int b)
	{
		return as.getPrice(a, b);
	}
	@GetMapping(value = "/getGroup")
	public List<Object> getGroup()
	{
		return as.getGroup();
	}
	@GetMapping(value = "/getStrat/{a}")
	public List<String> getStart(@PathVariable char a)
	{
		return as.getStart(a);
		
	}
	
	@GetMapping(value = "/getCount")
	public int getCount()
	{
		return as.getCount();
	}
	@GetMapping(value = "/getMax")
	public Ac getMax()
	{
		return as.getMax();
	}
	
	@GetMapping(value = "/getLen")
	public List<Ac> getLength()
	{
		return as.getLength();
	}
	
	@GetMapping(value = "/getP/{p}")
	public List<Ac> getByPrice(@PathVariable int p)
	{
		return as.getByPrice(p);
	}
	
	@GetMapping(value = "/getById/{a}")
	public Ac getById(@PathVariable int a)
	{
		return as.getById(a);
	}
	
	
}
