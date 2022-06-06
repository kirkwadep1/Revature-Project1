# Revature-Project1
 
This project implements spring boot, postman, and dbeaver. 
The goal of this project is to create the back-end of a online shopping cart for items to be stored in a database.

Funcionality:
 - login
 - logout
 - add items to user's cart (ADMIN or CUSTOMER)
 - create new items in the store (ADMIN)
 - create new users with permissions (ADMIN or CUSTOMER)

 Commands:
 - login
        POST localhost:8484/login
            {
            "userName": "tester1",
            "email": "test1@test.com"
            }
 - logout
        POST localhost:8484/logout

 - add items to user's cart (ADMIN or CUSTOMER)
 PUT localhost:8484/user/update/<userid here>
    {
        "userName": "tester1",
        "email": "test1@test.com",
        "country": "United States",
        "role": "ADMIN",
        "cart": {
            "cartId": 4,
            "total": 0.0,
            "itemList": [
                {
                    "itemId": 7,
                    "itemName": "tacos",
                    "inv": 100,
                    "price": 100
                },
                {
                    "itemId": 8,
                    "itemName": "nachos",
                    "inv": 100,
                    "price": 100
                }
            ]
        }
    }

 - create new items in the store (ADMIN)
 POST localhost:8484/item/add
    {
        "itemName": "pickles",
        "inv": 100,
        "price": 100
    }

 - create new users with permissions (ADMIN or CUSTOMER)
POST localhost:8484/user/register
    {
        "userName": "tester3",
        "email": "test3@test.com",
        "country": "United States",
        "role": "CUSTOMER"
    }
