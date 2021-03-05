<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- カレンダー機能とSimpleDateFormatのテキストたいをインポート -->
<%@ page import = "java.util.*,java.util.Calendar" %>
<%@ page import = "java.util.*,java.text.SimpleDateFormat" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div class="block1">
			<!-- <label>タグで括る場合、cssのクラス内には必ずdisplay: inline-block;を記入する -->
			<label class="header">login</label>
			<label class="calendar">
			<%  Calendar cal= Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				out.print(sdf.format(cal.getTime()));%>
			</label>
		</div>

</body>
</html>