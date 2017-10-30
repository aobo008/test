/**
* @author: wanggy 
* @date: 2017年10月24日 下午4:34:13 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.flyweight;

/**
 * 	享元模式优点：
		可以极大减少内存中对象的数量，使得相同或相似对象在内存中只保存一份，从而可以节约系统资源，提高系统性能。
		享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
	
	享元模式缺点：
		享元模式使得系统变得复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
		为了使对象可以共享，享元模式需要将享元对象的部分状态外部化，而读取外部状态将使得运行时间变长。
	
	实际使用：
		 在Java中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。
		 在Java中字符串常量都是存在常量池中的，Java会确保一个字符串常量在常量池中只有一个拷贝

		 比如线程池，数据库连接池，这些都利用享元模式共享了部分属性，在池中操作。
		 String类的设计也是享元模式

 */
public class TicketFlyweightClient {
	public static void main(String[] args) {
		// simple flyweight
		TicketFlyweightFactory.getTicket("北京车站", "北京", "上海").showTicketInfo("1点的票\n======================\n");
		TicketFlyweightFactory.getTicket("武汉车站", "武汉", "上海").showTicketInfo("2点的票\n======================\n");
		TicketFlyweightFactory.getTicket("北京车站", "北京", "上海").showTicketInfo("3点的票\n======================\n");
	}
}