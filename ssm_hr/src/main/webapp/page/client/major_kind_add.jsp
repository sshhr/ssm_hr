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
function addbyid(majorKindId,majorKindName){
	$.post("/ssm_hr/client/majorKindAdd.do",
		{
		majorKindId:document.getElementById("majorKindId").value,
			majorKindName:document.getElementById("majorKindName").value,
		},
		function(data){
			if (data=="xiugai") {
				$.messager.show("消息提示","您已修改成功",2000);
			}
			else {
				$.messager.show("消息提示","您已添加成功",2000);
			}
			window.location.href="/ssm_hr/client/toMajorKind.do";
		}
	);
}
		function check(){
			if (document.getElementById("majorKindId").value==""){
				$.messager.show("消息提示","职位分类编号不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("majorKindName").value==""){
				$.messager.show("消息提示","职位分类名称不能为空!!!",2000);
				return ;
			}
			addbyid();
		}	
</script>	
	
	
	
	<body>
		<form action="addmajorkind" method="post" name="addmajorkind">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位分类设置--职位分类添加
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
						职位分类编号
					</td>
					<td class="TD_STYLE2" width="81%">
					<input type="text" class="INPUT_STYLE1" name="majorKindId" id="majorKindId" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE1" name="majorKindName" id="majorKindName"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>