<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<script type="text/javascript">
function selAll(obj) {
	var cho = document.all.choice.value;
	if (cho == "全选")
		document.all.choice.value = "取消";
	else
		document.all.choice.value = "全选";

	for(var i=0;i<obj.elements.length;i++){
 			if(obj.elements[i].tagName.toLowerCase()=="input" &&obj.elements[i].type=="checkbox"){
 				if(cho == "全选")
 					obj.elements[i].checked=true;
 				else
 					obj.elements[i].checked=false;
 			}
 		}
 	}
 	function doRegister()
 	{
		document.forms[0].submit();
 	}
</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/selectAll.js">
		</script>
	</head>

	<body>
		<form action="primary_key.jsp" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td class="TD_STYLE1" colspan="4">
						请选择用于关键字查询的字段&nbsp;
						<input type="button" id="choice" value="全选"
							class="BUTTON_STYLE1"/>
					</td>
				</tr>
				<input type="hidden" name="cpmk.tableName" value="试卷登记表" />
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="388"
						
							checked="checked"
						
							>
						编号
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="389"
						
							checked="checked"
						
							>
						试卷编号
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="390"
						
							checked="checked"
						
							>
						职位分类编号
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="391"
						
							checked="checked"
						
							>
						职位分类名称
					</td>
					
					<tr></tr>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="392"
						
							checked="checked"
						
							>
						职位编号
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="393"
						
							checked="checked"
						
							>
						职位名称
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="394"
						
							checked="checked"
						
							>
						登记人
					</td>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="395"
						
							checked="checked"
						
							>
						登记时间
					</td>
					
					<tr></tr>
					
				
					<td class="TD_STYLE2">
						<input type="checkbox" name="cpmk.primaryKey" value="396"
						
							checked="checked"
						
							>
						答题限时
					</td>
					
				
			</table>
		</form>
	</body>
</html>