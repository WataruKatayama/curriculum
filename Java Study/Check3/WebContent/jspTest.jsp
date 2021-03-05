<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- cssを適応させるには、linkのhrefに「${pageContext.request.contextPath}/css/cssのファイル名」を書き込む -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"></head>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<div class="block3">
	<table><!-- tableは表を挿入する際に使用する -->
		<tr><!-- trは表でいう行(横のライン)を表している-->
			<td class="namearea"><!-- tdはセルの中身を表している -->
				<!-- 入力ボックスを追加したい場合はラベルタグを使用　→理由は、わざわざボックスをクリックしなくても項目名をクリックすればボックスにフォーカスが当たるから -->
				<label class="name">name</label>
			</td>
			<td><!-- 次のtdを記入すると自動で次の列(縦のライン)に配置される -->
				<!--テキストボックスの追加は<input>にボックスのタイプ（記入欄を設けたい場合はtext）とそのボックスの名前を設定する -->
				<!-- テキストボックスの色や太さなどを変更したい場合はstyleを記入して指定する -->
				<input type="text" name="name" style="border-color:black;">
			</td>
		</tr>
	</table><!-- ここまででが一つの表になる。１行２列の表が完成された -->
	<table>
		<tr>
			<td class="idarea">
				<label class="id">id</label>
			</td>
			<td>
				<input type="text" name="id" style="border-color:black;">
			</td>
		</tr>
	</table>
	</div>

	<%@ include file = "footer.jsp" %>

</body>
</html>