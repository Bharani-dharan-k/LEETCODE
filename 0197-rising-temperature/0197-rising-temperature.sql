# Write your MySQL query statement below
select id from Weather w1 where exists (select id from Weather w2 where w1.temperature>w2.temperature and datediff(w1.recordDate,w2.recordDate) = 1);