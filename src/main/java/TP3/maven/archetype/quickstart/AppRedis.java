package TP3.maven.archetype.quickstart;

import redis.clients.jedis.Jedis;

public class AppRedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		// Adding a set as value

		String cacheKey = "languages";
		jedis.del(cacheKey);
		jedis.sadd(cacheKey, "Java");
		jedis.sadd(cacheKey, "C#");
		jedis.sadd(cacheKey, "Python");// SADD

		// Getting all values in the set: SMEMBERS
		System.out.println("Languages: " + jedis.smembers(cacheKey));
		// Adding new values
		jedis.sadd(cacheKey, "Java");
		jedis.sadd(cacheKey, "Ruby");
		// Getting the values... it doesn't allow duplicates
		System.out.println("Languages: " + jedis.smembers(cacheKey));
	}
}