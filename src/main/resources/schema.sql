CREATE DATABASE IF NOT EXISTS restaurant_reservation;
USE restaurant_reservation;

CREATE TABLE IF NOT EXISTS partner (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS store (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    description TEXT,
    partner_id BIGINT,
    FOREIGN KEY (partner_id) REFERENCES partner(id)
);

CREATE TABLE IF NOT EXISTS reservation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    reservation_time DATETIME NOT NULL,
    store_id BIGINT,
    user_id BIGINT,
    FOREIGN KEY (store_id) REFERENCES store(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE IF NOT EXISTS review (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content TEXT NOT NULL,
    created_at DATETIME NOT NULL,
    store_id BIGINT,
    user_id BIGINT,
    FOREIGN KEY (store_id) REFERENCES store(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);