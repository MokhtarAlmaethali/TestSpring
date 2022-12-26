package com.yemensoft.model.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *  this class is used to connect to database
 * @author itmok
 *
 */
public class ValueInjectionService {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	private List<String> list;
	private Set<String> set;
	private Map<String,String> map;
	private Properties p;
	
	
	
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void showinfo(){
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
//		list
		/*for(String str:list){
			System.out.println(str);
		}*/
		
		list.forEach(item->{
			System.out.println(item);
		});
		
//		set
		/*for(String str:set){
			System.out.println(str);
		}
		*/
		set.forEach(item->{
			System.out.println(item);
		});
		
//		map
//		arrow function(js)
//		lambda expression
		map.forEach((key,value)->{
			System.out.println(key+"\t"+value);
		});

		p.forEach((key,value)->{
			System.out.println(key+"\t"+value);	
		});
	}
	
	

}
