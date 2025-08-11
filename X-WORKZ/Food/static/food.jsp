<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Mobile Application</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="mobile.jsp">Mobile</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<form action ="mobile" method="post">
    <div class="mb-3">
        <label for="mobileId" class="form-label">Mobile Id</label>
        <input type="number" class="form-control" id="mobileId" name="mobileId">
    </div>
    <div class="mb-3">
        <label for="model" class="form-label">Model</label>
        <input type="text" class="form-control" id="model" name="model">
    </div>
    <div class="mb-3">
        <label for="brand" class="form-label">Brand</label>
        <input type="text" class="form-control" id="brand" name="brand">
    </div>
    <div class="mb-3">
        <label for="operatingSystem" class="form-label">Operating System</label>
        <input type="text" class="form-control" id="operatingSystem" name="operatingSystem">
    </div>
    <div class="mb-3">
        <label for="ramSize" class="form-label">Ram Size</label>
        <input type="number" class="form-control" id="ramSize" name="ramSize">
    </div>
    <div class="mb-3">
        <label for="storageCapacity" class="form-label">Storage Capacity</label>
        <input type="number" class="form-control" id="storageCapacity" name="storageCapacity">
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">Price</label>
        <input type="number" class="form-control" id="price" name="price">
    </div>
    <div class="mb-3">
        <label for="rating" class="form-label">Rating</label>
        <input type="number" class="form-control" id="rating" name="rating">
    </div>

    <div>
        <button type= "submit"> save </button>
    </div>
</form>
0000000000000000000000
<a href="mobile">View Details</a>
</body>
</html>


