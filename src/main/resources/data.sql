INSERT INTO users (id, active, email, first_name, last_name, password)
VALUES
    (1, 1, 'to666ko90@abv.bg', 'Todor', 'Dimitrov', '1444bfaa5ccb16e930ac96a32a37f4e2961093f7c6d6ae60424a6520f65ae13aac86a4f117dd410fefb020f1e35b2c11'),
    (2, 1, 'user@abv.bg', 'User', 'Userov', '1444bfaa5ccb16e930ac96a32a37f4e2961093f7c6d6ae60424a6520f65ae13aac86a4f117dd410fefb020f1e35b2c11');

INSERT INTO roles (`id`, `role`)
VALUES
    (1, 'ADMIN'),
    (2, 'USER');

INSERT INTO users_roles (`user_id`, `role_id`)
VALUES
    (1, 1),
    (1, 2),
    (2, 2);


INSERT INTO `brands` (`id`, `brand`)
VALUES
    (1, 'Toyota'),
    (2, 'Ford');

INSERT INTO `models` (`id`, `category`, `brand_id`, `name`)
VALUES
    (1, 'CAR', 1, 'Camry'),
    (2, 'CAR', 1, 'Corolla'),
    (3, 'CAR', 2, 'Focus'),
    (4, 'CAR', 2, 'Fiesta');