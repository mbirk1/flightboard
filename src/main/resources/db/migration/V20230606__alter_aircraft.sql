ALTER TABLE tab_flight_aircraft RENAME COLUMN registration TO model;
ALTER TABLE tab_flight_aircraft ADD COLUMN manufacturer varchar;
ALTER TABLE tab_flight_aircraft ADD COLUMN height double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN width double precision;
ALTER TABLE tab_flight_aircraft ADD COLUMN length double precision;

INSERT INTO tab_flight_aircraft (model, manufacturer, height, width, length) VALUES ('AFA161', 'Lufthansa', 12.0, 12.0, 12.0);
INSERT INTO tab_flight_aircraft (model, manufacturer, height, width, length) VALUES ('TB1312', 'Airbus', 12.0, 12.0, 12.0);