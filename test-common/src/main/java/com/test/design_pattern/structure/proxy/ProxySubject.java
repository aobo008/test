/**
* @author: wanggy 
* @date: 2017年10月25日 上午10:17:12 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.proxy;

public class ProxySubject implements ISubject {

	@Override
	public void connectNetwork() {
		System.out.println("\n========================\n我是代理");
		new RealSubject().connectNetwork();
		System.out.println("========================\n");
	}

}
