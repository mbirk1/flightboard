ALTER TABLE tab_flight_aircraft RENAME COLUMN registration TO model;
ALTER TABLE tab_flight_aircraft ADD COLUMN manufacturer varchar;
ALTER TABLE tab_flight_aircraft ADD COLUMN height double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN width double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN length double precision;


INSERT INTO tab_flight_manufacturer VALUES ('4278e6f0-6770-4255-962d-d13602355fa0', 'Lufthansa');