<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>IPO Details</title>
    <link rel="stylesheet" href="CSS/style.css">
</head>

<body>
    <header class="header">
        <ul class="nav-bar">
            
            <li> <a href="importStockPage.html">Import Data</a></li>
            <li><a href="listCompanyDetails.html"  >Manage Company</a></li>
            <li><a href="listStockExchange.html">Manage Exchange</a></li>
            <li><a href="IPO.html"class="active">Update IPO details</a></li>
            <li style="float: right ;margin-right: 30px"><a href="#" id="logout-link">Logout</a></li>
        </ul>
        
    </header>

    <div class="main">

        <h1 style="text-align: center;line-height: 200px">Add IPO Plan</h1>
        <form style="margin-left: 750px">
                            <table>
                            <tr><td>CompanyCode:</td><td><input type="text" name="ccode" placeholder="Company Code"/></td></tr>
                            <tr><td>Stock exchange Name:</td><td><input type="text" name="IPO_Add" placeholder="Stock Exchange Name"/></td></tr>

                            <tr><td>Price pershare:</td><td><input type="text" name="IPO_Price" placeholder="Price_per_share"/></td></tr>
                            <tr><td>Total no of shares:</td><td><input type="text" name="IPO_Shares" placeholder="Total no of shares"/></td></tr>
                            <tr><td>Open date time:</td><td><input type="text" name="IPO_Date" placeholder="Open date time"/></td></tr>
                            <tr><td>Remarks:</td><td><input type="text" name="IPO_Remarks" placeholder="Remarks"/></td></tr>
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