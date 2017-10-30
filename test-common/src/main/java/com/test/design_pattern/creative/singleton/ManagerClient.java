/**
* @author: wanggy 
* @date: 2017年10月24日 下午6:35:18 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.creative.singleton;

public class ManagerClient {
	public static void main(String[] args) {
		// hungry
		HungryManager hungryManager = HungryManager.getInstance();
		hungryManager.update();

		// lazy
		LazyManager lazyManager = LazyManager.getInstance();
		lazyManager.update();
	}
}
