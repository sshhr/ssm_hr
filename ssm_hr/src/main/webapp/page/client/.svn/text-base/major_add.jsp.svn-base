<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="css/table.css" type="text/css">
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
		<script type="text/javascript" src="javascript/jquery-1.7.2.js">	
</script>
			<script type="text/javascript" src="javascript/jquery.messager.js"></script>
<script type="text/javascript">
 		function check(){
			if (document.getElementById("majorkindid").value==0){
				$.messager.show("消息提示","职位分类编号不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("majorkindname").value==""){
				$.messager.show("消息提示","职位分类名称不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("majorid").value==0){
				$.messager.show("消息提示","职位编号不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("majorname").value==""){
				$.messager.show("消息提示","职位名称不能为空!!!",2000);
				return ;
			}
			document.addmajor.submit();
		}	
 		</script>
	</head>
	
	
	<body>
		<form action="addmajor" method="post" name="addmajor">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位设置--职位添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
						onclick="check()">
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
						职位分类编号
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1"  name="majorkindid" id="majorkindid" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						职位分类名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="majorkindname" id="majorkindname"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						职位编号
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="majorid" id="majorid" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						职位名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1"name="majorname" id="majorname"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>