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
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>


	<script type="text/javascript">
		function ajax(pbcid){
		$.ajax({
			url:'deletepublic?pbcid='+pbcid,
			type:'get',
			success:function(data){
				if(data == 'ok'){
				$('#'+pbcid).remove();
				}
			}
		});
	}
	</script>
	</head>
	<body>
		<form method="post" action="../customiz/customizAction!findPublicChar">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--公共属性设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddpublic';">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="49%" class="TD_STYLE1">
						属性种类
					</td>
					<td width="44%" class="TD_STYLE1">
						属性名称
					</td>
					<td width="7%" class="TD_STYLE1" align="center">
						删除
					</td>
				</tr>
				
				<c:forEach items="${plist}" var="p">
				<tr id="${p.pbcid }">
					<td class="TD_STYLE2">
						${p.attributekind}
					</td>
					<td class="TD_STYLE2">
						${p.attributename}
					</td>
					<td class="TD_STYLE2" align="center">
						<a href="javascript:ajax(${p.pbcid })">删除</a>
					</td>
				</tr>
				</c:forEach>
				
				

			</table>
			<p>
				 
		</form>
	</body>

</html>