/**
* @author: wanggy 
* @date: 2017年10月18日 下午4:51:23 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.redis;

import java.util.List;

import com.test.ConstConfig;

import redis.clients.jedis.Jedis;

public class RedisListJava {

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis(ConstConfig.ServerIP);
		System.out.println("连接成功");
		// 存储数据到列表中
		jedis.lpush("test-list", "list1");
		jedis.lpush("test-list", "list2");
		jedis.lpush("test-list", "list3");
		// 获取存储的数据并输出
		List<String> list = jedis.lrange("test-list", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("列表项为: " + list.get(i));
		}
	}
}
