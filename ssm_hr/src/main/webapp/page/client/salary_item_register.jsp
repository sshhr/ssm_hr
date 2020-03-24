<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
	</head>
	<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js">	
</script>
			<script type="text/javascript" src="/ssm_hr/page/javascript/jquery.messager.js"></script>
	
<script type="text/javascript">
		function check(){
			if (document.getElementById("attributename").value==""){
				$.messager.show("消息提示","薪酬项目名称不能为空!!!",2000);
				return ;
			}
			document.addxcsz.submit();
		}		

</script>

	<body>
		<form action="addxcsz" method="post" name="addxcsz" >
		<input type="hidden" name="attributekind" value="薪酬设置"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--薪酬管理设这--薪酬项目设置--薪酬项目添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="addxcsz"
						onclick="check()">
						<input type="button" value="返回" class="xcszqueryAll"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1"  width="19%">
						薪酬项目名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="attributename" id="attributename"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>