CREATE
EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE tab_flight_manufacturer(
                                        id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
                                        manufacturer_name varchar
);
--CREATE TABLE tab_flight_model
--(
--    model_nr        uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
--    manufacturer    uuid,
--    builded_from    date,
--    builded_to      date,
--    pilot_seats     int,
--    passenger_seats int,
--    weight          float,
--    lenght          float,
--    height          float,
--    width           float,
--    FOREIGN KEY (manufacturer) REFERENCES tab_flight_manufacturer(id)
--);
--
CREATE TABLE tab_flight_aircraft
(
    id           uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    registration varchar
    -- builded      date,
    -- model        uuid,
    -- FOREIGN KEY (model) REFERENCES tab_flight_model (model_nr)
);