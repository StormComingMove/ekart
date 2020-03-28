
insert into orders(address_id,date,date_of_delivery,order_no,payment,quantity,status,total_amt,product_id,customer_email_id)
values(1,'2011-03-12','2011-03-15',1,"PAYTM",2,"DELIVERED",16000.00,1,"kamesh@gmail.com");

insert into address (address_line_1,address_line_2,city,state,customer_email_id)
values ("006 shree palace","golahalli electronic city","banglore","karnataka","kamesh@gmail.com");
insert into address (address_line_1,address_line_2,city,state,customer_email_id)
values ("007 shree palace","golahalli electronic city","banglore","karnataka","ashish@gmail.com");
insert into address (address_line_1,address_line_2,city,state,customer_email_id)
values ("008 shree palace","golahalli electronic city","banglore","karnataka","dhananjay@gmail.com");


insert into cart(quantity,product_id,customer_email_id)
values(1,1,"kamesh@gmail.com");
insert into cart(quantity,product_id,customer_email_id)
values(2,2,"ashish@gmail.com");
insert into cart(quantity,product_id,customer_email_id)
values(3,3,"dhananjay@gmail.com");


insert into customer(email_id,name,password,phone_no)
values("kamesh@gmail.com","kamesh","Kamesh123",9309858322);
insert into customer(email_id,name,password,phone_no)
values("dhananjay@gmail.com","dhananjay","Dhananjay123",9309858323);
insert into customer(email_id,name,password,phone_no)
values("ashish@gmail.com","ashish","Ashish123",9309858324);

insert into seller(email_id,name,password,phone_no)
values("seller@gmail.com","seller","seller123","9085727650");


insert into product(brand,category,description,discount,name,price,seller_email_id)
values("mi","mobile","ek sada sa mobile hai",20.00,"note5 pro",10000.00,"seller@gmail.com");
insert into product(brand,category,description,discount,name,price,seller_email_id)
values("mi","mobile"," ek aur sada sa mobile hai",20.00,"note6 pro",12000.00,"seller@gmail.com");
insert into product(brand,category,description,discount,name,price,seller_email_id)
values("mi","mobile","mehanga hai",20.00,"note7 pro",14000.00,"seller@gmail.com");