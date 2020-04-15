insert into user(uuid, firstName,lastName) VALUES ('fb74d086-5a4a-11e7-907b-a6006ad3dba1', 'firstName', 'lastName');
insert into school(uuid,name) VALUES ('fb74d086-5a4a-11e7-907b-a6006ad3dba2', 'iut');
insert into cursus(uuid,name,duration) VALUES ('fb74d086-5a4a-11e7-907b-a6006ad3dba3', 'dut','2');
insert into cursus(school) SELECT uuid FROM school;
insert into schooling(uuid, enteringYear, exitingYear) VALUES ('fb74d086-5a4a-11e7-907b-a6006ad3dba4','2016','2018');
insert into schooling(user) SELECT uuid FROM user;
insert into schooling(cursus) SELECT uuid FROM cursus;