/**
* @author: wanggy 
* @date: 2017年10月24日 下午5:16:28 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.decorator;

public class ConcreteAComponent implements IComponent {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我能飞到3000米高空");
	}
	
}
