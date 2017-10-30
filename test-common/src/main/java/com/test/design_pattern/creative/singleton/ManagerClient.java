/**
* @author: wanggy 
* @date: 2017年10月24日 下午6:35:18 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.creative.singleton;

/**
 *
 *
 * 单例模式的主要优点如下：
		 单例模式提供访问对象实例的唯一性。
		 内存中只存在一个对象，对于频繁创建和销毁的对象可以提高性能。

	 单例模式的主要缺点如下：
		 单例类的扩展很困难。
		 单例类的职责过重，充当多角色，在一定程度上违背了“单一职责原则”。

	 如何选用？
		 枚举式  好于  饿汉式
		 静态内部类式  好于 懒汉式

	 常见应用场景
		 ​windows的任务管理器
		 网站的计数器
		 数据库的连接池
		 Application容器也是单例
		 Spring中每个bean默认也是单例
		 Servlet中，每个servlet也是单例



 */
public class ManagerClient {
	public static void main(String[] args) {
		// hungry
		HungryManager hungryManager = HungryManager.getInstance();
		hungryManager.update();

		// lazy
		LazyManager lazyManager = LazyManager.getInstance();
		lazyManager.update();
	}
}
