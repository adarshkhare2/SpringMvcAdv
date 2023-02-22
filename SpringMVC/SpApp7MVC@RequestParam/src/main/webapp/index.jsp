<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div>
		<!-- Navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">SVP School</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">

					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> Courses </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">CBSE BOARD</a> <a
								class="dropdown-item" href="#">ICSE BOARD</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">STATE BOARD</a>
						</div></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> About us </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">About The School</a> <a
								class="dropdown-item" href="#">SVP Management</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Our Staff</a>
						</div></li>


					<li class="nav-item"><a class="nav-link disabled" href="#">Contact
							Us</a></li>


				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
	</div>



	<div>
		<!-- Page -->
		<div class="jumbotron text-center bg-info">
			<h1>HOME PAGE</h1>
			<p>Welcome to our Website</p>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<h3>Student Registration</h3>
					<p>Enter details here for Student ID</p>
					<a class="btn btn-info" href="UrlStudent">ForStudent</a>


				</div>
				<div class="col-sm-4">
					<h3>Teacher Registration</h3>
					<p>Enter details here for Teacher ID</p>
					<a class="btn btn-info" href="UrlTeacher">ForTeacher</a>

				</div>
				<div class="col-sm-4">
					<h3>Administrator Registration</h3>
					<p>Enter details here for Administrator Access</p>
					<a class="btn btn-info" href="UrlAdmin">ForAdmin</a>

				</div>
			</div>
		</div>
	</div>



</body>
</html>
