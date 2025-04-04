CREATE TABLE tb_person_address(
    person_id BIGINT NOT NULL,
    address_id BIGINT NOT NULL,
    PRIMARY KEY (person_id, address_id),
    FOREIGN KEY (person_id) REFERENCES tb_person(id),
    FOREIGN KEY (address_id) REFERENCES tb_address(id)
);