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
	</head>
	<body>
		<form method="post" action="/ssm_hr/humanresources/uploadPictureFile.do" enctype="multipart/form-data">
	          <input type="hidden" name ="humanId" value="${humanid}"/>
	          <input type="hidden" name ="humanPicture" value="${humanpicture}"/>
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--图片上传</font>
					</td>
				</tr>
				<tr>
					<td width="41%">
						提交成功，如有照片，请选择上传照片(.jpg、.gif文件)
						<input type="file" class="FILE_STYLE1" name="picFile"
							width="100%"/>
					</td>
					
				</tr>
				<tr>
				<td width="59%">
						提交成功，如需上传附件，请选择上传(word文档、txt文档、pdf文档、jpg图片等，最大5.0MB)
						<input type="file" class="FILE_STYLE1" name="accFile"
							width="100%">
					
						<input type="submit" value="完成" class="BUTTON_STYLE1"/>
				</td>
				</tr>
			</table>
		</form>
	</body>
</html>