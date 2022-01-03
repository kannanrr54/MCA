<html>
<head>
</head>
<body>
   
    <center>
        <form method="POST">
            <input type="text" name="user" placeholder="Username"><br>
            <input type="password" name="pass" placeholder="Password"><br>
            <input type="submit" name="s">
        </form>
        <?php
        if(isset($_POST["s"]))
        {
            $C1=preg_match("/[a-z]/",$_POST["pass"]);
            $C2=preg_match("/[A-Z]/",$_POST["pass"]);
            $C3=preg_match("/[0-9]/",$_POST["pass"]);
            if(!($C1 && $C2 && $C3) && !strlen($_POST["pass"])<8)
            {
                echo "Password not strong";
            }
            ?><br><?php
            if($_POST["user"]=="")
            {
                echo "Enter Username";
            }
            ?><br><?php
            if($_POST["pass"]=="")
            {
                echo "Enter Password";
            }
        }
    ?>
    </center>   
</body>
</html>