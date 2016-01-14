<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Create</title>
<link href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.css" type="text/css"
	rel="stylesheet" media="screen,projection" />
<link href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" media="screen,projection" />
<script src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.js"></script>
<script src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<form class="form-horizontal"
		action="<%=request.getContextPath()%>/student/entry" method="post">
		<fieldset>
			<!-- Form Name -->
			<legend>Student Profile Create</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="studentName">Name</label>
				<div class="col-md-4">
					<input id="studentName" name="studentName" type="text"
						placeholder="Name" class="form-control input-md" required="">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="regNo">RegNo</label>
				<div class="col-md-4">
					<input id="regNo" name="regNo" type="text" placeholder="Reg No"
						class="form-control input-md" required="">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="cgpa">CGPA</label>
				<div class="col-md-4">
					<input id="cgpa" name="cgpa" type="text" placeholder="Cgpa"
						class="form-control input-md" required="">

				</div>
			</div>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="Submit"></label>
				<div class="col-md-4">
					<button id="Submit" name="Submit" class="btn btn-success">Submit</button>
				</div>
			</div>

		</fieldset>
	</form>

</body>
</html>