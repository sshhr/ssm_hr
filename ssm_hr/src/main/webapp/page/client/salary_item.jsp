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
		function ajax(pbcid){
		$.ajax({
			url:'deletepublic?pbcid='+pbcid,
			type:'get',
			success:function(){
				$('#'+pbcid).remove();
			}
		});
	}
	</script>
		<script type="text/javascript">
			
				function submission(){
					document.forms[0].submit();
				}
				
				function page(currentPage){
					document.getElementById("pid").value=currentPage;
					document.forms[0].submit();
				}
		</script>

</head>

	<body>
		<form action="../customiz/customizAction!findStandardDetails" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--薪酬管理设置--薪酬项目设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddxcsz'">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr height="20">
					<td width="80%" class="TD_STYLE1" align="center">
						薪酬项目名称
					</td>
					<td width="20%" class="TD_STYLE1" align="center">
						删除
					</td>
				</tr>
				
					<c:forEach items="${xlist}" var="x">
					<tr height="20" id="${x.pbcid} ">
						<td class="TD_STYLE2">
						${x.attributename}
						</td>
						<td  align="center" class="TD_STYLE2">
							<a href="javascript:ajax(${x.pbcid})">删除</a>
						</td>
					</tr>
					</c:forEach>
					
			</table>
			<br>
			<br>
			<th colspan="7" class="pager">
				
			</th>
		</form>
	</body>
</html>