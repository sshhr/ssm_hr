<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="css/table.css" type="text/css">
		<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript">
			function doDelete(hid) {
			
					$.ajax({
						url:'delete_list?hid=' + hid,
						type:'get',
						success:function(data){
							$("#" + hid).remove();
						}
					});
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
				<c:forEach items="${hflist}" var="h">
					<tr class="TR_STYLE2" id="${h.humanid}">
						<td width="14%" height="13" class="TD_STYLE2">
							${h.humanid}
						</td>
						<td width="11%" class="TD_STYLE2">
							${h.humanname }
						</td>
						<td width="6%" class="TD_STYLE2">
							${h.humansex }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.firstkindname }
						</td>
						<td width="12%" class="TD_STYLE2">
							${h.secondkindname }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.thirdkindname }
						</td>
						<td width="11%" class="TD_STYLE2">
							${h.humanmajorkindname }
						</td>
						<td width="13%" class="TD_STYLE2">
							${h.humanmajorname }
						</td>
						<td width="7%" class="TD_STYLE2">
	<img src="images/bt_del.gif" title="删除" style="cursor:pointer;" onclick="doDelete(${h.humanid})">
						</td>
					</tr>
				</c:forEach>
			</table>
			
		</form>
	</body>
</html>