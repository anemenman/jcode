-- inner join
select *
from a
         inner join b on a.num = b.num;
-- left join
select *
from a
         left join b on a.num = b.num;

-- right join
select *
from a
         right join b on a.num = b.num;

-- full join
select *
from a
         full join b on a.num = b.num;

-- cross join
select *
from a
         cross join b;
