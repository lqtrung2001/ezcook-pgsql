<?xml version="1.0" encoding="UTF-8" ?>
<decorators defaultdir="/decorators">
    <excludes>
        <pattern>/404-page.html</pattern>
        <pattern>/ajax*</pattern>
        <pattern>/ckfinder*</pattern>
    </excludes>
    <decorator name="admin" page="admin.jsp">
        <pattern>/admin*</pattern>
    </decorator>
    <decorator name="login" page="login.jsp">
        <pattern>/login*</pattern>
    </decorator>
    <decorator name="web" page="web.jsp">
        <pattern>/*</pattern>
    </decorator>
</decorators>