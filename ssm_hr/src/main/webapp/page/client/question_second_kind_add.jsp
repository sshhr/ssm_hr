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
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js">	
</script>
			<script type="text/javascript" src="/ssm_hr/page/javascript/jquery.messager.js"></script>
<script type="text/javascript">
function addbyid(firstKindId,firstKindName,secondKindId,secondKindName){
	$.post("/ssm_hr/client/questionSecondKindAdd.do",
		{
			firstKindId:document.getElementById("firstKindId").value,
			firstKindName:document.getElementById("firstKindName").value,
			secondKindId:document.getElementById("secondKindId").value,
			secondKindName:document.getElementById("secondKindName").value,
		},
		function(data){
			if (data=="xiugai") {
				$.messager.show("消息提示","您已修改成功",2000);
			}
			else {
				$.messager.show("消息提示","您已添加成功",2000);
			}
			document.questionSecondKindAdd.submit();
		}
	);
}
 		function check(){
			if (document.getElementById("firstKindId").value==0){
				$.messager.show("消息提示","一级题库分类编号不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("firstKindName").value==""){
				$.messager.show("消息提示","一级题库分类名称不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("secondKindId").value==0){
				$.messager.show("消息提示","二级题库分类编号不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("secondKindName").value==""){
				$.messager.show("消息提示","二级题库分类名称不能为空!!!",2000);
				return ;
			}
			addbyid();
		}	
 		</script>
	</head>
	
	
	<body>
		<form action="addsecond" method="post" name="addsecond">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--二级题库管理设置--二级题库分类添加
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
						一级题库分类编号
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1"  name="firstKindId" id="firstKindId" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						一级题库分类名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="firstKindName" id="firstKindName"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						二级题库分类编号
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="secondKindId" id="secondKindId" />
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="19%">
						二级题库分类名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1"name="secondKindName" id="secondKindName"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>