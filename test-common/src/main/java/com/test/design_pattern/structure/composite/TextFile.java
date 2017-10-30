/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:11:39 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

//文本文件类：叶子构件    
public class TextFile extends AbstractFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
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

	@Override
	public void killVirus() {
		System.out.println("----对文本文件'" + name + "'进行杀毒");
	}
}