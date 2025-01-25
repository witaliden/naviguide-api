INSERT INTO route (name, description, start_lat, start_lng, end_lat, end_lng, estimated_time, distance)
VALUES
    ('Trasa górska', 'Malownicza trasa przez góry', 49.2982, 19.9545, 49.2320, 19.9287, 180, 12.5),
    ('Trasa miejska', 'Zwiedzanie zabytków miasta', 50.0647, 19.9450, 50.0617, 19.9376, 120, 5.0),
    ('Trasa leśna', 'Spacer po lesie', 50.1197, 19.8516, 50.1167, 19.8983, 90, 3.5);

INSERT INTO waypoint (name, description, latitude, longitude, order_number, route_id)
VALUES
    ('Punkt widokowy', 'Piękny widok na góry', 49.2800, 19.9400, 1, 1),
    ('Wodospad', 'Malowniczy wodospad górski', 49.2700, 19.9350, 2, 1),
    ('Rynek', 'Zabytkowy rynek miasta', 50.0617, 19.9373, 1, 2),
    ('Zamek', 'Średniowieczny zamek', 50.0544, 19.9360, 2, 2),
    ('Polana', 'Leśna polana z ławkami', 50.1180, 19.8600, 1, 3),
    ('Jezioro', 'Malownicze leśne jezioro', 50.1170, 19.8700, 2, 3);
