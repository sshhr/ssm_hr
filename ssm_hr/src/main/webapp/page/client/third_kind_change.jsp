<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/table.css"
			type="text/css"></link>
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
	</head>
	
<script type="text/javascript">
	
	//控件判断不能为空
	function check(){
		if (document.getElementById("thirdKind.thirdKindSaleId").value==""){
			alert("销售责任人编号不能为空!!!");
			return false;
		}
		if(document.getElementById("thirdKind.thirdKindIsRetail").value!="是" && document.getElementById("thirdKind.thirdKindIsRetail").value!="否"){
			alert("零售店 只能填（是/否）!!!");
			return false;
		}
		document.forms[0].submit();
	}		
</script>
	
	
	
	<body>
		<form action="updatethird" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置--III级机构变更
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="addthirdsuccess">
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
						I级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text"  class="INPUT_STYLE1" 
						name="firstkindname" value="${ft.firstkindname}"/>
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						II级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text"  class="INPUT_STYLE1" 
						name="secondkindname" value="${ft.secondkindname}"/>
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						III级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
						<input type="text"  class="INPUT_STYLE1" 
						name="thirdkindid" value="${ft.thirdkindid}"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						III级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text"  class="INPUT_STYLE1" 
						name="thirdkindname" value="${ft.thirdkindname}"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea rows="4" cols="120" class="TEXTAREA_STYLE1" 
						name="thirdkindsaleid" >${ft.thirdkindsaleid}</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						是否为零售店（是/否）
					</td>
					<td class="TD_STYLE2">
					<select name="thirdkindisretail" value="${ft.thirdkindisretail}">
						<option selected="selected">是</option>
						<option>否</option>
					</select>
			 	</td>
				</tr>
			</table>
		</form>
	</body>
</html>