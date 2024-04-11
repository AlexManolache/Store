INSERT INTO role (id, name) VALUES (1, 'ADMIN');
INSERT INTO role (id, name) VALUES (2, 'USER');

INSERT INTO account (id, username, created_account) VALUES (1001, 'alexm', CURRENT_DATE());
INSERT INTO account (id, username, created_account) VALUES (1002, 'ralu', CURRENT_DATE());
INSERT INTO account (id, username, created_account) VALUES (1003, 'cata', CURRENT_DATE());

INSERT INTO account_role (account_id, role_id) VALUES (1001, 1);

INSERT INTO account_role (account_id, role_id) VALUES (1001, 2);


INSERT INTO account_role (account_id, role_id) VALUES (1002, 2);

INSERT INTO account_role (account_id, role_id) VALUES (1003, 2);
