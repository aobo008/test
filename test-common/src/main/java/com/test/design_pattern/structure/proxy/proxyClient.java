/**
* @author: wanggy 
* @date: 2017年10月25日 上午10:45:14 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.proxy;

/**
 * 代理模式优点：
		能够协调调用者和被调用者，在一定程度上降低了系统的耦合度。
		客户端可以针对抽象主题角色进行编程，增加和更换代理类无须修改源代码，符合开闭原则，系统具有较好的灵活性和可扩展性。
		a) 远程代理为位于两个不同地址空间对象的访问提供了一种实现机制，可以将一些消耗资源较多的对象和操作移至性能更好的计算机上，提高系统的整体运行效率。
		b) 虚拟代理通过一个消耗资源较少的对象来代表一个消耗资源较多的对象，可以在一定程度上节省系统的运行开销。
		c) 缓冲代理为某一个操作的结果提供临时的缓存存储空间，以便在后续使用中能够共享这些结果，优化系统性能，缩短执行时间。
		d) 保护代理可以控制对一个对象的访问权限，为不同用户提供不同级别的使用权限。
	
	代理模式缺点：
		由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢，例如保护代理。
		实现代理模式需要额外的工作，而且有些代理模式的实现过程较为复杂，例如远程代理。

	应用场景：
		 1.静态代理（静态定义代理类，我们自己静态定义的代理类。比如我们自己定义一个明星的经纪人类）
		 2.动态代理（通过程序动态生成代理类，该代理类不是我们自己定义的。而是由程序自动生成）比较重要！！
		 JDK自带的动态代理
		 javaassist字节码操作库实现
		 CGLIB
		 ASM（底层使用指令，可维护性较差）
 */
public class proxyClient {
	public static void main(String[] args){
		//原生对象
		ISubject realSubject = new RealSubject();
		realSubject.connectNetwork();
		
		//代理对象
		ISubject proxySubject = new ProxySubject();
		proxySubject.connectNetwork();
		
	}
}
