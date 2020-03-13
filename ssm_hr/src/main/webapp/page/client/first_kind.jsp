<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="css/table.css" type="text/css">
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
	<script type="text/javascript">
		function ajax(fid){
		$.ajax({
			url:'deletefirst?fid='+fid,
			type:'get',
			success:function(){
				$('#'+fid).remove();
			}
		});
	}
	</script>
	<script type="text/javascript" src="javascript/jquery.messager.js"></script>
<script type="text/javascript">
 	   function mysubmit(){  
 	    if(document.getElementById("firstKindId").value==""){
 	       $.messager.show("消息提示","一级机构不能为空",2000);
 	       return ;
 	       }
	       </script>
	</head>
	<body>
		<form method="post" action="../customiz/customizAction!findFirstKind">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddFirstKind'" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="20%" class="TD_STYLE1">
						I级机构编号
					</td>
					<td width="20%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="25%" class="TD_STYLE1">
						薪酬发放责任人编号
					</td>
					<td width="25%" class="TD_STYLE1">
						销售责任人编号
					</td>
					<td width="5%" class="TD_STYLE1">
						变更
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>

				
					<c:forEach items="${flist}" var="f">
				<tr id="${f.firstkindid}">
					<td class="TD_STYLE2">
						${f.firstkindid }
					</td>
					<td class="TD_STYLE2">
						${f.firstkindname }
					</td>
					<td class="TD_STYLE2">
						${f.firstkindsalaryid }
					</td>
					<td class="TD_STYLE2">
						${f.firstkindsaleid }
					</td>
					<td class="TD_STYLE2">
						<a href="queryByIdConfigFileFirstKind?fid=${f.ffkid }">变更</a>
					</td>
					<td class="TD_STYLE2">
						<a href="javascript:ajax(${f.firstkindid})">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<p>
				 
		</form>
	</body>
</html>