 
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
            <%@ include file="header.jsp" %> 
        </head>
        <body>
        <h3 class="text-center">Welcome! Please login</h3>
            <form:form style="background-color:#1abc9c;margin:auto;padding:10%;width:50%;margin-top:10%;border:5px double gold"  
            id="loginForm" modelAttribute="login" action="loginProcess" method="post">
                
                <table align="center">
                
                    <tr>
                    
                        <td>
                            <form:label path="email">Username: </form:label>
                        </td>
                        <td>
                            <form:input required="required" path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password required="required" path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                            <h4>${message}</h4>
                             <h3>OR</h3>
                            <a href="/snapbook/register">Register</a>
                        </td>
                    </tr>
        
                </table>
            </form:form>
           
        </body>
        </html>
