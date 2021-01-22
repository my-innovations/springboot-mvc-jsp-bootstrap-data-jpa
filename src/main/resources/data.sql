-- use springboot;

/*insert into `user`(`user_id`,`user_name`,`password`) values
('1', 'punya', 'punya'),
('2', 'lipu', 'lipu');*/


insert into role(id,name)values(1,'admin');
insert into user(id,email,full_name,mobile,password,user_id,user_name,role_id) values(1,'punya@gmail.com','punyasmruti nayak','9962428121','punya','punya','punya',1);
insert into address(id,address_line,city,country,pin_code,state,user_id) values(1,'guindy','chennai','india','600032','Tamilnadu',1);
commit;