/**
* @author: wanggy 
* @date: 2017年10月24日 下午4:35:04 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.facade;

public class AdapterSystem {
	public void combineMethod(){		
		new SubASystem().fly();
		new SubBSystem().swim();
		new SubCSystem().run();
	}
}
