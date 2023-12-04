ALTER TABLE tab_flight_aircraft RENAME COLUMN registration TO model;
ALTER TABLE tab_flight_aircraft ADD COLUMN manufacturer_id uuid;
ALTER TABLE tab_flight_aircraft ADD COLUMN height double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN width double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN length double precision;

INSERT INTO tab_flight_manufacturer (id, manufacturer_name) VALUES ('796be9af-f334-483b-91da-ea112b8beee8', 'Lufthansa');
INSERT INTO tab_flight_manufacturer (id, manufacturer_name) VALUES ('1ca953c2-f854-41c1-aff6-03c11744e1e6', 'Airbus');
