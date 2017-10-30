/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:11:39 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

//文件夹类：容器构件    
public class Folder extends AbstractFile {
	// 定义集合fileList，用于存储AbstractFile类型的成员
	private List<AbstractFile> fileList = new ArrayList<AbstractFile>();
	private String name;

	public Folder(String name) {
		this.name = name;
	}

	public void add(AbstractFile file) {
		fileList.add(file);
	}

	public void remove(AbstractFile file) {
		fileList.remove(file);
	}

	public AbstractFile getChild(int i) {
		return fileList.get(i);
	}

	// 模拟杀毒
	@Override
	public void killVirus() {
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		// 递归调用成员构件的killVirus()方法
		for (AbstractFile item : fileList) {
			item.killVirus();
		}
	}

}
