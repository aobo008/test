/**
* @author: wanggy 
* @date: 2017年10月18日 下午4:52:45 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.redis;

import java.util.Iterator;
import java.util.Set;

import com.test.ConstConfig;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis(ConstConfig.ServerIP);
		System.out.println("连接成功");

		// 获取数据并输出
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}
}
