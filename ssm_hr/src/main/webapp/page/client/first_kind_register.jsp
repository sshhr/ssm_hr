<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 	   function mysubmit(){  
 	    if(document.getElementById("firstkindname").value==""){
 	       $.messager.show("消息提示","一级机构不能为空",2000);
 	       return ;
 	       }
 	   if(document.getElementById("firstkindsalaryid").value==""){
 	       $.messager.show("消息提示","薪酬发放责任人编号不能为空",2000);
 	       return ;
 	       }
 	  if(document.getElementById("firstkindsaleid").value==""){
	       $.messager.show("消息提示","销售责任人编号不能为空",2000);
	       return ;
	       }
 	 	document.configfilefirstkindForm.submit();
 	   }
	       </script>
	</head>
	<body>
		<form name="configfilefirstkindForm" method="post" action="addFirstKind">
			
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置--I级机构添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1" onclick="mysubmit()"
						    >
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="19%" class="TD_STYLE1">
						I级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
					   <input type="text" name="firstkindid" readonly="readonly" value="${time }"					   
					     class="INPUT_STYLE1"/>
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						I级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="firstkindname" id="firstkindname"
							class="INPUT_STYLE1">
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea name="firstkindsalaryid" id="firstkindsalaryid" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea name="firstkindsaleid" id="firstkindsaleid" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>