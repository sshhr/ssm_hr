<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript">
			function doDelete(humanid) {
				if(window.confirm("确认删除该项纪录？")){
					$.ajax({
						url:'/ssm_hr/humanresources/deleteForever.do?humanid=' + humanid,
						type:'get',
						success:function(data){
							if (data!='0') {
								$("#" + humanid).remove();
							}
						
						}
					});
				}
				}
	
			
		</script>
	</head>

	<body>
		<form action="" method="get">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案永久删除 </font>
					</td>
				</tr>
				<tr>
					<td>
						符合条件的人力资源档案总数：${count}例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=5 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="14%" height="13" class="TD_STYLE1">
						档案编号
					</td>
					<td width="11%" class="TD_STYLE1">
						姓名
					</td>
					<td width="6%" class="TD_STYLE1">
						性别
					</td>
					<td width="13%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="12%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE1">
						III级机构
					</td>
					<td width="11%" class="TD_STYLE1">
						职位分类
					</td>
					<td width="13%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="7%" class="TD_STYLE1">
						永久删除
					</td>
				</tr>
				<c:forEach items="${foreverlist}" var="h">
					<tr class="TR_STYLE2" id="${h.humanId}">
						<td width="14%" height="13" class="TD_STYLE2">
							${h.humanId}
						</td>
						<td width="11%" class="TD_STYLE2">
							${h.humanName }
						</td>
						<td width="6%" class="TD_STYLE2">
							${h.humanSex }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.firstKindName }
						</td>
						<td width="12%" class="TD_STYLE2">
							${h.secondKindName }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.thirdKindName }
						</td>
						<td width="11%" class="TD_STYLE2">
							${h.humanMajorKindName }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.hunmaMajorName }
						</td>
						<td width="7%" class="TD_STYLE2">
							<img src="/ssm_hr/images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(${h.humanId})">
						</td>
					</tr>
				</c:forEach>
			</table>
			
		</form>
	</body>
</html>