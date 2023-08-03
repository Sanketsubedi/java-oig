<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Results</title>
</head>
<body>
    <table>
        <thead>
            <th>
                First name
            </th>
            <th>
                Last name
            </th>
            <th>
                Mobile number
            </th>
            <th>
                Address
            </th>
        </thead>
        <tbody>
            <%
                String fname = request.getParameter("Fname");
                String lname = request.getParameter("Lname");
                String number = request.getParameter("number");
                String address = request.getParameter("address");
            %>
            <tr>
                <td><%=fname%></td>
                <td><%=lname%></td>
                <td><%=number%></td>
                <td><%=address%></td>
            </tr>
        </tbody>
    </table>
</body>
</html>