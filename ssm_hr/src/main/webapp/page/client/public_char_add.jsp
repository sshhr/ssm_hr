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
			if (document.getElementById("attributekind").value==""){
				$.messager.show("消息提示","属性种类不能为空!!!",2000);
				return;
			}
			if (document.getElementById("attributename").value==""){
				$.messager.show("消息提示","属性名称不能为空!!!",2000);
				return ;
			}
			document.addpublic.submit();
		}	
</script>	
	
	<body>
		<form action="addpublic" method="post" name="addpublic">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--公共属性设置--公共属性添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
						onclick="check()" >
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="19%">
						属性种类
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="attributekind" id="attributekind"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						属性名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE1" name="attributename" id="attributename"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>