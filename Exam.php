<html>
    <head>
        <style>
            div{
                width:45%;
                float:left;
                margin : 20px;
            }
            #n2{
                border:1px solid black;
                padding:10px;
                border-radius:5px;
                font-family:calibri;
            }
            input{
                border:1px solid black;
                padding:20px;
                border-radius:8px;
            }
            h1{
                font-family:calibri;
            }
        </style>
    </head>
<body>
    <div>
        <form method="POST">
            <center>
            <div style="width:90%"><h1>INSERT DATA</h1></div>
            <table>
                <tr>
                    <td><b>Employee Name : </b></td>
                    <td><input type="text" name="name" placeholder="Name" required=""></td>
                </tr>
                <tr>
                    <td><b>Employee Post : </b></td>
                    <td><input type="text" name="post" placeholder="Post" required=""></td>
                </tr>
                <tr>
                    <td><b>Employee Package : </b></td>
                    <td><input type="text" name="package" placeholder="Package" required=""></td>
                </tr>
                <tr>
                    <td colspan="2"><center><hr></center></td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="submit" name="submit"></center></td>
                </tr>
            </table>
        </form>
    <?php
    $con=mysqli_connect("localhost","root","","Exam");
    if(isset($_POST["submit"]))
    {
        $name=$_POST["name"];
        $post=$_POST["post"];
        $package=$_POST["package"];
        $q1="INSERT INTO employee(name,post,salary) VALUES('{$name}','{$post}','{$package}')";
        $execute1=mysqli_query($con,$q1);
        echo "<div style='width:100%'><h1>Inserted Successfully</h1></div>
                </div>
                <div><center><div style='width:100%'><h1>EMPLOYEE DETAILS</h1></div>";
        echo "<table >
                <tr>
                <th id='n2'>EMPLOYEE ID</th>
                <th id='n2'>EMPLOYEE NAME</th>
                <th id='n2'>EMPLOYEE POST</th>
                <th id='n2'>SALARY PACKAGE</th>
                </tr>";
        $q="select * from employee";
        $execute=mysqli_query($con,$q);
        while($result=mysqli_fetch_array($execute))
        {
            echo "<tr><td id='n2'>{$result['id']}</td>";
            echo "<td id='n2'>{$result['name']}</td>";
            echo "<td id='n2'>{$result['post']}</td>";
            echo "<td id='n2'>{$result['salary']}</td></tr>";
        }
        echo "</center></div>";
        }
    
    ?>
</body>    
</html>