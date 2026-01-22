select
(select salary from Employee Group by salary order by salary desc limit 1, 1)
as SecondHighestSalary;