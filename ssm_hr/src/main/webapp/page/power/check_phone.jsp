<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link rel="stylesheet"
			href="css/table.css" type="text/css"/>
			<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery.messager.js">
		</script>
			<script type="text/javascript">
			  function getCodeOne(){
				  var userphone = document.getElementById("userphone").value;
					// 判断是否为手机号码
					var reg = /^(13|14|15|16|17|18)\d{9}$/;
					var b = reg.test(userphone);
					if(b!=null && b!=""){
		            $("#yzmBtn").attr("disabled","disabled");
		            $("#yzmBtn").val("60秒");
		            var time =60;
		            var timer=window.setInterval(function(){
		                time=time-1;
		                $("#yzmBtn").val(time+"秒");
		                if(time==0){
		                    window.clearInterval(timer);
		                    $("#yzmBtn").attr("disabled",false);
		                    $("#yzmBtn").val("获取验证码");
		                }
		            },1000);
		            var user_phone=$("#userphone").val();
		            $.ajax({
		                url:'getCodeOne?user_phone='+user_phone,
		                type:'get',
		                success:function(data){
		            	$.messager.show("消息提示","验证码已发送",2000);
		            }
		            });
					}
		        }

			   //验证验证码是否正确
		        function checkYzmOne(){
		            var yzmOne=$("#yO").val();
		            if(yzmOne==''||yzmOne==null){
		                $("#checkForm").submit();
		            }else{
		                $.ajax({
		                    url:'checkYzmOne?yzmOne='+yzmOne,
		                    type:'get',
		                    success:function(data){
		                    if(data=='ok'){
		                        $("#checkForm").submit();
		                    }else{
		                    	$.messager.show("消息提示","你输入的验证码有误",2000);
		                    }
		                }
		                
		               });
		            }
		            
		        }
						
			</script>
	</head>
	<body>
	<form action="updatePhone" method="post" id="checkForm">
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--用户管理--绑定手机 </font>
				</td>
			</tr>
			
			<tr>
				<td><input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()"></td>
			</tr>
		</table>

	                                                        <tr>
															<td style="height: 28px">
																手机号码
															</td>
															<td style="height: 28px">
																<input style="width: 130px" type="text" id="userphone" name="user_phone" />
																<input type="hidden" name="user_id" value="${user.user_id} "/>
															</td>
															<br/>
															</tr>
															 <tr id="yzmSpan" style="display:none">
															<td style="height: 28px">
																验证码：
															</td>
															<td style="height: 28px">
																<input name="yzmOne" style="width: 130px" type="text" id="yO"/>
																<input style="width: 130px" type="button" id="yzmBtn" value="获取验证码" onclick="getCodeOne()"/>
															</td>
									
														</tr>
															<br/>
		                            
		<input type="button" value="提交" style="cursor: pointer;" onclick="checkYzmOne()"/>
		<p style="text-align:center;">
			
				<a href="user_list.html" style="color:black;">首页</a>
				
				
					 
						 
						    <font color="red">1</font> 
						 
						 
					 
				
				 
	     		<a href="user_list.html" style="color:black;">尾页</a> 
	     	
		</p>
		</form>
	</body>
</html>