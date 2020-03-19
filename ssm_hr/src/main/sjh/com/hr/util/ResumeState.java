package com.hr.util;
/**
 * 简历状态
 * @author sjh
 *
 */
public interface ResumeState {
	/**
	 * 初始
	 */
	public static int RECOMMEND_INITIAL = 0;
	/**
	 * 推荐面试
	 */
	public static int RECOMMEND_INTERVIEW = 1;
	/**
	 * 推荐笔试
	 */
	public static int RECOMMEND_TEST = 2;
	/**
	 * 建议录用
	 */
	public static int RECOMMEND_HIRING = 3;
	/**
	 * 简历移除
	 */
	public static int RECOMMEND_REMOVE = 4;
}
