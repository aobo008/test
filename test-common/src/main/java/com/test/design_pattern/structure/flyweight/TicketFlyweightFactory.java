/**
* @author: wanggy 
* @date: 2017年10月24日 下午4:34:13 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class TicketFlyweightFactory {
	private static ConcurrentHashMap<String, ITicketFlyweight> map = new ConcurrentHashMap<String, ITicketFlyweight>();

	private TicketFlyweightFactory() {
	}

	public static ITicketFlyweight getTicket(String innerIdentity, String from, String to) {

		ITicketFlyweight ticket = map.get(innerIdentity);

		if (ticket == null) {
			System.out.println("使用新建对象： " + innerIdentity);
			ticket = new BusTicketFlyweightImpl(innerIdentity, from, to);
			map.put(innerIdentity, ticket);
		} else {
			System.out.println("使用缓存对象： " + innerIdentity);
		}

		return ticket;
	}
}