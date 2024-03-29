<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@page import="com.team2.DAO.EmployeeDAO"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Login </title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.5.0/mdb.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" data-auto-replace-svg="nest"></script>
<script src="http://code.jquery.com/jquery-3.2.1.slim.min.js"> </script>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;1,300;1,400&display=swap" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js" 
integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g==" 
crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet" href="css/gabutin.css">


</head>
<body>
    <div class="container">
        <div class="forms-container">
            <div class="signin-signup">


             <!--LOGIN form-->
                
                <form action="<%=request.getContextPath()%>/login" method="post" class="sign-in-form"> <!--ADD  "login" to WEB.XML in Spring-->
                    <h2 class="title">Sign in</h2>

                    <div class="input-field">
                        <i class ="fas fa-user-tie"></i>
                        <input type="text" placeholder="Username"  name="username" required>
                    </div>

                    <div class="input-field">
                        <i class ="fas fa-lock"></i>
                        <input type="password" placeholder="Password"  name="password" required id="myInput">
                        <!-- hide password-->
                        
                        <span class="eye" onclick="showPassword()">
                            <i id="hide1" class ="fa fa-eye"> </i>
                            <i id="hide2" class ="fa fa-eye-slash"> </i>
                             </span>
                        
                    </div>

                   
                    
                    <input type="submit" value="Submit" class="btn solid">

               
                </form>


                <!--Registration form-->


                <form action="employeedetails.jsp" class="sign-up-form"> <!--ADD  "register" to WEB.XML in Spring-->
                    <h2 class="title">Sign up</h2>


                    <div class="input-field">
                        <i class ="fas fa-user-alt"></i>
                        <input type="text" placeholder="First Name" name="firstName" required>
                    </div>

                    <div class="input-field">
                        <i class ="fas fa-user-alt"></i>
                        <input type="text" placeholder="Last Name" name="lastName" required>
                    </div>


                    <div class="input-field">
                        <i class ="fas fa-user-tie"></i>
                        <input type="text" placeholder="Username" name="username" required>
                    </div>

                    

                    <div class="input-field">
                        <i class ="fas fa-lock"></i>
                        <input type="password" placeholder="Password" name="password" required id="myInput2" pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}" title="Password must contain at least one number, one uppercase and lowercase letter and  special character, and at least 8 or more characters">
                        <!-- hide password-->
                        
                        <span class="eye" onclick="showPassword()">
                            <i id="hide1" class ="fa fa-eye"> </i>
                            <i id="hide2" class ="fa fa-eye-slash"> </i>
                             </span>
                    </div>


                    <div class="input-field">
                        <i class ="fas fa-map-marker"></i>
                        <input type="text" placeholder="Address" name="address">
                    </div>

                    <div class="input-field">
                        <i class ="fas fa-address-card"></i>
                        <input type="text" placeholder="Contact" name="contact" onkeypress="return onlyNumberKey(event)">
                    </div>
                    
                    <input type="submit" value="Sign up" class="btn solid">
   
                </form>


            </div>
        </div>
        

        <div class="panels-container">
            <div class="panel left-panel">
                <div class="content">
                    <h1> Welcome to E-Learning Website!</h1>
                    
                    <p>Click Here to Register</p>
                    <button class="btn transparent" id="sign-up-btn"> Sign up</button>
                </div>


                <img src="images/coding.svg" class="image" alt="">
            </div>
        

                <div class="panel right-panel">
                    <div class="content">
                        <h3>Already have an account?</h3>
                        <p>Click here to Login!</p>
                        <button class="btn transparent" id="sign-in-btn"> Sign in</button>
                    </div>
    
    
                    <img src="images/looking.svg" class="image" alt="">
                </div>

        </div>
    </div>


    <!--Javascript -->
        <script src="js/gabutin.js"> </script>
        
        <script>
    	function onlyNumberKey(evt) {
         
        // Only ASCII character in that range allowed
        var ASCIICode = (evt.which) ? evt.which : evt.keyCode
        if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
            return false;
        return true;
    	}
		</script>
		
		


    </body>
</html>