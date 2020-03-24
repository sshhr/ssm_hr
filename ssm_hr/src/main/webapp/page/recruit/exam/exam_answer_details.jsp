<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css" type="text/css" />
		<script type="text/javascript" src="/ssm_hr/page/javascript/comm/comm.js"></script>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>
		<title>考试答题</title>
	</head>

	<body>
		<form name="salary" method="post" id="myform" action="/ssm_hr/exam/examSift.do?resId=${er.resId}">
			<table width="100%">	
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--招聘管理--考试招聘管理--答卷详情
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
					 考试用时: <input type="text" id="time" name="engageAnswer.useTime" value="${ea.useTime}" readonly="readonly" >
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="筛选" class="BUTTON_STYLE1" id="sub" onclick="check()">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick=window.history.back(-1);>
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
						<input type="text" name="engageAnswer.examNumber" value="${ea.examNumber}" readonly="readonly"  class="INPUT_STYLE2">
					</td>
					<td width="74" class="TD_STYLE1">
						试题数量
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="questionAmount" value="${shu}" readonly="readonly" class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					<td width="74" class="TD_STYLE1">
						姓名
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="engageAnswer.humanName" value="${er.humanName}" readonly="readonly"  class="INPUT_STYLE2">
					</td>
					<td width="74" class="TD_STYLE1">
						身份证
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="engageAnswer.humanIdcard" value="${er.humanIdcard }" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
			</table>
			<p style="color:green">
				最后得分：${er.totalPoints}
			</p>
			<!-- 展示题目都是单选 -->
			<c:forEach items="${eadaes }" var="i"  varStatus="j">
			<div>
			  <h3>${j.count}.题目：${i.content}<h3>
			  <input type="hidden" name="answerList[${j.index}].subjectId" value="${i.subId}" />
			  <p>A:${i.keyA}</p>
			  <p>B:${i.keyB}</p>
			  <p>C:${i.keyC}</p>
			  <p>D:${i.keyD}</p>
			  <c:if test="${not empty i.keyE && (i.keyE ne null )}">
			    <p>E:${i.keyE}</p>
			  </c:if>
			  <h4 style="color:green">正确答案：${i.correctKey }</h4>
			  <h4>应试者答案：${i.answer }</h4>
			  <c:if test="${i.correctKey eq i.answer }">
			  		<h5 style="color:green">得分2分</h5>
			  </c:if>
			  <c:if test="${i.correctKey ne i.answer }">
			  		<h5 style="color:red">答案错误</h5>
			  </c:if>
			</div>
			</c:forEach>
		</form>
	</body>
</html>

