/**
* @author: wanggy 
* @date: 2017年10月25日 上午11:12:42 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.composite;

/**
 *
 *
 * 组合模式优点如下：
		 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
		 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
		 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
		 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。

 	组合模式缺点如下：
	 	在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。

 	开发中应用场景：
		 操作系统中的资源管理器
		 GUI中的容器层次图
		 XML文件解析
		 OA系统中，组织结构的处理
		 Junit单元测试框架
 */
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
