<!DOCTYPE html>
<html>
<head>
    <title>FlyAway</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body, h1, h2, h3, h4, h5, h6 {
            font-family: "Raleway", sans-serif;
        }

        body, html {
            height: 100%;
            line-height: 1.8;
            background-color: #87CEEB; /* Sky Blue Color */
        }

        .w3-bar .w3-button {
            padding: 16px;
        }

        .header-content {
            text-align: center;
            padding: 100px;
            color: white;
        }

        .button-container {
            text-align: center;
            margin-top: 50px;
        }

        .button-container a {
            text-decoration: none;
            margin: 0 20px;
            padding: 15px 40px;
            font-size: 20px;
            color: #fff;
            background-color: #4CAF50; /* Green button color */
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .button-container a:hover {
            background-color: #45a049; /* Darker green on hover */
        }

        .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #f5f5f5;
            color: #3b3b3b;
            text-align: center;
            padding: 10px 0;
        }
    </style>
</head>

<body>
    <div class="header-content">
        <h1>Welcome to FlyAway AirLine Booking Portal?</h1>
        <p>Book International Flight Tickets at best prices</p>
    </div>
    <div class="button-container">
        <a href="search-portal.jsp">Book Flights</a>
        <a href="login.jsp">Admin Login</a>
    </div>
    <div class="footer">
       FlyAway by Ntwanano Mathebula
    </div>
</body>
</html>
