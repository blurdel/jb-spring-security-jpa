-- users [passwords are both 'pass']
insert into user (id, username, password, active) values (1, 'user', '$2a$12$lbFYd0GyFdcUCwhjyjUVa.O5syxy1lIqUiiGw6z7BgMirdfDkPEt6', true);
insert into user (id, username, password, active) values (2, 'admin', '$2a$12$lbFYd0GyFdcUCwhjyjUVa.O5syxy1lIqUiiGw6z7BgMirdfDkPEt6', true);

-- roles
insert into role (id, name) values (1, 'USER');
insert into role (id, name) values (2, 'MAINTAINER');
insert into role (id, name) values (3, 'ADMIN');

-- user_role
insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 3);
