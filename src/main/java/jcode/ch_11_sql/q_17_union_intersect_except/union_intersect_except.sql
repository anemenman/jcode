---UNION,INTERSECT,EXCEPT
select * from a union select * from b union select * from c;
select * from a intersect select * from b;
select * from a except select * from b;