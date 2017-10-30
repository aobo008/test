/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:08:45 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

//抽象文件类：抽象构件    
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);

	public abstract void remove(AbstractFile file);

	public abstract AbstractFile getChild(int i);

	public abstract void killVirus();

}