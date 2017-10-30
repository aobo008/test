/**
* @author: wanggy 
* @date: 2017年10月24日 下午6:33:10 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.creative.singleton;

public class LazyManager {
	private static class InstanceHolder {
		static final LazyManager INSTANCE = new LazyManager();
	}

	private LazyManager() {
	}

	public static LazyManager getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public boolean update() {
		System.out.println("lazy manager update success!");
		return true;
	}
}
