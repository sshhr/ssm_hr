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
			src="javascript/comm/comm.js">
		</script>
		
		<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>
         <script type="text/javascript">
		function ajax(maid){
			$.ajax({
				url:'deletemajor?maid='+maid,
				type:'get',
				success:function(){
					$('#'+maid).remove();
				}
			});
		}
		</script>
	</head>

	<body>
		<form method="post" action="../customiz/customizAction!findMajor">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddmajor';">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="22%" class="TD_STYLE1">
						职位分类编号
					</td>
					<td width="23%" class="TD_STYLE1">
						职位分类名称
					</td>
					<td width="26%" class="TD_STYLE1">
						职位编号
					</td>
					<td width="24%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>

				<c:forEach items="${jlist}" var="j">
				<tr id="${j.makid }">
					<td class="TD_STYLE2">
						${j.majorkindid} 
					</td>
					<td class="TD_STYLE2">
						${j.majorkindname} 
					</td>
					<td class="TD_STYLE2">
						${j.majorid} 
					</td>
					<td class="TD_STYLE2">
					${j.majorname} 
					</td>
					<td class="TD_STYLE2">
						<a href="javascript:ajax(${j.makid })">删除</a>
					</td>
				</tr>
			</c:forEach>
		

			</table>
			<p>
			 
		</form>
	</body>
</html>