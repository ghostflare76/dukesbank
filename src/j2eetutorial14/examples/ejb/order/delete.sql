// Delete tables for Order application

ALTER TABLE LINEITEMS DROP CONSTRAINT fk_orderid;
ALTER TABLE BMP_ORDERS DROP CONSTRAINT pk_bmp_order;

DROP TABLE LINEITEMS;
DROP TABLE BMP_ORDERS;