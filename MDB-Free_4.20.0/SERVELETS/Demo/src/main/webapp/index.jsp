<html>
<meta charset="ISO-8859-1">
<head>
	<style>
		*
		{
			margin: 0px;
			box-sizing: border-box;
			padding: 0px;
		}
		table
		{
			margin-inline:auto;
			background-color:grey
		}
		input
        {
            margin: 5px;
			padding:1 rem;
        }
        h1
        {
        color: green;
        }
	</style>
<body>
	<form action="add">
		<table>
		<tr>
			<td>Number1:</td>
			<td><input type="text" name="one"></td>
		</tr>
		<tr>
			<td>Number2:</td>
			<td><input type="text" name="two"></td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: center"><input type="submit"></td>
		</tr>
		<tr>
			<td>Result:</td>
			<td><input type="text" name="result"></td>
		</tr>
		</table>
	</form>
</body>
</head>
</html>
