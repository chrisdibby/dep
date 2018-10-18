<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
</head>

<body>
<h1>Agencies list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    <#list agencies as agency>
    <tr>
        <td>${agency.id}</td>
        <td>${agency.name}</td>
    </tr>
    </#list>
</table>
</body>

</html>


