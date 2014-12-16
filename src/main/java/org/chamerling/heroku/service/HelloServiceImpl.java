/**
 * 
 */
package org.chamerling.heroku.service;

/**
 * @author chamerling
 * 
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String input) {
		System.out.println("Hello invoked : " + input);
		return String.format("Hello '%s'", input);
	}

	@Override
	public boolean addPost(String ju, String tanggal, String konent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer substract(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
