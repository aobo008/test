/**
* @author: wanggy 
* @date: 2017年10月24日 下午4:34:13 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.design_pattern.structure.flyweight;

import java.math.BigDecimal;

public class BusTicketFlyweightImpl implements ITicketFlyweight {

	public String innerIdentity;

	public String from; // 始发地
	public String to;// 目的地
	public String siteType;// 座位type
	public BigDecimal price;// 价格

	public BusTicketFlyweightImpl(String innerIdentity, String from, String to) {
		this.innerIdentity = innerIdentity;
		this.from = from;
		this.to = to;
	}

	public void showTicketInfo(String outerState) {
		System.out.println(
				"这是 " + this.innerIdentity + " 从 " + this.from + " 到 " + this.to + outerState);
	}
}