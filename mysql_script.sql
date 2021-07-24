create table account(account_number integer primary key, account_name varchar(20), 
account_type varchar(20), balance_date Date, 
currency varchar(20), opening_availble_balance numeric(10,2));

insert into account values(535809209,'SGsavings756','Savings','08/11/2018','SGD',84327.51);
insert into account values(795809219,'AUsavings756','Savings','08/11/2018','AUD',88827.20);
insert into account values(535809609,'AUcurrent156','Current','08/11/2018','AUD',9999.51);
insert into account values(795809719,'SGCurrent256','Current','08/11/2018','SGD',78827.20);

create table account_transaction(transaction_id integer primary key,account_number integer,account_name varchar(20), value_date date, currency varchar(20),debit_amount numeric(10,2),credit_amount numeric(10,2),credit_debit varchar(20),transaction_narrative varchar(20), CONSTRAINT fk_transaction FOREIGN KEY(account_number) REFERENCES account(account_number));

insert into account_transaction values(1,535809209,'Debit Account','06/11/2018','SGD',200.51,null,'debit','debited transaction');
insert into account_transaction values(2,535809209,'Debit Account','06/11/2018','SGD',400.51,null,'debited transaction');
insert into account_transaction values(3,795809719,'Current Account','06/11/2018','SGD',null,200.51,'credit','credit transaction');
insert into account_transaction values(4,795809719,'Current Account','06/11/2018','SGD',null,400.51,'credit','credit transaction');