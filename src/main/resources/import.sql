INSERT INTO tb_family (number_of_adults, number_of_kids, created_at, updated_at, contact_email, contact_phone, family_name) VALUES (2, 3, '2024-01-01T12:00:00Z', '2024-01-01T14:00:00Z', 'smith@gmail.com', '+1-400-165-3925', 'Smith');

INSERT INTO tb_family (number_of_adults, number_of_kids, created_at, updated_at, contact_email, contact_phone, family_name) VALUES (4, 2, '2024-01-02T12:00:00Z', '2024-01-02T14:00:00Z', 'johnson@yahoo.com', '+1-687-313-1361', 'Johnson');

INSERT INTO tb_family (number_of_adults, number_of_kids, created_at, updated_at, contact_email, contact_phone, family_name) VALUES (3, 1, '2024-01-03T12:00:00Z', '2024-01-03T14:00:00Z', 'williams@example.com', '+1-574-545-7156', 'Williams');

INSERT INTO tb_family (number_of_adults, number_of_kids, created_at, updated_at, contact_email, contact_phone, family_name) VALUES (2, 4, '2024-01-04T12:00:00Z', '2024-01-04T14:00:00Z', 'brown@outlook.com', '+1-638-541-2917', 'Brown');

INSERT INTO tb_family (number_of_adults, number_of_kids, created_at, updated_at, contact_email, contact_phone, family_name) VALUES (1, 2, '2024-01-05T12:00:00Z', '2024-01-05T14:00:00Z', 'jones@gmail.com', '+1-923-679-4752', 'Jones');

INSERT INTO tb_home (family_id, created_at, update_at, address, city, state, zip_code, location) VALUES (1, '2024-01-01T12:00:00Z', '2024-01-01T14:00:00Z', '123 Main St', 'New York', 'NY', '10001', 'Urban');

INSERT INTO tb_home (family_id, created_at, update_at, address, city, state, zip_code, location) VALUES (2, '2024-01-02T12:00:00Z', '2024-01-02T14:00:00Z', '456 Elm St', 'Los Angeles', 'CA', '90001', 'Suburb');

INSERT INTO tb_home (family_id, created_at, update_at, address, city, state, zip_code, location) VALUES (3, '2024-01-03T12:00:00Z', '2024-01-03T14:00:00Z', '789 Oak Ave', 'Chicago', 'IL', '60601', 'Rural');

INSERT INTO tb_home (family_id, created_at, update_at, address, city, state, zip_code, location) VALUES (4, '2024-01-04T12:00:00Z', '2024-01-04T14:00:00Z', '101 Maple Dr', 'Houston', 'TX', '77001', 'Urban');

INSERT INTO tb_home (family_id, created_at, update_at, address, city, state, zip_code, location) VALUES (5, '2024-01-05T12:00:00Z', '2024-01-05T14:00:00Z', '202 Pine Rd', 'Miami', 'FL', '33101', 'Suburb');


INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (2431, '1967-03-11', '2024-01-02T12:00:00Z', '2024-01-02T14:00:00Z', 1, 'john.smith@example.com', 'John', 'Smith');
INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (2431, '1977-03-11', '2024-01-02T12:00:00Z', '2024-01-02T14:00:00Z', 1, 'mary.smith@example.com', 'Mary', 'Smith');

INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (1665, '1994-01-03', '2024-01-03T12:00:00Z', '2024-01-03T14:00:00Z', 2, 'emma.johnson@yahoo.com', 'Emma', 'Johnson');
INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (1665, '1984-01-03', '2024-01-03T12:00:00Z', '2024-01-03T14:00:00Z', 2, 'carl.johnson@yahoo.com', 'Carl', 'Johnson');


INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (2023, '1990-04-19', '2024-01-04T12:00:00Z', '2024-01-04T14:00:00Z', 3, 'sophia.williams@gmail.com', 'Sophia', 'Williams');

INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (1719, '1963-04-15', '2024-01-05T12:00:00Z', '2024-01-05T14:00:00Z',4, 'robert.brown@example.com', 'Robert', 'Brown');

INSERT INTO tb_person (calories, dob, created_at, updated_at, family_id, email, first_name, last_name) VALUES (1684, '1991-08-27', '2024-01-06T12:00:00Z', '2024-01-06T14:00:00Z', 5, 'sophia.jones@gmail.com', 'Sophia', 'Jones');

