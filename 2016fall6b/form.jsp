<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
</head>

<body>
    <form action="processRegister.jsp" method="post">
        <div>
            First Name: <input type="text" name="Fname"/>
            Last Name: <input type="text" name="Lname"/>
        </div>
        <div>
            Mobile No: <input type="text" name="number"/>
            Address <input type="text" name="address"/>
        </div><input type="submit" value="Send">
    </form>
</body>
</html>