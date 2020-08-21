
/* Drop Tables */

DROP TABLE t_user CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE t_user
(
	user_id varchar2(20) NOT NULL,
	user_pw varchar2(128) NOT NULL,
	user_name varchar2(20) NOT NULL,
	PRIMARY KEY (user_id)
);

insert into t_user(user_id, user_pw, user_name)
values('next','33275a8aa48ea918bd53a9181aa975f15ab0d0645398f5918a006d08675c1cb27d5c645dbd084eee56e675e25ba4019f2ecea37ca9e2995b49fcb12c096a032e','신해철');

select * from t_user;

