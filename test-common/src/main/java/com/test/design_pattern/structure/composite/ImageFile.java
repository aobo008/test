/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:11:39 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

//图像文件类：叶子构件    
public class ImageFile extends AbstractFile {
	private String name;

	public ImageFile(String name) {
		this.name = name;
	}

	// 模拟杀毒
	public void killVirus() {
		System.out.println("----对图像文件'" + name + "'进行杀毒");
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}