INSERT INTO route (id, name, description)
VALUES
    (1,'Trasa miejska', 'Zwiedzanie zabytków miasta'),
    (2,'Trasa górska', 'Malownicza trasa przez góry'),
    (3,'Trasa leśna', 'Spacer po lesie'),
    (4,'Trasa przez park', 'Spacer parkiem');

INSERT INTO waypoint (id, name, description, lat, lng, route_id)
VALUES
    (1,'Rynek', 'Zabytkowy rynek miasta', 59.913868, 10.752245, 1),
    (2,'Zamek', 'Zabytkowy zamek królewski', 59.913079, 10.734346, 1),
    (3,'Wejście główne', 'Przy pomniku', 59.926444, 10.702843, 4),
    (4,'Fontana', 'opis fontany', 59.924936, 10.708058, 4);
