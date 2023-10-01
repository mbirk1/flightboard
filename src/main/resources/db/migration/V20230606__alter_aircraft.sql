ALTER TABLE tab_flight_aircraft RENAME COLUMN registration TO model;
ALTER TABLE tab_flight_aircraft ADD COLUMN manufacturer varchar;
ALTER TABLE tab_flight_aircraft ADD COLUMN height double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN width double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN length double precision;
