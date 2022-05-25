---HAVING
select a.num
from a
group by num
having sum(num) > 2;