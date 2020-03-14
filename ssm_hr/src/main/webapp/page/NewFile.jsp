<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<button id="but">ajax</button>
</body>
<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>
<script type="text/javascript">
	
	$('#but').click(function () {
		alert(111);
		$.ajax({
			url:'/ssm_hr/test/add.do',
			type:'get',
			success:function(data){
				alert(data);				
			}
		});
	})
		
	
</script>
</html>
