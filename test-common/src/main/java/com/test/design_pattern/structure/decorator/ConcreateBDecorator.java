/**
* @author: wanggy 
* @date: 2017年10月24日 下午5:18:50 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.decorator;

public class ConcreateBDecorator implements IComponent {

	IComponent component;
	
	public ConcreateBDecorator(IComponent component){
		this.component = component;
	}


	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("\n====================\n我可以在烈日下飞行--开始");
		component.fly();
		System.out.println("我可以在烈日下飞行--结束\n====================\n");
	}

}
