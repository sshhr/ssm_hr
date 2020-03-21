<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript">
		function deletebyid(qfkId){
			$.post("/ssm_hr/client/deleteQuestionFirstKind.do",
						{
						qfkId:qfkId,
						},
						function(data){
							if(data=="ok"){
								$('#'+qfkId).remove();
							}
						}
				);
		}
		</script>
		
	</head>

	<body>
		<form method="post" action="">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--题库管理设置--题库一级分类设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1" 
							onclick="window.location.href='/ssm_hr/page/client/question_first_kind_add.jsp';">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="46%" class="TD_STYLE1">
						题库一级分类编号
					</td>
					<td width="47%" class="TD_STYLE1">
						题库一级分类名称
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>
<!-- 这是复制了职位分类设置major_kind.jsp的代码 -->
				<c:forEach items="${qklist}" var="m">
				<tr id="${m.qfkId }">
					<td class="TD_STYLE2">
						${m.firstKindId}
					</td>
					<td class="TD_STYLE2">
						${m.firstKindName}
					</td>
					<td class="TD_STYLE2">
						<a href="javascript:deletebyid(${m.qfkId });">删除</a>
					</td>
				</tr>
				</c:forEach>
				
				

			</table>
			<p>
				 
		</form>
	</body>
</html>