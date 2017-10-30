/**
* @author: wanggy 
* @date: 2017年10月18日 下午4:48:09 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.redis;

import com.test.ConstConfig;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis(ConstConfig.ServerIP);
		System.out.println("连接成功");
		// 查看服务是否运行
		System.out.println("服务正在运行: " + jedis.ping());
	}
}
