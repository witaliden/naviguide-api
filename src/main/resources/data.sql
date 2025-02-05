INSERT INTO route (id, name, description)
VALUES (1, 'Historyczne centrum', 'Zwiedzanie zabytków miasta'),
       (2, 'Trakt Cesarski',
        'Bielsko i Biała z epoki przedindustrialnej: ośrodek sukiennictwa na granicy śląsko-galicyjskiej, miasto rzemieślników i kupców, przystanek dyliżansów z Wiednia do Lwowa, zabytkowa zabudowa z XIX w.'),
       (3, 'Mały Wiedeń', 'Bielsko-Biała jako "Mały Wiedeń" ze względu na wpływy architektury wiedeńskiej.'),
       (4, 'Trasa przez park', 'Spacer parkiem');

INSERT INTO waypoint (id, name, description, lat, lng, route_id)
VALUES (1, 'Rynek', 'Zabytkowy rynek miasta', 49.821119726798344, 19.04276639898537, 1),
       (2, 'Zamek', 'Najstarsza i największa zabytkowa budowla w Bielsku.', 49.821936148147316, 19.044630840027313, 1),
       (3, 'Dom Tkacza', 'Muzeum historyczne', 49.820275070861534, 19.035306879624844, 1),
       (4, 'Katedra Św. Mikołaja', 'Jedyny kościół średniowieczny w Bielsku-Białej.', 49.82029979871076,
        19.042630738930402, 1),
       (5, 'Plac Bolesława Chrobrego', 'Centralny punkt Bielska-Białej z XIX w.', 49.822621393647395,
        19.044567498540207, 1),
       (6, 'Ulica Podcienie', 'Domy arkadowe z XVII-XIX w.', 49.82183519988235, 19.043493581624677, 1),
       (10, 'Trakt cesarski', 'Fragment traktu cesarskiego Wiedeń-Lwów z XVIII-XIX w.', 49.819075099231206,
        19.040454139848514, 2),
       (11, 'Magistrat miasta', 'Dawne budynki władz miasta z XIX-XX w.', 49.82027852574293, 19.040989981408863, 2),
       (12, 'Ratusz miasta', 'Budynek z XVII w., dawny ratusz i urząd celny.', 49.82177886093858, 19.050654751974328,
        2),
       (13, 'Plac Wojska Polskiego', 'Dawny rynek w Białej z XVIII w.', 49.82385608368074, 19.05103847767059, 2),
       (20, 'Poczta Główna', 'Neobarokowy gmach z XIX w.', 49.82098126342096, 19.045332605631668, 3),
       (21, 'Teatr', 'Dawny Teatr Miejski z XIX w.', 49.82095499724482, 19.045449554036438, 3),
       (22, 'Bazar zamkowy', 'Dawny bazar z XIX w.', 49.82163706447075, 19.04484952852772, 3),
       (23, 'Pomnik małego satyra', 'Fontanna "sikający diabełek".', 49.82179232320091, 19.044979478699478, 3),

       (30, 'Park Juliusza Słowackiego', 'Park miejski z alejkami, fontanną i pomnikiem Słowackiego.', 49.818528, 19.040172, 4),
       (31, 'Park Strzelniczy', 'Park z muszlą koncertową, placem zabaw i stawem.', 49.825917, 19.052550, 4);