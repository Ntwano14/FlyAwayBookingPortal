<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add a new Flight - FlyAway Airlines</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
    </style>
</head>

<body>

</div>
<div class="container">
    <h2 align="center"><span><strong>Add a new Flight</strong></span></h2>
    <br>
    <form action="AddFlightServlet" method="post">
            <input type="hidden" name="operation" value="addFlight">
            Source: <input type="text" name="source">
            Destination: <input type="text" name="destination">
            Airline: <input type="text" name="airline">
            Ticket Price: <input type="text" name="ticketPrice">
            <input type="submit" value="Add Flight">
        </form>
</div>
</body>
</html>
