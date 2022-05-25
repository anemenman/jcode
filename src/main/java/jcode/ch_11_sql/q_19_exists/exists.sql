--EXISTS
select *
from a
where exists(select 1 from a where a.num = 10);