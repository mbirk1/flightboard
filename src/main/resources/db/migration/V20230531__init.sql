CREATE
EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE tab_flight_manufacturer(
                                        id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
                                        manufacturer_name varchar
);
CREATE TABLE tab_flight_aircraft
(
    id           uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    registration varchar
);