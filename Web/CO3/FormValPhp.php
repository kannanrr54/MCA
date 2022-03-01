<html>
<head>
</head>
<body>
    <center>
        <div style="border: 1px solid black;width:40%;padding:20px">
        <form method="POST">
        <table>
						<tr>
							<td>Enter Name : </td>
							<td>
								<input type="text" placeholder="Name" name="user" />
							</td>
						</tr>
						<tr>
							<td>
								<p>Mobile Number :</p>
							</td>
							<td>
								<input type="text" placeholder="number" name="num" />
							</td>
						</tr>
						<tr>
							<td>
								<p>Email :</p>
							</td>
							<td>
								<input type="text" placeholder="Email" name="email" />
							</td>
						</tr>
						<tr>
							<td>
								<input type="text" placeholder="Username" name="user">
							</td>
							<td>
								<input type="text" placeholder="Password" name="pass">
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<center>
									<input type="submit" name="s">
								</center>
							</td>
						</tr>
					</table>
</form>
    
        <?php
        if(isset($_POST["s"]))
        {
            $con=mysqli_connect("localhost","root","","MCA");
            $error=0;
            $name=$_POST["user"];
            $username=$_POST["user"];
            $pass=$_POST["pass"];
            $num=$_POST["num"];
            $email=$_POST["email"];
            $C1=preg_match("/[a-z]/",$pass);
            $C2=preg_match("/[A-Z]/",$pass);
            $C3=preg_match("/[0-9]/",$pass);
            $C5=preg_match("/[0-9]/",$num);
            $C4=preg_match("/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/",$email);
            
            if(!($C1 && $C2 && $C3) && !strlen($pass)<8)
            {
                echo "Password not strong";
                $error=1;
            }
            ?>
					<br>
					<?php
            if(!($C5) && $num!="")
            {
                echo "Enter number only in Number field";
                $error=1;
            }
            if(strlen($num)!=10)
            {
                echo "Movbile number can only be 10 digits";
                $error=1;
            }
            ?>
						<br>
						<?php
            if(!($C4) && $email!="")
            {
                echo "Enter email in correct format";
                $error=1;
            }
            ?>
							<br>
							<?php
            if($username=="" || $pass=="" || $num=="" || $email=="" || $name=="")
            {
                echo "Enter all data";
                $error=1;
            }
        }
    ?>
    </center>   
</body>
</html>