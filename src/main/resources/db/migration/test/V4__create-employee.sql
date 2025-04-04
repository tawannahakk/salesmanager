CREATE SEQUENCE employee_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE tb_employee(
    id BIGINT DEFAULT NEXT VALUE FOR employee_seq PRIMARY KEY,
    person_id BIGINT NOT NULL,
    supervisor_id BIGINT NULL,
    FOREIGN KEY (person_id) REFERENCES tb_person(id),
    FOREIGN KEY (supervisor_id) REFERENCES tb_employee(id)
);