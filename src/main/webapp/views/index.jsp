<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Welcome to SPRING MVC BOOT first project

    <form action="addAlien" method="POST">
            Enter your id save: <input type="text" name="aid">
            Enter your name : <input type="text" name="aname">
            <input type="submit">
    </form>
    <hr>
    <form action="getAlien" method="GET">
            Enter your id Find: <input type="text" name="aid">
            <input type="submit">
    </form>
 <hr>
    <form action="deleteAlien" method="DELETE">
            Enter your id DELETE: <input type="text" name="aid">
            <input type="submit">
    </form>
 <hr>
    <form action="getAlienByName" method="GET">
                Enter your Name: <input type="text" name="aname">
                <input type="submit">
        </form>

</body>
</html>