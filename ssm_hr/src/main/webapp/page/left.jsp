<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/table.css" type="text/css">
		<style>
a{ CURSOR: hand}
.TreePoint {
	BACKGROUND-POSITION: left 0%; BACKGROUND-IMAGE: url('img/point.gif'); WIDTH: 22px; BACKGROUND-REPEAT: repeat-y
}
.TreeBgColor {
	BACKGROUND-COLOR: #f1f1f1
}
.TreeSign {
	CURSOR: hand
}
.ExplainON {
	FONT-SIZE: 9pt; MARGIN: 10%; CURSOR: hand; COLOR: #000000; FONT-FAMILY: Arial; WHITE-SPACE: nowrap; BACKGROUND-COLOR: #ffffff; TEXT-DECORATION: none
}
.ExplainOFF {
	FONT-SIZE: 9pt; MARGIN: 10%; CURSOR: hand; COLOR: #000000; FONT-FAMILY: Arial; WHITE-SPACE: nowrap; TEXT-DECORATION: none
}
.style1 {
	FONT-SIZE: 12px
}
</style>
</head>
<script language="javascript">
	function plusORminus(span_name,pic_name)
	{
		span_name.style.display=='block'?pic_name.src='images/plus22.gif':pic_name.src='images/minus33.gif';
	}
	function noneORblock(span_name)
	{
		span_name.style.display=((span_name.style.display=='block')?'none':'block');
	}
</script>
<body>
<table width="100%" border="0">
			<tr>
				<th colspan="2" bgcolor="#1A98F1">
					<font size="+1" color="white">人力资源</font>
				</th>
			</tr>
			<!-- 客户化设置 -->
			<tr>
				<td width="2%">
					<a onClick="noneORblock(config)"><img src="images/plus22.gif"
							onClick="plusORminus(config,config_pic)" id="config_pic">
					</a>
				</td>
				<td>
					客户化设置
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="config">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<a onClick="noneORblock(config_file)"><img
											src="images/plus22.gif"
											onClick="plusORminus(config_file,config_file_pic)"
											id="config_file_pic">
									</a>
								</td>
								<td width="98%">
									人力资源档案管理设置
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="config_file">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="client/first_kind.jsp"
														target="mainFrame">I级机构设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="client/second_kind.jsp"
														target="mainFrame">II级机构设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="client/third_kind.jsp" target="mainFrame">III级机构设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/client/toProfessionDesign.do" target="mainFrame">职称设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/client/toMajorKind.do"
														target="mainFrame">职位分类设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/client/toMajor.do"
														target="mainFrame">职位设置</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="client/public_char.jsp"
														target="mainFrame">公共属性设置</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(config_salary)"><img
											src="images/plus22.gif"
											onClick="plusORminus(config_salary,config_salary_pic)"
											id="config_salary_pic">
									</a>
								</td>
								<td>
									薪酬管理设置
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="config_salary">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
												<a href="client/salary_item.jsp"
														target="mainFrame">薪酬项目设置</a>
													
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
												<a href="client/salary_grant_mode.jsp"
														target="mainFrame">薪酬发放方式设置</a>
													
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
												
													订单销售绩效计算方式
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													零售绩效计算方式
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(config_question)"><img
											src="images/plus22.gif"
											onClick="plusORminus(config_question,config_question_pic)"
											id="config_question_pic">
									</a>
								</td>
								<td>
									题库管理设置
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="config_question">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
												<a href="/ssm_hr/client/toQuestionFirstKind.do" target="mainFrame">试题I级分类设置</a>
													
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/client/toQuestionSecondKind.do" target="mainFrame">试题II级分类设置
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(config_other)"><img
											src="images/plus22.gif"
											onClick="plusORminus(config_other,config_other_pic)"
											id="config_other_pic">
									</a>
								</td>
								<td>
									其他设置
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="config_other">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="client/primary_key.jsp"
														target="mainFrame">关键字查询设置</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 人力资源档案管理设置 -->
			<tr>
				<td>
					<a onClick="noneORblock(human_file)"><img
							src="images/plus22.gif"
							onClick="plusORminus(human_file,human_file_pic)"
							id="human_file_pic">
					</a>
				</td>
				<td>
					人力资源档案管理设置
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="human_file">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									<a href="/ssm_hr/humanresources/humanRegist.do" target="mainFrame">人力资源档案登记</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="/ssm_hr/humanresources/humanFileCheckList.do" target="mainFrame">人力资源档案登记复核</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="/ssm_hr/humanresources/queryHumanFile.do" target="mainFrame">人力资源档案查询</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="/ssm_hr/humanresources/humanUpdate.do" target="mainFrame">人力资源档案变更</a>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(human_file_delete)"><img
											src="images/plus22.gif"
											onClick="plusORminus(human_file_delete,human_file_delete_pic)"
											id="human_file_delete_pic">
									</a>
								</td>
								<td>
									人力资源档案删除管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="human_file_delete">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/humanresources/deleteLocate.do" target="mainFrame">人力资源档案删除</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/humanresources/recoveryLocate.do" target="mainFrame">档案删除恢复</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/humanresources/deleteForeverList.do" target="mainFrame">人力资源档案永久删除</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 薪酬标准管理 -->
			<tr>
				<td class="td_style">
					<a onClick="noneORblock(salary_standard)"><img
							src="images/plus22.gif"
							onClick="plusORminus(salary_standard,salary_standard_pic)"
							id="salary_standard_pic">
					</a>
				</td>
				<td class="td_style">
					薪酬标准管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="salary_standard">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									<a href="salarystandard_register.jsp" target="mainFrame">薪酬标准登记</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="salarystandard_check_list.jsp" target="mainFrame">薪酬标准登记复核</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="salarystandard_query_locate.jsp" target="mainFrame">薪酬标准查询</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="salarystandard_change_locate.jsp" target="mainFrame">薪酬标准变更</a>
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 薪酬发放管理 -->
			<tr>
				<td class="td_style">
					<a onClick="noneORblock(salary)"><img src="images/plus22.gif"
							onClick="plusORminus(salary,salary_pic)" id="salary_pic">
					</a>
				</td>
				<td class="td_style">
					薪酬发放管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="salary">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									薪酬发放登记
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									薪酬发放登记复核
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									薪酬发放查询
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 薪酬标准管理 -->
			<tr>
				<td class="td_style">
					<a onClick="noneORblock(major_change)"><img
							src="images/plus22.gif"
							onClick="plusORminus(major_change,major_change_pic)"
							id="major_change_pic">
					</a>
				</td>
				<td class="td_style">
					调动管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="major_change">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									调动登记
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									调动审核
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									调动查询
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 培训管理 -->
			<tr>
				<td class="td_style">
					<a onClick="noneORblock(training)"><img src="images/plus22.gif"
							onClick="plusORminus(training,training_pic)" id="training_pic">
					</a>
				</td>
				<td class="td_style">
					培训管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="training">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									<a href="training.do?operate=list" target="mainFrame">培训登记</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									培训登记复核
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									培训查询
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 激励管理 -->
			<tr>
				<td>
					<a onClick="noneORblock(bonus)"><img src="images/plus22.gif"
							onClick="plusORminus(bonus,bonus_pic)" id="bonus_pic">
					</a>
				</td>
				<td>
					激励管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="bonus">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									激励登记
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									激励登记复核
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									激励查询
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

			<!-- 招聘管理 -->
			<tr>
				<td width="2%">
					<a onClick="noneORblock(engage)"><img src="images/plus22.gif"
							onClick="plusORminus(engage,engage_pic)" id="engage_pic">
					</a>
				</td>
				<td>
					招聘管理
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="engage">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<a onClick="noneORblock(engage_major_release)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_major_release,engage_major_release_pic)"
											id="engage_major_release_pic">
									</a>
								</td>
								<td width="98%">
									职位发布管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_major_release">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/position/first.do"
														target="mainFrame">职位发布登记</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/position/positionChangeUpdate.do"
														target="mainFrame">职位发布变更</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/position/positionReleaseSearch.do"
														target="mainFrame">职位发布查询</a>
												</td>
											</tr>
										</table>  </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(engage_resume)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_resume,engage_resume_pic)"
											id="engage_resume_pic">
									</a>
								</td>
								<td>
									简历管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_resume">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/resume/jlregister.do" target="mainFrame">简历登记</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/resume/resumeChoose.do" target="mainFrame">简历筛选</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/resume/validResume.do" target="mainFrame">有效简历查询</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(engage_rinterview)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_rinterview,engage_rinterview_pic)"
											id="engage_rinterview_pic">
									</a>
								</td>
								<td>
									面试管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_rinterview">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/interview/interviewResumeQuery.do" target="mainFrame">面试结果登记</a>
												</td>
											</tr>
											<tr>
												<td>
													<img src="images/jt0.gif">
												</td>
												<td>
													<a href="/ssm_hr/interview/siftInterview.do" target="mainFrame">面试筛选</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(engage_question)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_question,engage_question_pic)"
											id="engage_question_pic">
									</a>
								</td>
								<td>
									招聘考试题库管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_question">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/subject/toSubjectRegister.do" target="mainFrame">试题登记</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/subject/subjectSelect.do" target="mainFrame">试题查询</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/subject/subjectbg.do" target="mainFrame">试题变更</a>
												</td>
											</tr>
										</table></span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(engage_test)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_test,engage_test_pic)"
											id="engage_test_pic">
									</a>
								</td>
								<td>
									招聘考试管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_test">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
												<a href="/ssm_hr/exam/queryExamList.do" target="mainFrame">考试出题</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/exam/toExam.do" target="mainFrame">考试答题</a>
												</td>
											</tr>
											<!-- 
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													考试阅卷
												</td>
											</tr>
											 -->
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
												<a href="/ssm_hr/page/recruit/exam/exam_search.jsp" target="mainFrame">成绩查询筛选</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
							<tr>
								<td>
									<a onClick="noneORblock(engage_pass)"><img
											src="images/plus22.gif"
											onClick="plusORminus(engage_pass,engage_pass_pic)"
											id="engage_pass_pic">
									</a>
								</td>
								<td>
									录用管理
								</td>
							</tr>
							<tr>
								<td width="2%"></td>
								<td width="98%">
									<span style="DISPLAY:none;" id="engage_pass">
										<table width="100%" border="0">
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/employ/registerList.do" target="mainFrame">录用申请</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/employ/toCheckList.do" target="mainFrame">录用审批</a>
												</td>
											</tr>
											<tr>
												<td width="2%">
													<img src="images/jt0.gif">
												</td>
												<td width="98%">
													<a href="/ssm_hr/employ/toFindList.do" target="mainFrame">录用查询</a>
												</td>
											</tr>
										</table> </span>
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>
			<!-- 标准数据报表 -->
			<tr>
				<td>
					<a onClick="noneORblock(exports)"><img src="images/plus22.gif"
							onClick="plusORminus(exports,exports_pic)" id="exports_pic">
					</a>
				</td>
				<td>
					标准数据报表
				</td>
			</tr>
			<tr>
				<td width="2%"></td>
				<td width="98%">
					<span style="DISPLAY:none;" id="exports">
						<table width="100%" border="0">
							<tr>
								<td width="2%">
									<img src="images/jt0.gif">
								</td>
								<td width="98%">
									<a href="exportfile.do?operate=toExport&method=excel" target="mainFrame">EXCEL标准数据报表</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="exportfile.do?operate=toExport&method=pdf" target="mainFrame">pdf标准数据报表</a>
								</td>
							</tr>
							<tr>
								<td>
									<img src="images/jt0.gif">
								</td>
								<td>
									<a href="exportfile.do?operate=toExport&method=xml" target="mainFrame">xml标准数据报表</a>
								</td>
							</tr>
						</table> </span>
				</td>
			</tr>

		</table>
</body>
</html>