
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <title>Fullscreen Responsive Register Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Oleo+Script:400,700'>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="logo span4">
                        <h1><a href="">iApp Register <span class="red">.</span></a></h1>
                    </div>
                    <div class="links span8">
                        <a class="home" href="" rel="tooltip" data-placement="bottom" data-original-title="Home"></a>
                        <a class="blog" href="" rel="tooltip" data-placement="bottom" data-original-title="Blog"></a>
                    </div>
                </div>
            </div>
        </div>

        <div class="register-container container">
            <div class="row">
                <div class="iphone span5">
                    <img src="assets/img/iphone.png" alt="">
                </div>
                <div class="register span6">
                    <form action="" method="post">
                        <h2>Order  <span class="red"><strong>Plz</strong></span></h2>
						<label for="mobileNo">Mobile No:</label>
                        <input type="text" id="mobileNo" name="mobileNo" placeholder="pls enter your mobile no..">
						<label for="email">Email</label>
                        <input type="text" id="email" name="email" placeholder="enter your email...">				
						<label for="lastname">Full Name</label>
                        <input type="text" id="fullname" name="fullname" placeholder="enter your full name...">
						
						<label for="day">Select City and Sub Area</label>
					<select class="form-control" id="city">
							<option>City1</option>
							<option>City1</option>							
							<option>City1</option>
						</select> 						
						
					<select class="form-control" id="city">
							<option>CityArea1</option>
							<option>CityArea1</option>							
							<option>CityArea1</option>
						</select> 	
						
						<div class="form-group">
							<label for="day">Select Order Type</label>
					<select class="form-control" id="min">
							<option>Order1</option>
							<option>Order2</option>							
							<option>Order3</option>
						</select> 
					<label for="Order Description">Order Description</label>
						 <textarea class="form-control" rows="3" id="desc" name="desc" placeholder="Enter order desc."></textarea>
	
					
													
                        <label for="Order LOcation">Order to be Served at :</label>
						 <textarea class="form-control" rows="3" id="location" name="location" placeholder="Enter order location."></textarea>
</div>
                       <div class="form-group">
							<label for="day">Select Preferred day:</label>
						<select class="form-control" id="day">
							<option>Today</option>
							<option>Tomorrow</option>
							<option>Day after Tomorrow</option>   
						</select>
						</div>
						<div class="form-group">
							<label for="day">Select Preferred Timing:</label>
						<select class="form-control" id="hr">
							<option>12</option>
							<option>13</option>							
						</select>
						.<select class="form-control" id="min">
							<option>00</option>
							<option>15</option>							
							<option>30</option>	
							<option>45</option>	
						</select>
					</div>

                       
                        <button type="submit">REGISTER</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>

