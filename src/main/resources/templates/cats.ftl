<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Список котов</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
    </tr>
<#list cats as cat>
    <tr>
        <td>${cat.id}</td>
        <td>${cat.name}</td>
    </tr>
</#list>
</table>
<br/><br/>

<form method="post" action="cat">
    <h1>Add cat</h1>
    <p><input name="id" placeholder="Cat id ..."></p>

    <#--<p><label><input type="radio" name="name" value="Murzik"/>Мурзик</label></p>
    <p><label><input type="radio" name="name" value="Barsik"/>Барсик</label></p>
    <p><label><input type="radio" name="name" value="Murka"/>Мурка</label></p>-->

    <p><select name="name">
            <option value="Murzik">Murzik</option>             <#-- выпадающий список-->
            <option value="Barsik">Barsik</option>
            <option value="Murka">Murka</option>
        </select></p>


    <br/><br/>
    <input type="submit" value="Добавить кота">
</form>

</body>
</html>