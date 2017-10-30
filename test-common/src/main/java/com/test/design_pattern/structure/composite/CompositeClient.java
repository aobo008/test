/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:12:42 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

public class CompositeClient {
	public static void main(String[] args) {
	
		//文件夹定义
		AbstractFile folder1, folder2, folder3, folder4;
		//文件定义
		AbstractFile file1, file2, file3, file4, file5;
		
		folder1 = new Folder("资料文件夹");
		folder2 = new Folder("图像文件夹");
		folder3 = new Folder("文本文件夹");
		folder4 = new Folder("特殊文件夹");
		//资料文件夹  添加内容
		folder1.add(folder2);
		folder1.add(folder3);
		//图像文件夹   添加内容
		folder2.add(folder4);
		
		//图像文件夹  添加内容
		file1 = new ImageFile("小龙女.jpg");
		file2 = new ImageFile("张无忌.jpg");		
		folder2.add(file1);
		folder2.add(file2);
		
		//文本文件夹  添加内容
		file3 = new TextFile("九阴真经.txt");
		file4 = new TextFile("葵花宝典.doc");
		folder3.add(file3);
		folder3.add(file4);
		
		//特殊文件夹  添加内容
		file5 = new TextFile("功夫2.rmvb");
		folder4.add(file5);

		// 从“资料文件夹”节点开始进行杀毒操作
		folder1.killVirus();
		System.out.println("");
	}
}
