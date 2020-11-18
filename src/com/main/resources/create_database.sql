select
    c.car_brand,
    c.id,
    c.model,
    c.`year`
from
    cars c;

    insert into cars (
    id,
    car_brand,
    model,
    `year`)
values (
    :id,
    :car_brand,
    :model,
    :year)
;





select
    t.brand,
    t.id,
    t.model,
    t.season,
    t.size,
    t.`year`
from
    tires t;
insert into tires (
    id,
    brand,
    model,
    season,
    size,
    `year`)
values (
    :id,
    :brand,
    :model,
    :season,
    :size,
    :year)
;



select
    ct.car_id,
    ct.id,
    ct.tire_id
from
    car_tires ct;
insert into car_tires (
    id,
    car_id,
    tire_id)
values (
    :id,
    :car_id,
    :tire_id)
;

cars:
id,car_brand,model,year
1,mercedes,"ml 350",2016
2,ford,"fusion USA",2018
3,vw,"touran 3",2019

tires:
id,brand,model,size,season,year
1,nokian,"nordman rs2","195/65 r15",winter,2020
2,michelin,"primacy 4","195/65 r15",summer,2020
3,nokian,"nordman rs2","205/60 r16",winter,2020
4,continental,"contipremiumcontact 5","205/60 r16",summer,2020
5,michelin,"pilot alpin pa5","265/45 R20",winter,2019
6,michelin,"latitude sport 3","265/45 R20",summer,2019

car_tires:
id,car_id,tire_id
1,1,1
2,1,2
3,2,3
4,2,4
5,3,5
6,3,6

S