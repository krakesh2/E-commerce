<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin signup</h1>
<h1 style="color: green;">${pos}</h1>
<h1 style="color: red;">${neg}</h1>
<form>
<fieldset>
<legend>Signup here</legend>
<table>
<tr>
    <th>Name:</th>
    <th><input type="text" name="name" required="required"></th>
</tr>
<tr>
    <th>Mobile:</th>
    <th><input type="tel" name="mobile" pattern="[0-9]{10}" required="required"></th>
</tr>
<tr>
    <th>Email:</th>
    <th><input type="email" name="email" required="required"></th>
</tr>
<tr>
    <th>password:</th>
    <th> <input type="number" name="password" required="required"></th>
</tr>
<tr>
    <th>Date of birth:</th>
    <th><input type="date" name="dob" required="required">       
    </th>
</tr>
<tr>
    <th>Gender:</th>
    <th><input type="radio" name="gender" required="required">Male
        <input type="radio" name="gender" required="required">Female
    </th>
    
</tr>
<tr>
    <th><button type="submit">Login</button></th>
    <th><button type="reset">Cancel</button></th>
</tr>
</table>
</fieldset>
</form>
<br>
<a href="/admin"><button>Back</button></a>
</body>
</html>