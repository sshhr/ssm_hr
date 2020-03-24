<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css" type="text/css" />
		<script type="text/javascript" src="/ssm_hr/page/javascript/comm/comm.js"></script>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>
		<title>my_exam</title>
	</head>

	<body onload="time_fun()">
		<form name="salary" method="post" id="myform" action="/ssm_hr/exam/examResult.do">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--招聘管理--考试招聘管理--考试答题
						</font>
					</td>
					
				</tr>
				<tr>
				    <td align="right">
					    答题限时时间${ee.limiteTime }分钟
					</td>
				</tr>
				<tr>
				    <td align="right">
					 已用时间: <input type="text" id="time" name="testTime" readonly="readonly" >
					</td>
				</tr>
				<tr>
					<td align="right">
					    <input type="radio" name="checkStatus" id="checkStatus" value="1">我要交卷
						<input type="radio" name="checkStatus" id="checkStatus1" value="0">再检查一遍
						<input type="button" value="确认" class="BUTTON_STYLE1" id="sub" onclick="check()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="74" class="TD_STYLE1">
						考试编码
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="examNumber" value="${ee.examNumber}" readonly="readonly"  class="INPUT_STYLE2">
						<input type="hidden" name="answerNumber" value="${answerNumber}" readonly="readonly">
					</td>
					<td width="74" class="TD_STYLE1">
						试题数量
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="standardName" value="${subjects.size()}" readonly="readonly" class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					<td width="74" class="TD_STYLE1">
						姓名
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="humanName" value="${humanName}" readonly="readonly"  class="INPUT_STYLE2">
					</td>
					<td width="74" class="TD_STYLE1">
						身份证
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="humanIdcard" value="${humanIdcard }" readonly="readonly" class="INPUT_STYLE2">
					</td>
					
				</tr>
			</table>
			<p>
				&nbsp;
			</p>
			<!-- 展示题目都是单选 -->
			<c:forEach items="${subjects }" var="i"  varStatus="j">
			<div>
			  <h3>${j.count}.题目：${i.content}<h3>
			  <p><input type="radio" name="${i.subId}" value="A" >A:${i.keyA}</p>
			  <p><input type="radio" name="${i.subId}" value="B">B:${i.keyB}</p>
			  <p><input type="radio" name="${i.subId}" value="C">C:${i.keyC}</p>
			  <p><input type="radio" name="${i.subId}" value="D">D:${i.keyD}</p>
			  <c:if test="${i.keyE ne null }">
			    <p><input type="radio" name="${i.subId}" value="E">E:${i.keyE}</p>
			  </c:if>
			</div>
			</c:forEach>
			
		</form>
	</body>
</html>
<script type="text/javascript">

		//获取职位
		function ByIdQueryMajor(){
		
		    var mid = $("#majorKind").val();
		 	var majorSelect = $("#majorName");
		 	var kindid=$("#kind_"+mid).val();
		    $("#majorKindId").val(kindid);
		 	majorSelect.empty();
		 	majorSelect.append("<option value=''>--请选择--</option>");
		 	if(mid != 0){
			 	$.ajax({
					url:'ByIdQueryMajor?mid='+mid,
					type:'get',
					success:function(data){
			 			for(var i=0;i<data.length;i++){
							var eachMajor = data[i];
							majorSelect.append("<option id='major_"+eachMajor.majorId+"' value="+eachMajor.majorId+">"+eachMajor.majorName+"</option>");
						}
			 			}
				 	});
		 	}
	 	}
	 	//获取职位
	 	function getMajorid(){
 	 		var sid=$("#majorName").val();
 			var majorid=$("#major_"+sid).val();
 			$("#majorId").val(majorid);
 	 		}
 var sumit=("#sub");	
 var sub=$("#myform");
 var time=$("#time");
//计算时间
	 function two_char(n) {
            return n >= 10 ? n : "0" + n;
        }
        
        function time_fun() {
            var sec=0;
            setInterval(function () {
                sec++;
                var date = new Date(0, 0)
                date.setSeconds(sec);
                var h = date.getHours(), m = date.getMinutes(), s = date.getSeconds();
                if(m==60){
		         sub.submit();
		        }
                $("#time").val(two_char(h) + ":" + two_char(m) + ":" + two_char(s));
            }, 1000);
        }
        
        
	//提交check()
	function check(){
		var rs=$("#checkStatus");
		var rs1=$("#checkStatus2");
		if(rs.checked==false&&rs1.checked==false){
		    alert("请选择交卷或者检查试卷！");
				return ;
			}
		 if(rs1.attr("checked")){
		     alert("请检查试卷！");
		     return ;
		 }if(rs.attr("checked")){
		     sub.submit();
		 }
			
		}
	

</script>
