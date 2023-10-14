INSERT INTO users (id, active, email, first_name, last_name, password)
VALUES
    (1, 1, 'to666ko90@abv.bg', 'Todor', 'Dimitrov', '1444bfaa5ccb16e930ac96a32a37f4e2961093f7c6d6ae60424a6520f65ae13aac86a4f117dd410fefb020f1e35b2c11');


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