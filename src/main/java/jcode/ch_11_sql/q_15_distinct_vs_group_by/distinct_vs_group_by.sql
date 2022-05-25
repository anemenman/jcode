-- DISTINCT VS GROUP BY
select distinct a.name, a.num
from a;

select a.name, sum(a.num)
from a
group by a.name;

select a.num, a.name
from a
group by a.name, a.num;
