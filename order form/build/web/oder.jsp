<%-- 
    Document   : oder
    Created on : Dec 28, 2022, 12:06:38 PM
    Author     : THEVINDU RATHNAYAKA
--%>


<%@page import="java.util.Vector"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.text.NumberFormat"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Form</title>
    </head>
    
    
    <style media="screen">
        
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        
        body{
            margin: 0;
            background-image: url("sigiriya.jpg");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            font-family: sans-serif;
            font-weight: 100;
        }
        
        form{
            height: 510px;
            width :400px;
            background-color: purple;
            opacity: 0.7;
            position: absolute;
            transform: translate(-50%, -50%);
            top: 50%;
            left: 50%;
            border-radius: 10px;
            backdrop-filter: blur(10px);
            border: 2px solid rgba(255,255,255,0.1);
            box-shadow: 0 0 40px rgba(8,7,16,0.6);
            padding: 50px 35px;
           
        }
        
        form *{
            font-family: 'Poppins' ,sans-serif;
            color: #FE7F60;
            letter-spacing: 0.5px;
            outline: none;
            border: none;
            font-weight: bold;
            
        }
        
        form h3{
            font-size: 38px;
            font-weight: 500;
            line-height: 42px;
            text-align: center;
            color: #DAF000;
        }
        
        form h6{
            font-size: 25px;
            font-weight: 300;
            line-height: 42px;
            text-align: center;
            color: #ffffff;
        }
        
        
        </style>
   
    <body>
       
        <form>
            <%@page errorPage="oderform" import="java.text.NumberFormat"%>
            <h3> Your Order: </h3>
            
            <br>
            <br>
            
            <h6> Number Of Tees: 
                <%= request.getParameter("six")%> 
                <br>
                
                <%
                    Vector order =(Vector)request.getAttribute("order");
                    Enumeration e = order.elements();
                    out.println("Cost Of Tees:$" + e.nextElement());
                            %>
                            
                            <br>
                            <br>
                            
                 Number Of Hats: 
                 <%= request.getParameter("five") %>
                 <br>
                 <%
                     out.println("Cost Of Hats :$" + e.nextElement());
                     %>
                     
            </h6>
        </form>
    </body>
</html>
