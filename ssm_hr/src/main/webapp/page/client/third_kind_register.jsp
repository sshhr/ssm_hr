<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css"
			type="text/css"></link>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>		

		<script type="text/javascript">
		function querysecondByFid(){
 			var fid = $("#firstKindId").val();
 			var secondSelect = $("#secondKindId");
 			var thirdSelect = $("#thirdKindId");
			//获取下拉框里的文本内容
			var firstName = $("#first_" + fid).html();
			$("#fisrtKindName").val(firstName);
 			//清空下拉框
 			thirdSelect.empty();
 			secondSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value=''>--请选择--</option>");
 			secondSelect.append("<option value=''>--请选择--</option>");
 			if(fid != 0){
 				$.ajax({
 					url:'querySecondByFid?fid='+fid,
 					type:'get',
 					success:function(data){
 						for(var i=0;i<data.length;i++){
 							var eachsecond = data[i];
 							secondSelect.append("<option id='second_"+eachsecond.secondkindid+"' value="+eachsecond.secondkindid+">"+eachsecond.secondkindname+"</option>");
 						}
 					}
 				});
 			}
 		}

 		function getSecondName(){
 	 		var sid = $("#secondKindId").val();
 	 		var secondName = $("#second_" + sid).html();
			$("#secondKindName").val(secondName);
 		}
 		
 		
 		</script> 
 				<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js">	
</script>
			<script type="text/javascript" src="/ssm_hr/page/javascript/jquery.messager.js"></script>
<script type="text/javascript">
 		function check(){
			if (document.getElementById("thirdkindname").value==0){
				$.messager.show("消息提示","III级机构名称不能为空!!!",2000);
				return ;
			}
			if (document.getElementById("thirdkindsaleid").value==""){
				$.messager.show("消息提示","销售责任人编号不能为空!!!",2000);
				return ;
			}
			document.addthird.submit();
		}	
 		</script>
	</head>
	<script type="text/javascript"> 
			$(function() {
			var first=$("#firstKindId");
			var second= $("#secondKindId");
	 		 first.change(function(){
	 		 	$.post('/HR_Fist/transfer/transferAction!findtwo.action',{ 'configThird.firstKindId' : $('#firstkindid option:selected').val() },
		  			function(data){
		  			 
		  			 second.css("width",first.width());
		  			second.empty();
		  			second.append("<option value='' >-----请选择-----</option>");
		  		var items = $(data).find("item");
		  		items.each(function(i){
		  				var id = $(items[i]).attr("id");
		  				var name = $(items[i]).attr("name");	
		  				second.append("<option value='"+id+"'>"+name+"</option>");		  		
		  		});
					},'xml');
	 		 	third.val('0');
	 		 }); });
</script>

	<body>
		<form action="addthird" method="post" name="addthird">
		<input type="hidden" id="fisrtKindName" name="firstkindname">
		<input type="hidden" id="secondKindName" name="secondkindname">

			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置--III级机构添加
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
					<td width="19%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">
					<select name="firstkindid" id="firstKindId"  class="INPUT_STYLE1" onchange="querysecondByFid()"> 
						<option value="">--请选择I级机构--</option>
						<c:forEach items="${flist}" var="f">
							<option id="first_${f.firstkindid }" value="${f.firstkindid }">${f.firstkindname }</option>
						</c:forEach>
					 </select>
					
						
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						II级机构名称
					</td>
					<td width="81%" class="TD_STYLE2">						
						<select name="secondkindid" id="secondKindId" class="INPUT_STYLE1" onchange="getSecondName()"> 
					<option value="">请选择II级机构</option>
						</select>
			
		</select> 
					</td>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">
						III级机构编号
					</td>
					<td width="81%" class="TD_STYLE2">
					<input type="text" class="INPUT_STYLE1" name="thirdkindid" readonly="readonly" value="${time }"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						III级机构名称
					</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE1" name="thirdkindname" id="thirdkindname"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2">
						<textarea rows="4" cols="120" class="TEXTAREA_STYLE1" name="thirdkindsaleid" id="thirdkindsaleid"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						是否为零售店（是/否）
					</td>
					<td class="TD_STYLE2">
					<select name="thirdkindisretail" >
						<option selected="selected">是</option>
						<option>否</option>
					</select>
						 
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>