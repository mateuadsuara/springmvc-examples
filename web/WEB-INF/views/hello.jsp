<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Hello World!</h2>
<form>
    <select>
        <c:forEach var="country" items="${countries}">
            <option value="${country.getKey()}">${country.getValue()}</option>
        </c:forEach>
    </select>
</form>
</body>
</html>
