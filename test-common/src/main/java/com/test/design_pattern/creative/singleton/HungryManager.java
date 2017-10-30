/**
* @author: wanggy 
* @date: 2017年10月24日 下午6:33:10 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.creative.singleton;

public class HungryManager {
	private static HungryManager mInstance = new HungryManager();

	private HungryManager() {
	}

	public static HungryManager getInstance() {
		return mInstance;
	}

	public boolean update() {
		System.out.println("hungry manager update success!");
		return true;
	}
}
