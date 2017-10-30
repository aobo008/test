/**
* @author: wanggy 
* @date: 2017年10月24日 下午4:35:04 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.facade;

/**
 * 	外观模式优点：
		减少客户端所需处理的对象数目，使得子系统使用起来更加容易。
		实现了子系统与客户端之间的松耦合关系。
		一个子系统的修改对其他子系统没有任何影响，而且子系统内部变化也不会影响到外观对象。
	
	外观模式缺点：
		不能很好地限制客户端直接使用子系统类，如果对客户端访问子系统类做太多的限制则减少了可变性和灵活性。
		如果设计不当，增加新的子系统可能需要修改外观类的源代码，违背了开闭原则。
	
	实际使用：
		Facade一个典型应用就是数据库JDBC的应用。
 */
public class AdapterClient {
	public static void main(String[] args) {
		new AdapterSystem().combineMethod();
	}
}
