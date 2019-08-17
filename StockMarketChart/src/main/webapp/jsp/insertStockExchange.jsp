<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Stock Exchange</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            
            <li> <a href="importStockPage.html">Import Data</a></li>
            <li><a href="listCompanyDetails.html" >Manage Company</a></li>
            <li><a href="listStockExchange.html" class="active">Manage Exchange</a></li>
            <li><a href="IPO.html">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">Create New Stock Exchange</h1>
        <form style="margin-left: 750px">
                            <table>
                            <tr><td>Stock Name:</td><td><input type="text" name="sname" placeholder="StockName"/></td></tr>
                            <tr><td>Contract Address:</td><td><input type="text" name="conadd" placeholder="Stock Exchange Name"/></td></tr>
                            <tr><td>Brief:</td><td><input type="text" name="sBrief" placeholder="Brief"/></td></tr>
                            <tr><td>Remarks:</td><td><input type="text" name="sremarks" placeholder="Remarks"/></td></tr>
                        <tr><td colspan="2" style="text-align: center"><input type="submit" value="Submit"/>
                        </td></tr>
                        </table>
                
                </form>
       
    </div>

    <footer class="footer">
        <p id="ftext">Copyright &copy: StockExchange 2019</p>
    </footer>
</body>

</html>
