<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css" />
</head>

<body>
    <nav>
        <div class="container1">
            <h1>Smart Lift</h1>
            <div class="menu">
                <a href="logs.jsp">Logs</a>
                <a href="removeRFID.jsp">Remove RFID</a>
                <a href="addRFID.jsp">Add RFID</a>
            </div>
        </div>
    </nav>
    <content>
        <div class="container2">
            <div class="title">Add User</div>
            <form action="AddUserServ" method="post">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">User Name</span>
                        <input type="text" name="username" placeholder="User Name"  required>
                    </div>
                    <div class="input-box">
                        <span class="details">RFID</span>
                        <input type="text" name="RFID" placeholder="RFID"  required>
                    </div>
                </div>
                <div class="button">
                    <input type="submit" value="SUBMIT">
                </div>
            </form>
        </div>
    </content>
</body>
</html>