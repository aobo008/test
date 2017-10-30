/**
* @author: wanggy 
* @date: 2017年10月18日 下午4:50:04 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.redis;

import com.test.ConstConfig;

import redis.clients.jedis.Jedis;

public class RedisStringJava {

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis(ConstConfig.ServerIP);
		System.out.println("连接成功");
		// 设置 redis 字符串数据
		jedis.set("testStr", "string test");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: " + jedis.get("testStr"));
	}
}
