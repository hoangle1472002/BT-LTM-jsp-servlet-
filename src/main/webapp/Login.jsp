<%@page import="model.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Managed Student System</title>
<style>
html {
    min-height: 100%;
    margin: 0;
}
body {
    margin: 0;
    box-sizing: border-box;
}
.page {
  background: #6bd9a0;
  display: flex;
  flex-direction: column;
  height: 100%;
  position: absolute;
  place-content: center;
  width: 100%;
}
.container {
  display: flex;
  height: 320px;
  margin: 0 auto;
  width: 640px;
}
.left {
  background: white;
  height: calc(100% - 40px);
  top: 20px;
  position: relative;
  width: 50%;
}
.login {
  font-size: 50px;
  font-weight: 900;
  margin: 50px 40px 40px;
}
.eula {
  color: #999;
  font-size: 14px;
  line-height: 1.5;
  margin: 40px;
}
.tag-a{
    text-decoration: none;
    color : green;
}
.right {
  background: #474A59;
  box-shadow: 0px 0px 40px 16px rgba(0,0,0,0.22);
  color: #F1F1F2;
  position: relative;
  width: 50%;
}

svg {
  position: absolute;
  width: 320px;
}
path {
  fill: none;
  stroke: url(#linearGradient);;
  stroke-width: 4;
  stroke-dasharray: 240 1386;
}
.form {
  margin: 40px;
  position: absolute;
}
label {
  color:  #c2c2c5;
  display: block;
  font-size: 14px;
  height: 16px;
  margin-top: 20px;
  margin-bottom: 5px;
}
input {
  background: transparent;
  border: 0;
  color: #f2f2f2;
  font-size: 20px;
  height: 30px;
  line-height: 30px;
  outline: none !important;
  border: 1px solid rgba(32, 185, 139, 0.5);
  width: 100%;
}
input::-moz-focus-inner { 
  border: 0; 
}
#submit {
  color: #6bd9a0;
  margin-top: 40px;
  transition: color 300ms;
}
#submit:focus {
  color: #f2f2f2;
}
#submit:active {
  color: #d0d0d2;
}
</style>
</head>
<body>
  <div class="page">
        <div class="container">
          <div class="left">
            <div class="login">Login</div>
            <div class="eula">To access my system you have to login.
                <div>
                    Regist account : <a class="tag-a" href="RegistSvServlet" >Here</a>
                </div>

            </div>
            
          </div>
          <div class="right">
            <svg viewBox="0 0 320 300">
              <defs>
                <linearGradient
                                inkscape:collect="always"
                                id="linearGradient"
                                x1="13"
                                y1="193.49992"
                                x2="307"
                                y2="193.49992"
                                gradientUnits="userSpaceOnUse">
                  <stop
                        style="stop-color:#ff00ff;"
                        offset="0"
                        id="stop876" />
                  <stop
                        style="stop-color:#ff0000;"
                        offset="1"
                        id="stop878" />
                </linearGradient>
              </defs>
              <path d="m 40,120.00016 239.99984,-3.2e-4 c 0,0 24.99263,0.79932 25.00016,35.00016 0.008,34.20084 -25.00016,35 -25.00016,35 h -239.99984 c 0,-0.0205 -25,4.01348 -25,38.5 0,34.48652 25,38.5 25,38.5 h 215 c 0,0 20,-0.99604 20,-25 0,-24.00396 -20,-25 -20,-25 h -190 c 0,0 -20,1.71033 -20,25 0,24.00396 20,25 20,25 h 168.57143" />
            </svg>
            <form class="form" action="CheckLoginServlet" method="post">
              <label for="email">Username</label>
              <input type="text" id="email"  name="name">
              <label for="password">Password</label>
              <input type="password" id="password" name="pass">
              <input type="submit" id="submit" value="Login">
            </form>
          </div>
        </div>
      </div>
</body>
</html>