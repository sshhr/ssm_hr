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
	/**
	 * 申请录用
	 */
	public static int RECOMMEND_APPLY = 5;
	/**
	 * 释放简历
	 */
	public static int RECOMMEND_RELEASE = 5;
	/**
	 * 录用通过
	 */
	public static int RECOMMEND_PASS = 6;
	/**
	 * 录用不通过
	 */
	public static int RECOMMEND_NOPASS = 7;
	/**
	 * 已考试未审核
	 */
	public static int RECOMMEND_TESTED = 8;
}
