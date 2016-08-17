<html>

<head>

<style>
@CHARSET "ISO-8859-1";

body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form,
	fieldset, input, textarea, p, blockquote, th, td {
	padding: 0;
	margin: 0;
}

ol, ul, li {
	list-style: none
}

body, input, textarea, select {
	font-family: 'Open Sans', sans-serif;
	font-size: 16px;
	color: #4c4c4c;
}

h1 {
	font-size: 32px;
	font-weight: 300;
	color: #4c4c4c;
	text-align: center;
	padding-top: 10px;
	margin-bottom: 10px;
}

html {
	background-color: #ffffff;
}

.testbox {
	margin: 20px auto;
	width: 343px;
	height: 464px;
	-webkit-border-radius: 8px/7px;
	-moz-border-radius: 8px/7px;
	border-radius: 8px/7px;
	background-color: #ebebeb;
	-webkit-box-shadow: 1px 2px 5px rgba(0, 0, 0, .31);
	-moz-box-shadow: 1px 2px 5px rgba(0, 0, 0, .31);
	box-shadow: 1px 2px 5px rgba(0, 0, 0, .31);
	border: solid 1px #cbc9c9;
}

form {
	margin: 0 30px;
}

input[type=radio]:checked+label:after {
	opacity: 1;
}

hr {
	color: #a9a9a9;
	opacity: 0.3;
}

input[type=text], input[type=password] {
	width: 300px;
	height: 39px;
	-webkit-border-radius: 0px 4px 4px 0px/5px 5px 4px 4px;
	-moz-border-radius: 0px 4px 4px 0px/0px 0px 4px 4px;
	border-radius: 0px 4px 4px 0px/5px 5px 4px 4px;
	background-color: #fff;
	-webkit-box-shadow: 1px 2px 5px rgba(0, 0, 0, .09);
	-moz-box-shadow: 1px 2px 5px rgba(0, 0, 0, .09);
	box-shadow: 1px 2px 5px rgba(0, 0, 0, .09);
	border: solid 1px #cbc9c9;
	margin-left: -5px;
	margin-top: 13px;
	padding-left: 10px;
}

input[type=password] {
	margin-bottom: 15px;
}
</style>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600'
	rel='stylesheet' type='text/css'>
<link
	href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>

<title>Electricity Service</title>
</head>

<body>
	<div class="testbox" style="height: 415px">
		<h1>Registration</h1>
		<form action="registration" method="post">
			<hr>
			<input type="text" name="firstname" id="name" placeholder="First Name" required /> 
			<input type="text" name="lastname" id="name" placeholder="Last Name" required /> 
			<input type="text" name="username" id="name" placeholder="User Name" required /> 
			<input type="password" name="password" id="name" placeholder="Password" required /> <br>
			<br>

			<button class="btn btn-info btn-warning pull-left" type="submit"
				name="register" value="register">Register</button>
		</form>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>