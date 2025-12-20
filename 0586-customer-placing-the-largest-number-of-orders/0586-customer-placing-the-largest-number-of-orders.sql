SELECT customer_number
 from Orders
  Group by customer_number
   ORDER BY COUNT(*) DESC
LIMIT 1;