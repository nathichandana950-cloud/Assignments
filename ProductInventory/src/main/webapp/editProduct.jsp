<html>
<body>

<h2>Edit Product</h2>

<form action="editProduct" method="post">
    <input type="hidden" name="id" value="${product.id}" />

    Name: <input type="text" name="name" value="${product.name}" /><br>
    Price: <input type="text" name="price" value="${product.price}" /><br>
    Quantity: <input type="text" name="quantity" value="${product.quantity}" /><br>
    Category: <input type="text" name="category" value="${product.category}" /><br>

    <input type="submit" value="Update Product">
</form>

</body>
</html>