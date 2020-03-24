<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<script type="text/javascript">
function toRegister() {
	
	document.forms[0].submit();
	
}
		</script>
	</head>

	<body>
		<form action="../customiz/customizAction!findKeyName" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font>
					</td>
				</tr>
			</table>
			<table width="100%" border="0">
				<tr class="TR_STYLE1">
					<td width="18%">
						请选择数据库表的名称
					</td>
					<td width="69%">
						<select name="cpmk.primaryKeyTable" class="SELECT_STYLE2">
							
							<option value="ENGAGE_EXAM">
								试卷登记表
							</option>
							
							<option value="CONFIG_FILE_FIRST_KIND">
								一级机构设置表
							</option>
							
							<option value="SALARY_STANDARD">
								薪酬标准基本信息表
							</option>
							
							<option value="ENGAGE_INTERVIEW">
								面试表
							</option>
							
							<option value="MAJOR_CHANGE">
								职位调动表
							</option>
							
							<option value="SYS_ROLE">
								角色表
							</option>
							
							<option value="CONFIG_QUESTION_SECOND_KIND">
								试题二级分类设置表
							</option>
							
							<option value="SALARY_STANDARD_DETAILS">
								薪酬标准单详细信息表
							</option>
							
							<option value="ENGAGE_MAJOR_RELEASE">
								职位发表登记表
							</option>
							
							<option value="ENGAGE_ANSWER_DETAILS">
								考试答题详细信息表
							</option>
							
							<option value="ENGAGE_SUBJECTS">
								试题题库登记表
							</option>
							
							<option value="CONFIG_FILE_THIRD_KIND">
								三级机构设置表
							</option>
							
							<option value="TRAINING">
								培训登记表
							</option>
							
							<option value="SALARY_GRANT">
								薪酬发放登记表
							</option>
							
							<option value="SALARY_GRANT_DETAILS">
								薪酬发放详细信息表
							</option>
							
							<option value="SYS_ROLE_RIGHT">
								模块角色表
							</option>
							
							<option value="USER">
								用户表
							</option>
							
							<option value="CONFIG_FILE_SECOND_KIND">
								二级机构设置表
							</option>
							
							<option value="CONFIG_MAJOR">
								职位设置表
							</option>
							
							<option value="CONFIG_PUBLIC_CHAR">
								公共字段设置表
							</option>
							
							<option value="HUMAN_FILE">
								人力资源档案表
							</option>
							
							<option value="BONUS">
								激励登记表
							</option>
							
							<option value="SYS_RIGHT">
								模块表
							</option>
							
							<option value="ENGAGE_EXAM_DETAILS">
								试卷详细信息表
							</option>
							
							<option value="CONFIG_MAJOR_KIND">
								职位分类设置表
							</option>
							
							<option value="ENGAGE_RESUME">
								简历管理表
							</option>
							
							<option value="ENGAGE_ANSWER">
								考试答题登记表
							</option>
							
							<option value="CONFIG_QUESTION_FIRST_KIND">
								试题一级分类设置表
							</option>
							
							<option value="HUMANFILE_DIG">
								记录人力资源更新表
							</option>
							
						</select>
					</td>
					<td width="13%">
						<input type="button" value="开始" class="BUTTON_STYLE1"
							onclick="location.href='primary_key_register.jsp'">
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>