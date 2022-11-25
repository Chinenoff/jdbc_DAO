--SELECT CUSTOMERS.name, ORDERS.product_name
--from CUSTOMERS
--         join ORDERS on CUSTOMERS.id = ORDERS.customer_id
--where name ~* 'alexey';

SELECT product_name
FROM ORDERS
WHERE customer_id IN
      (SELECT id
       FROM CUSTOMERS
       WHERE lower(name) = lower(:name));