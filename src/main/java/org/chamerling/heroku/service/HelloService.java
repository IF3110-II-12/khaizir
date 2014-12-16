/**
 * 
 */
package org.chamerling.heroku.service;

import javax.jws.WebService;

/**
 * @author chamerling
 * 
 */
@WebService
public interface HelloService {

	String sayHi(String input);
	
	boolean addPost(String ju,String tanggal,String konent);
	
	Integer substract(Integer a,Integer b);
}
