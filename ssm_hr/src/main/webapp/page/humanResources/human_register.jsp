<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/table.css" type="text/css">
<link rel="stylesheet" href="css/cwcalendar.css" type="text/css">
<script type="text/javascript" src="javascript/jquery-1.7.2.js">
	
</script>
<script type="text/javascript" src="javascript/jquery.messager.js">
	
</script>
<script type="text/javascript" src="javascript/comm/comm.js">
	
</script>
<script type="text/javascript" src="javascript/comm/select.js">
	
</script>
<script type="text/javascript" src="javascript/calendar-ch.js">
	
</script>
<script type="text/javascript" src="javascript/time.js">
	
</script>
<script type="text/javascript" src="javascript/human_register.js">
	
</script>
<script type="text/javascript" src="javascript/human_input_check.js">
	
</script>
<script type="text/javascript">
	function mysubmit(){  
		var humanName = $("#humanName");
		var humanIdCard = $("#humanidcardid");
		var humanEmail = $("#humanEmail");
		var humanTelephone = $("#humanTelephone");
		var humanQq = $("#humanQq");
		var humanMobilephone = $("#humanMobilephone");
		var humanAge = $("#humanage");
		var reg1 = /^\s+/;
		var reg2 = /\s+$/;
		var reg3 = /^\d{17}[0-9X]$/;
		var reg4 = /^\d{1,2}$/;
		var reg5 = /^\w+@(qq|163)\.com$/;// 1111@qq.
		
		//var reg6 = /^\d{3}-\d{8}|\d{4}-\d{7}$/;
		var reg6=/^1[0-9]{10}$/;
		
		var reg7 = /^[1-9][0-9]{4,}$/;
		var reg8 = /^[1-9]{2}\d{9}$/;
	
		if ($("#firstKind").val() == "0") {
			$.messager.show("消息提示", "请选择Ⅰ级机构！", 2000);
			return ;
		}
		if (reg1.test(humanName.val()) || reg2.test(humanName.val())) {
			$.messager.show("消息提示", "姓名不能以空格开头或结尾！", 2000);
			humanName[0].select();
			return ;
		}
		if (humanName.val() == "") {
			$.messager.show("消息提示", "姓名不能为空！", 2000);
			humanName[0].select();
			return ;
		}
		if (!reg3.test(humanIdCard.val())) {
			$.messager.show("消息提示", "身份证号码格式不正确！", 2000);
			humanIdCard[0].select();
			return ;
		}
		if (!reg5.test(humanEmail.val())) {
			$.messager.show("消息提示", "EMAIL格式不正确！", 2000);
			humanEmail[0].select();
			return ;
		}
		if (!reg6.test(humanTelephone.val())) {
			$.messager.show("消息提示", "电话格式不正确！", 2000);
			humanTelephone[0].select();
			return ;
		}
		if (!reg7.test(humanQq.val())) {
			$.messager.show("消息提示", "QQ格式不正确！", 2000);
			humanQq[0].select();
			return ;
		}
		if (!reg8.test(humanMobilephone.val())) {
			$.messager.show("消息提示", "手机格式不正确！", 2000);
			humanMobilephone[0].select();
			return ;
		}
		if(document.getElementById("humanaddress").value==""){
			$.messager.show("消息提示","请填写住址",2000);
	 		return ;
	 	}
		if(document.getElementById("humanpostcodeid").value==""){
			$.messager.show("消息提示","请填写邮编",2000);
	 		return ;
	 	}
		if(document.getElementById("humannationality").value==""){
			$.messager.show("消息提示","请填写国籍",2000);
	 		return ;
	 	}
		if(document.getElementById("humanbirthplace").value==""){
			$.messager.show("消息提示","请填写出生地",2000);
	 		return ;
	 	}
		if(document.getElementById("humanrace").value==""){
			$.messager.show("消息提示","请填写民族",2000);
	 		return ;
	 	}
		if(document.getElementById("humanreligion").value==""){
			$.messager.show("消息提示","请填写宗教信仰",2000);
	 		return ;
	 	}
		if(document.getElementById("humanparty").value==""){
			$.messager.show("消息提示","请填写政治面貌",2000);
	 		return ;
	 	}
		if(document.getElementById("humansocietysecurityid").value==""){

			$.messager.show("消息提示","请填写社会保障号码",2000);
	 		return ;
	 	}
		
		if(document.getElementById("humaneducateddegree").value==""){
			$.messager.show("消息提示","请填写学历",2000);
	 		return ;
	 	}
		if(document.getElementById("humaneducatedyears").value==""){
			$.messager.show("消息提示","请填写教育年限",2000);
	 		return ;
	 	}
		if(document.getElementById("humaneducatedmajor").value==""){
			$.messager.show("消息提示","请填写学历专业",2000);
	 		return ;
	 	}
		if(document.getElementById("salarystandardid").value==""){
			$.messager.show("消息提示","请填写薪酬标准",2000);
	 		return ;
	 	}
	 	if(document.getElementById("humanbank").value==""){
			$.messager.show("消息提示","请填写开户银行",2000);
	 		return ;
	 	}
	 	if(document.getElementById("humanaccount").value==""){
			$.messager.show("消息提示","请填写银行账户",2000);
	 		return ;
	 	}
	 	if(document.getElementById("humanspeciality").value==""){
			$.messager.show("消息提示","请填写特长",2000);
	 		return ;
	 	}
	 	if(document.getElementById("humanhobby").value==""){
			$.messager.show("消息提示","请填写爱好",2000);
	 		return ;
	 	}
		document.fm.submit();
	};

 		






 	  function querysecondByid(){
 			var fid = $("#firstKind").val();
 			var secondSelect = $("#secondKind");
 			var thirdSelect = $("#thirdKind");
 			
 			var firstid = $("#first_"+ fid).html();
 			//把拿到的内容放到选择的ID中
 			$("#firstKindName").val(firstid);
 			//清空下拉框
 			thirdSelect.empty();
 			secondSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value='0'>--请选择--</option>");
 			secondSelect.append("<option value='0'>--请选择--</option>");
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
 		
 		function queryThirdyByid(){
 			var sid = $("#secondKind").val();
 			var thirdSelect = $("#thirdKind");
 			var secondid=$("#second_"+sid).html();
 			$("#secondKindName").val(secondid);
 			
 			//清空下拉框
 			thirdSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value='0'>--请选择--</option>");
 			if(sid != 0){
 				$.ajax({
 					url:'queryThirdyBySid?sid='+sid,
 					type:'get',
 					success:function(data){
 						for(var i=0;i<data.length;i++){
 							var eachThird = data[i];
 							thirdSelect.append("<option id='third_"+eachThird.thirdkindid+"' value="+eachThird.thirdkindid+">"+eachThird.thirdkindname+"</option>");
 						}
 					}
 				});
 			}
 		}
 		function getthirdKindid(){
 	 		var tid=$("#thirdKind").val();
 			var thirdname=$("#third_"+tid).html();
 			$("#thirdKindName").val(thirdname);
 	 		}
 		function getMajorid(){
 	 		var sid=$("#majorname").val();
 			var majorname=$("#major_"+sid).html();
 			$("#humanmajorName").val(majorname);
 	 		}
 		
		function ByIdQueryMajor(){
		    var mid = $("#majorKind").val();
		 	var majorSelect = $("#majorname");
		 	var kindname=$("#kind_"+mid).html();
		    $("#majorKindName").val(kindname);
		 	majorSelect.empty();
		 	majorSelect.append("<option value='0'>--请选择--</option>");
		 	if(mid != 0){
			 	$.ajax({
					url:'ByIdQueryMajor?mid='+mid,
					type:'get',
					success:function(data){
			 			for(var i=0;i<data.length;i++){
							var eachMajor = data[i];
							majorSelect.append("<option id='major_"+eachMajor.majorid+"' value="+eachMajor.majorid+">"+eachMajor.majorname+"</option>");
						}
			 			}
				 	});
		 	}
	 	}
	 	function getsalaryname(){
 	 		var sid=$("#salarystandardid").val();
 			var majorname=$("#salary_"+sid).html();
 			$("#salarystandardName").val(majorname);
 	 		}

 		
	 	function checksfz(){
			var sfz = $("#humanidcardid").val();
			if(sfz.length == 18){
				var sex = sfz.substring(16,17);
				var woman="女";
				var man="男";
				if(sex % 2 == 0){
					$("#humansex").val(woman);
				} else {
					$("#humansex").val(man);
				}
				var year = sfz.substring(6,10);
				var month = sfz.substring(10,12);
				var date = sfz.substring(12,14);
				var birthday = new Date(year+"-"+month+"-"+date).getTime();
				var now = new Date().getTime();
				var age = (now-birthday)/1000/60/60/24/365;
				var ageStr = age + "";
				var ageInt = ageStr.substring(0,ageStr.indexOf("."));
				var sr=year+"-"+month+"-"+date;
				$("#humanage").val(ageInt);
				$("#birthday").val(sr);
			}
		}
 		</script> 
</head>

<body>
<form method="post" action="add" name="fm">
		<input  name="firstkindname" type="hidden" id="firstKindName">
		<input  name="secondkindname" type="hidden" id="secondKindName">
		<input  name="thirdkindname" type="hidden" id="thirdKindName">
		<input  name="humanmajorkindname" type="hidden" id="majorKindName">
		<input  name="humanmajorname" type="hidden" id="humanmajorName">
		<input  name="salarystandardname" type="hidden" id="salarystandardName">
		<input  name="humanid" type="hidden" value="${time}">
		
<table width="100%">
	<tr>
		<td><font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记
		</font></td>
	</tr>
	<tr>
		<td align="right">
		<input type="button" value="提交" class="BUTTON_STYLE1" onclick="mysubmit()"/> 
		<input type="reset" value="清除" class="BUTTON_STYLE1" /></td>
	</tr>
</table>
<table width="100%" border="1" cellpadding=3 cellspacing=1
	bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
	<tr>
		<td class="TD_STYLE1" width="11%">I级机构</td>
		<td width="14%" class="TD_STYLE2">
		<select name="firstkindid" class="SELECT_STYLE1" id="firstKind" onchange="querysecondByid()">
			<option value="0">--请选择--</option>
			<c:forEach items="${flist}" var="f" >
			<option id="first_${f.firstkindid}" value="${f.firstkindid}">${f.firstkindname}</option>
			</c:forEach>
		</select> 
		</td>
		<td width="11%" class="TD_STYLE1">II级机构</td>
		<td width="14%" class="TD_STYLE2">
		<select name="secondkindid" class="SELECT_STYLE1" id="secondKind" onchange="queryThirdyByid()">
			<option value="0">请选择</option>
		</select> 
		</td>
		<td width="11%" class="TD_STYLE1">III级机构</td>
		<td class="TD_STYLE2" colspan="2">
		<select	name="thirdkindid" class="SELECT_STYLE1" id="thirdKind" onchange="getthirdKindid()">
			<option value="0">--请选择--</option>
		</select> 
		</td>
		<!-- 头像 -->
		<td rowspan="5" style="text-align: center;"></td>
		</tr>
	<tr>
		<td class="TD_STYLE1">职位分类</td>
		<td class="TD_STYLE2">
		<select name="humanmajorkindid" class="SELECT_STYLE1" id="majorKind" onchange="ByIdQueryMajor()">
			<option value="0">--请选择--</option>
			<c:forEach items="${zwlist}" var="r">
				<option id="kind_${r.majorkindid}" value="${r.majorkindid}">${r.majorkindname}</option>
			</c:forEach>
		</select> </td>
		<td class="TD_STYLE1">职位名称</td>
		<td class="TD_STYLE2"><select name="humanmajorid"
			class="SELECT_STYLE1" id="majorname" onchange="getMajorid()">
			<option value="0">--请选择--</option>
			
		</select> </td>
		<td class="TD_STYLE1">职称</td>
		<td colspan="2" class="TD_STYLE2"><select
			name="humanprodesignation" class="SELECT_STYLE1">
			<option value="0">--请选择--</option>
			<c:forEach items="${clist}" var="c">
			<option>${c.attributename}</option>
			</c:forEach>
		</select></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">姓名</td>
		<td class="TD_STYLE2"><input type="text" id="humanName"
			name="humanname" class="INPUT_STYLE2" /></td>
		<td class="TD_STYLE1">身份证</td>
		<td class="TD_STYLE2">
		<input type="text"
		 name="humanidcard" id="humanidcardid" class="INPUT_STYLE2" onkeyup="checksfz()">
		</td>
		<td class="TD_STYLE1">EMAIL</td>
		<td colspan="2" class="TD_STYLE2"><input type="text"
			name="humanemail" id="humanEmail" class="INPUT_STYLE2">
		</td>
	</tr>
	<tr>
		<td class="TD_STYLE1">电话</td>
		<td class="TD_STYLE2"><input type="text"
			name="humantelephone" id="humanTelephone"
			class="INPUT_STYLE2"></td>
		<td class="TD_STYLE1">QQ</td>
		<td class="TD_STYLE2"><input type="text" name="humanqq"
			id="humanQq" class="INPUT_STYLE2"></td>
		<td class="TD_STYLE1">手机</td>
		<td colspan="2" class="TD_STYLE2"><input type="text"
			name="humanmobilephone" id="humanMobilephone"
			class="INPUT_STYLE2"></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">住址</td>
		<td colspan="3" class="TD_STYLE2"><input type="text"
			name="humanaddress" class="INPUT_STYLE2" id="humanaddress"></td>
		<td class="TD_STYLE1">邮编</td>
		<td colspan="2" class="TD_STYLE2"><input type="text"
			name="humanpostcode" class="INPUT_STYLE2" id="humanpostcodeid"></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">国籍</td>
		<td class="TD_STYLE2"><select name="humannationality"
			class="SELECT_STYLE1" id="humannationality">
			<option value="0">--请选择--</option>
			<c:forEach items="${glist}" var="g">
			<option>${g.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">出生地</td>
		<td class="TD_STYLE2"><input type="text"
			name="humanbirthplace" class="INPUT_STYLE2" id="humanbirthplace"></td>
		<td class="TD_STYLE1">生日</td>
		<td width="13%" class="TD_STYLE2">
		<input type="text" name="humanbirthday" 
			class="INPUT_STYLE2" id="birthday" readonly="readonly"></td>
		<td width="11%" class="TD_STYLE1">民族</td>
		<td class="TD_STYLE2" width="14%"><select
			name="humanrace" class="SELECT_STYLE1" id="humanrace">
			<option value="0">--请选择--</option>
			<c:forEach items="${mlist}" var="m1">
			<option>${m1.attributename}</option>
			</c:forEach>
		</select></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">宗教信仰</td>
		<td class="TD_STYLE2"><select name="humanreligion"
			class="SELECT_STYLE1" id="humanreligion">
			<option value="0">--请选择--</option>
		       <c:forEach items="${zlist}" var="z1">
			<option>${z1.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">政治面貌</td>
		<td class="TD_STYLE2"><select name="humanparty"
			class="SELECT_STYLE1" id="humanparty">
			<option value="0">--请选择--</option>
			<c:forEach items="${zzlist}" var="z">
			<option>${z.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">性别</td>
		<td class="TD_STYLE2">
		 <input type="text" name="humansex" class="INPUT_STYLE2" id="humansex">
		</td>
		
		<td class="TD_STYLE1">社会保障号码</td>
		<td class="TD_STYLE2">
		<input type="text" name="humansocietysecurityid" class="INPUT_STYLE2" id="humansocietysecurityid">
		</td>
	</tr>
	<tr>
		<td class="TD_STYLE1">年龄</td>
		<td class="TD_STYLE2"><input type="text"
			name="humanage" id="humanage" class="INPUT_STYLE2" readonly="readonly">
		</td>
		<td class="TD_STYLE1">学历</td>
		<td class="TD_STYLE2"><select
			name="humaneducateddegree" class="SELECT_STYLE1" id="humaneducateddegree">
			<option value="0">--请选择--</option>
			<c:forEach items="${xlist}" var="x">
			<option >${x.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">教育年限</td>
		<td class="TD_STYLE2"><select name="humaneducatedyears"
			class="SELECT_STYLE1" id="humaneducatedyears">
			<option value="0">--请选择--</option>
			<c:forEach items="${jlist}" var="j">
			<option >${j.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">学历专业</td>
		<td class="TD_STYLE2"><select name="humaneducatedmajor"
			class="SELECT_STYLE1" id="humaneducatedmajor">
			<option value="0">--请选择--</option>
			<c:forEach items="${xlzylist}" var="x1">
			<option>${x1.attributename}</option>
			</c:forEach>
		</select></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">薪酬标准</td>
		<td class="TD_STYLE2">
		<select name="salarystandardid" id="salarystandardid" class="SELECT_STYLE1" onchange="getsalaryname()" id="salarystandard">
		<option value="0">--请选择--</option>
			<c:forEach items="${slist}" var="s">
			<option id="salary_${s.sstid}" value="${s.sstid}">${s.sname}</option>
			</c:forEach>
		</select>
		
		</td>
		<td class="TD_STYLE1">开户银行</td>
		<td class="TD_STYLE2"><input type="text"
			name="humanbank" id="humanbank" class="INPUT_STYLE2"></td>
		<td class="TD_STYLE1">银行账户</td>
		<td class="TD_STYLE2"><input type="text"
			name="humanaccount" id="humanaccount" class="INPUT_STYLE2"></td>
		<td class="TD_STYLE1">登记人</td>
		<td class="TD_STYLE2"><input type="text"
			name="register" value="${userlogin.user_true_name}" readonly="readonly"
			class="INPUT_STYLE2"></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">建档时间</td>
		<td class="TD_STYLE2"><input type="text"
			name="registtime" readonly="readonly"
			class="INPUT_STYLE2" id="create_time"></td>
		<td class="TD_STYLE1">特长</td>
		<td class="TD_STYLE2"><select name="humanspeciality"
			class="SELECT_STYLE1" id="humanspeciality">
			<option value="0">--请选择--</option>
			<c:forEach items="${tlist}" var="t">
			<option >${t.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">爱好</td>
		<td class="TD_STYLE2"><select name="humanhobby"
			class="SELECT_STYLE1" id="humanhobby">
			<option value="0">--请选择--</option>
			<c:forEach items="${alist}" var="a">
			<option>${a.attributename}</option>
			</c:forEach>
		</select></td>
		<td class="TD_STYLE1">&nbsp;</td>
		<td class="TD_STYLE2">&nbsp;</td>
	</tr>
	<tr>
		<td class="TD_STYLE1">个人履历</td>
		<td colspan="7" class="TD_STYLE2"><textarea
			name="humanhistroyrecords" rows="4" class="TEXTAREA_STYLE1"></textarea>
		</td>
	</tr>
	<tr>
		<td class="TD_STYLE1">家庭关系信息</td>
		<td colspan="7" class="TD_STYLE2"><textarea
			name="humanfamilymembership" rows="4"
			class="TEXTAREA_STYLE1"></textarea></td>
	</tr>
	<tr>
		<td class="TD_STYLE1">备注</td>
		<td colspan="7" class="TD_STYLE2"><textarea
			name="remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
		</td>
	</tr>
</table>
</form>
</body>
</html>