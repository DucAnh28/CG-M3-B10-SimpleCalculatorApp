<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<html>
<body>
<form method="post" action="/Calculator">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand: </td>
                <td ><input name="first" type="text" class="form-control"/></td>
            </tr>
            <tr>
                <td>Operator: </td>
                <td>
                    <select class="form-select" name="Operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand: </td>
                <td><input name="second" type="text" class="form-control"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate" class="btn btn-primary"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>