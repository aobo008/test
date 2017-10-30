/**
* @author: wanggy 
* @date: 2017年10月25日 上午10:17:12 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.proxy;

public class RealSubject implements ISubject {

	@Override
	public void connectNetwork() {

		System.out.println("我可以直接联网");
	}

}
