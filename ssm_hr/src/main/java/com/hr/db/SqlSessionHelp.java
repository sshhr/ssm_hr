package com.hr.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionHelp {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static ThreadLocal<SqlSession> tl = new ThreadLocal<SqlSession>(); 
	static{
		InputStream is = null;
		try {
			is = SqlSessionHelp.class.getClassLoader().getResourceAsStream("sqlmap-config.xml"); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(is!=null){
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static SqlSessionFactory getsqlSessionFactory(){
		return sqlSessionFactory;
	}
	
	public static SqlSession getSqlSession(){
		SqlSession sqlSession = tl.get();
		if(sqlSession==null){
			sqlSession = sqlSessionFactory.openSession();
			tl.set(sqlSession);
		}
		return sqlSession;
	}
	
	public static void close(SqlSession sqlSession){
		sqlSession.close();
	}
	
}
