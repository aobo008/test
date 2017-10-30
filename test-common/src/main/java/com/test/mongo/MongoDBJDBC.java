/**
* @author: wanggy 
* @date: 2017年10月19日 下午1:42:40 
* @version 1.0 
* @parameter  
* @since  
* @return   
*/
package com.test.mongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.test.ConstConfig;

public class MongoDBJDBC {
	private static MongoClient mongoClient;

	public static void main(String args[]) {
		try {
			mongoClient = new MongoClient(ConstConfig.ServerIP, 27017);

			// 连接到数据库
			MongoDatabase mongoDatabase = mongoClient.getDatabase("alf");
			System.out.println("Connect to database successfully");

			MongoCollection<Document> collection = mongoDatabase.getCollection("alf");
			System.out.println("集合 alf 选择成功");

			// 插入文档
			/**
			 * 1. 创建文档 org.bson.Document 参数为key-value的格式 2. 创建文档集合List
			 * <Document> 3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List
			 * <Document>) 插入单个文档可以用 mongoCollection.insertOne(Document)
			 */
			Document document = new Document("title", "MongoDB")
					.append("description", "database")
					.append("likes", 100)
					.append("by", "Fly");
			List<Document> documents = new ArrayList<Document>();
			documents.add(document);
			collection.insertMany(documents);

			// 更新文档 将文档中likes=100的文档修改为likes=200
			//collection.updateMany(Filters.eq("likes", 100), new Document("$set", new Document("likes", 200)));

			// 删除符合条件的第一个文档
			// collection.deleteOne(Filters.eq("likes", 100));
			// 删除所有符合条件的文档
			// collection.deleteMany(Filters.eq("likes", 101));
			// 检索查看结果
			FindIterable<Document> findIterable = collection.find();
			MongoCursor<Document> mongoCursor = findIterable.iterator();
			while (mongoCursor.hasNext()) {
				System.out.println(mongoCursor.next());
			}

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}