<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logs</title>
<!-- <link rel="stylesheet" type="text/css" href="style.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css"> 
<style>
</style>
</head>
<body>
	<content>
	<div class="container3">
		<table id="table3">
			<thead>
				<tr>
					<th>SL_NO</th>
					<th>RFID Number</th>
					<th>TIME</th>
				</tr>
			</thead>
		</table>
		<script>
			$(document).ready(function() {
				$('#table3').dataTable({
					"ajax" : {
						"url" : "./getLogServ",
						"type" : "POST"
					},
					columns : [ {
						data : 'sl_no'
					}, {
						data : 'rfid'
					}, {
						data : 'time'
					} ]
				});
			});
		</script>
	</div>
	</content>
</body>
</html>